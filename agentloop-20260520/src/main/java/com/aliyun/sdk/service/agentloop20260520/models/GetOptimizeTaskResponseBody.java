// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOptimizeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetOptimizeTaskResponseBody</p>
 */
public class GetOptimizeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checkpoint")
    private java.util.Map<String, ?> checkpoint;

    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("nextTriggerTime")
    private String nextTriggerTime;

    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetOptimizeTaskResponseBody(Builder builder) {
        this.checkpoint = builder.checkpoint;
        this.config = builder.config;
        this.createTime = builder.createTime;
        this.nextTriggerTime = builder.nextTriggerTime;
        this.optimizeTaskName = builder.optimizeTaskName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOptimizeTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkpoint
     */
    public java.util.Map<String, ?> getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return nextTriggerTime
     */
    public String getNextTriggerTime() {
        return this.nextTriggerTime;
    }

    /**
     * @return optimizeTaskName
     */
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.Map<String, ?> checkpoint; 
        private java.util.Map<String, ?> config; 
        private String createTime; 
        private String nextTriggerTime; 
        private String optimizeTaskName; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String type; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetOptimizeTaskResponseBody model) {
            this.checkpoint = model.checkpoint;
            this.config = model.config;
            this.createTime = model.createTime;
            this.nextTriggerTime = model.nextTriggerTime;
            this.optimizeTaskName = model.optimizeTaskName;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.type = model.type;
            this.updateTime = model.updateTime;
        } 

        /**
         * checkpoint.
         */
        public Builder checkpoint(java.util.Map<String, ?> checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * config.
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * nextTriggerTime.
         */
        public Builder nextTriggerTime(String nextTriggerTime) {
            this.nextTriggerTime = nextTriggerTime;
            return this;
        }

        /**
         * optimizeTaskName.
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetOptimizeTaskResponseBody build() {
            return new GetOptimizeTaskResponseBody(this);
        } 

    } 

}
