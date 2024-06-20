// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChaincodeDefinitionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricChaincodeDefinitionTaskResponseBody</p>
 */
public class DescribeFabricChaincodeDefinitionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFabricChaincodeDefinitionTaskResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChaincodeDefinitionTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFabricChaincodeDefinitionTaskResponseBody build() {
            return new DescribeFabricChaincodeDefinitionTaskResponseBody(this);
        } 

    } 

    public static class ChaincodeDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChaincodePackageId")
        private String chaincodePackageId;

        @com.aliyun.core.annotation.NameInMap("CollectionConfig")
        private String collectionConfig;

        @com.aliyun.core.annotation.NameInMap("EndorsementPolicy")
        private String endorsementPolicy;

        @com.aliyun.core.annotation.NameInMap("InitRequired")
        private Boolean initRequired;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Long sequence;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ChaincodeDefinition(Builder builder) {
            this.chaincodePackageId = builder.chaincodePackageId;
            this.collectionConfig = builder.collectionConfig;
            this.endorsementPolicy = builder.endorsementPolicy;
            this.initRequired = builder.initRequired;
            this.name = builder.name;
            this.sequence = builder.sequence;
            this.uid = builder.uid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChaincodeDefinition create() {
            return builder().build();
        }

        /**
         * @return chaincodePackageId
         */
        public String getChaincodePackageId() {
            return this.chaincodePackageId;
        }

        /**
         * @return collectionConfig
         */
        public String getCollectionConfig() {
            return this.collectionConfig;
        }

        /**
         * @return endorsementPolicy
         */
        public String getEndorsementPolicy() {
            return this.endorsementPolicy;
        }

        /**
         * @return initRequired
         */
        public Boolean getInitRequired() {
            return this.initRequired;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sequence
         */
        public Long getSequence() {
            return this.sequence;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String chaincodePackageId; 
            private String collectionConfig; 
            private String endorsementPolicy; 
            private Boolean initRequired; 
            private String name; 
            private Long sequence; 
            private String uid; 
            private String version; 

            /**
             * ChaincodePackageId.
             */
            public Builder chaincodePackageId(String chaincodePackageId) {
                this.chaincodePackageId = chaincodePackageId;
                return this;
            }

            /**
             * CollectionConfig.
             */
            public Builder collectionConfig(String collectionConfig) {
                this.collectionConfig = collectionConfig;
                return this;
            }

            /**
             * EndorsementPolicy.
             */
            public Builder endorsementPolicy(String endorsementPolicy) {
                this.endorsementPolicy = endorsementPolicy;
                return this;
            }

            /**
             * InitRequired.
             */
            public Builder initRequired(Boolean initRequired) {
                this.initRequired = initRequired;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(Long sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ChaincodeDefinition build() {
                return new ChaincodeDefinition(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChaincodeDefinition")
        private ChaincodeDefinition chaincodeDefinition;

        private Content(Builder builder) {
            this.chaincodeDefinition = builder.chaincodeDefinition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return chaincodeDefinition
         */
        public ChaincodeDefinition getChaincodeDefinition() {
            return this.chaincodeDefinition;
        }

        public static final class Builder {
            private ChaincodeDefinition chaincodeDefinition; 

            /**
             * ChaincodeDefinition.
             */
            public Builder chaincodeDefinition(ChaincodeDefinition chaincodeDefinition) {
                this.chaincodeDefinition = chaincodeDefinition;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Approvers")
        private java.util.List < String > approvers;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.approvers = builder.approvers;
            this.channelName = builder.channelName;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return approvers
         */
        public java.util.List < String > getApprovers() {
            return this.approvers;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > approvers; 
            private String channelName; 
            private Content content; 
            private Long createTime; 
            private String creator; 
            private String description; 
            private String status; 
            private String taskId; 
            private String type; 

            /**
             * Approvers.
             */
            public Builder approvers(java.util.List < String > approvers) {
                this.approvers = approvers;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
