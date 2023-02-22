// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EtlTriggerConfig} extends {@link TeaModel}
 *
 * <p>EtlTriggerConfig</p>
 */
public class EtlTriggerConfig extends TeaModel {
    @NameInMap("maxRetryTime")
    @Validation(required = true)
    private Integer maxRetryTime;

    @NameInMap("roleArn")
    @Validation(required = true)
    private String roleArn;

    @NameInMap("startingPosition")
    private String startingPosition;

    @NameInMap("startingUnixtime")
    private Long startingUnixtime;

    @NameInMap("triggerInterval")
    @Validation(required = true)
    private Integer triggerInterval;

    private EtlTriggerConfig(Builder builder) {
        this.maxRetryTime = builder.maxRetryTime;
        this.roleArn = builder.roleArn;
        this.startingPosition = builder.startingPosition;
        this.startingUnixtime = builder.startingUnixtime;
        this.triggerInterval = builder.triggerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EtlTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return maxRetryTime
     */
    public Integer getMaxRetryTime() {
        return this.maxRetryTime;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return startingPosition
     */
    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * @return startingUnixtime
     */
    public Long getStartingUnixtime() {
        return this.startingUnixtime;
    }

    /**
     * @return triggerInterval
     */
    public Integer getTriggerInterval() {
        return this.triggerInterval;
    }

    public static final class Builder {
        private Integer maxRetryTime; 
        private String roleArn; 
        private String startingPosition; 
        private Long startingUnixtime; 
        private Integer triggerInterval; 

        /**
         * 最大重试次数
         */
        public Builder maxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }

        /**
         * roleArn
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * 开始位置
         */
        public Builder startingPosition(String startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }

        /**
         * 起始时间
         */
        public Builder startingUnixtime(Long startingUnixtime) {
            this.startingUnixtime = startingUnixtime;
            return this;
        }

        /**
         * 触犯间隔
         */
        public Builder triggerInterval(Integer triggerInterval) {
            this.triggerInterval = triggerInterval;
            return this;
        }

        public EtlTriggerConfig build() {
            return new EtlTriggerConfig(this);
        } 

    } 

}
