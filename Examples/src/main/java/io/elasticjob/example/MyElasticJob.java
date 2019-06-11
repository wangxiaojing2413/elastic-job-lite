package io.elasticjob.example;

import io.elasticjob.lite.api.ShardingContext;
import io.elasticjob.lite.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyElasticJob implements SimpleJob {
    Logger log = LoggerFactory.getLogger(MyElasticJob.class);
    
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                log.error("sahrd:" + context.getShardingItem());
                break;
            case 1:
                log.error("sahrd:" + context.getShardingItem());
                break;
            case 2:
                log.error("sahrd:" + context.getShardingItem());
                break;
            // case n: ...
        }
    }
}