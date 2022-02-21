// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIConfigListResponseBody</p>
 */
public class DescribeAIConfigListResponseBody extends TeaModel {
    @NameInMap("AIConfigList")
    private AIConfigList AIConfigList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAIConfigListResponseBody(Builder builder) {
        this.AIConfigList = builder.AIConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIConfigListResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIConfigList
     */
    public AIConfigList getAIConfigList() {
        return this.AIConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIConfigList AIConfigList; 
        private String requestId; 

        /**
         * AIConfigList.
         */
        public Builder AIConfigList(AIConfigList AIConfigList) {
            this.AIConfigList = AIConfigList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIConfigListResponseBody build() {
            return new DescribeAIConfigListResponseBody(this);
        } 

    } 

    public static class AIConfigListAIConfigList extends TeaModel {
        @NameInMap("CaptureInterval")
        private Integer captureInterval;

        @NameInMap("ConfigId")
        private String configId;

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

        private AIConfigListAIConfigList(Builder builder) {
            this.captureInterval = builder.captureInterval;
            this.configId = builder.configId;
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

        public static AIConfigListAIConfigList create() {
            return builder().build();
        }

        /**
         * @return captureInterval
         */
        public Integer getCaptureInterval() {
            return this.captureInterval;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
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
            private String configId; 
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
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
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

            public AIConfigListAIConfigList build() {
                return new AIConfigListAIConfigList(this);
            } 

        } 

    }
    public static class AIConfigList extends TeaModel {
        @NameInMap("AIConfigList")
        private java.util.List < AIConfigListAIConfigList> AIConfigList;

        private AIConfigList(Builder builder) {
            this.AIConfigList = builder.AIConfigList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIConfigList create() {
            return builder().build();
        }

        /**
         * @return AIConfigList
         */
        public java.util.List < AIConfigListAIConfigList> getAIConfigList() {
            return this.AIConfigList;
        }

        public static final class Builder {
            private java.util.List < AIConfigListAIConfigList> AIConfigList; 

            /**
             * AIConfigList.
             */
            public Builder AIConfigList(java.util.List < AIConfigListAIConfigList> AIConfigList) {
                this.AIConfigList = AIConfigList;
                return this;
            }

            public AIConfigList build() {
                return new AIConfigList(this);
            } 

        } 

    }
}
