// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link LoggingEnabled} extends {@link TeaModel}
 *
 * <p>LoggingEnabled</p>
 */
public class LoggingEnabled extends TeaModel {
    @NameInMap("TargetBucket")
    @Validation(required = true)
    private String targetBucket;

    @NameInMap("TargetPrefix")
    private String targetPrefix;

    private LoggingEnabled(Builder builder) {
        this.targetBucket = builder.targetBucket;
        this.targetPrefix = builder.targetPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoggingEnabled create() {
        return builder().build();
    }

    /**
     * @return targetBucket
     */
    public String getTargetBucket() {
        return this.targetBucket;
    }

    /**
     * @return targetPrefix
     */
    public String getTargetPrefix() {
        return this.targetPrefix;
    }

    public static final class Builder {
        private String targetBucket; 
        private String targetPrefix; 

        /**
         * 存储访问日志的存储空间
         */
        public Builder targetBucket(String targetBucket) {
            this.targetBucket = targetBucket;
            return this;
        }

        /**
         * 保存的日志文件前缀
         */
        public Builder targetPrefix(String targetPrefix) {
            this.targetPrefix = targetPrefix;
            return this;
        }

        public LoggingEnabled build() {
            return new LoggingEnabled(this);
        } 

    } 

}
