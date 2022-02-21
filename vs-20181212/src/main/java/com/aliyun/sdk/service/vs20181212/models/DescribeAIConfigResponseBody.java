// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIConfigResponseBody</p>
 */
public class DescribeAIConfigResponseBody extends TeaModel {
    @NameInMap("AIConfig")
    private AIConfig AIConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAIConfigResponseBody(Builder builder) {
        this.AIConfig = builder.AIConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIConfig
     */
    public AIConfig getAIConfig() {
        return this.AIConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIConfig AIConfig; 
        private String requestId; 

        /**
         * AIConfig.
         */
        public Builder AIConfig(AIConfig AIConfig) {
            this.AIConfig = AIConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIConfigResponseBody build() {
            return new DescribeAIConfigResponseBody(this);
        } 

    } 

    public static class AIConfig extends TeaModel {
        @NameInMap("CaptureInterval")
        private Integer captureInterval;

        @NameInMap("Configs")
        private String configs;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Features")
        private String features;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private AIConfig(Builder builder) {
            this.captureInterval = builder.captureInterval;
            this.configs = builder.configs;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.features = builder.features;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIConfig create() {
            return builder().build();
        }

        /**
         * @return captureInterval
         */
        public Integer getCaptureInterval() {
            return this.captureInterval;
        }

        /**
         * @return configs
         */
        public String getConfigs() {
            return this.configs;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return features
         */
        public String getFeatures() {
            return this.features;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer captureInterval; 
            private String configs; 
            private String description; 
            private Long endTime; 
            private String features; 
            private Long instanceId; 
            private String instanceType; 
            private Long startTime; 
            private String status; 

            /**
             * CaptureInterval.
             */
            public Builder captureInterval(Integer captureInterval) {
                this.captureInterval = captureInterval;
                return this;
            }

            /**
             * Configs.
             */
            public Builder configs(String configs) {
                this.configs = configs;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(String features) {
                this.features = features;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AIConfig build() {
                return new AIConfig(this);
            } 

        } 

    }
}
