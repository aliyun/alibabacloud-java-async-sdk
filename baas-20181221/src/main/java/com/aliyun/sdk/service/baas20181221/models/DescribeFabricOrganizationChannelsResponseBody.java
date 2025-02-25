// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationChannelsResponseBody</p>
 */
public class DescribeFabricOrganizationChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFabricOrganizationChannelsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricOrganizationChannelsResponseBody create() {
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
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
        public Builder result(java.util.List < Result> result) {
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

        public DescribeFabricOrganizationChannelsResponseBody build() {
            return new DescribeFabricOrganizationChannelsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchTimeout")
        private Integer batchTimeout;

        @com.aliyun.core.annotation.NameInMap("BlockCount")
        private Integer blockCount;

        @com.aliyun.core.annotation.NameInMap("ChaincodeCount")
        private Integer chaincodeCount;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("ConsortiumId")
        private String consortiumId;

        @com.aliyun.core.annotation.NameInMap("ConsortiumName")
        private String consortiumName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeleteTime")
        private String deleteTime;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("MaxMessageCount")
        private Integer maxMessageCount;

        @com.aliyun.core.annotation.NameInMap("MemberCount")
        private Integer memberCount;

        @com.aliyun.core.annotation.NameInMap("OwnerBid")
        private String ownerBid;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("PreferredMaxBytes")
        private Integer preferredMaxBytes;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SupportChannelConfig")
        private Boolean supportChannelConfig;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.batchTimeout = builder.batchTimeout;
            this.blockCount = builder.blockCount;
            this.chaincodeCount = builder.chaincodeCount;
            this.channelId = builder.channelId;
            this.channelName = builder.channelName;
            this.consortiumId = builder.consortiumId;
            this.consortiumName = builder.consortiumName;
            this.createTime = builder.createTime;
            this.deleteTime = builder.deleteTime;
            this.deleted = builder.deleted;
            this.maxMessageCount = builder.maxMessageCount;
            this.memberCount = builder.memberCount;
            this.ownerBid = builder.ownerBid;
            this.ownerName = builder.ownerName;
            this.ownerUid = builder.ownerUid;
            this.preferredMaxBytes = builder.preferredMaxBytes;
            this.requestId = builder.requestId;
            this.state = builder.state;
            this.supportChannelConfig = builder.supportChannelConfig;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return batchTimeout
         */
        public Integer getBatchTimeout() {
            return this.batchTimeout;
        }

        /**
         * @return blockCount
         */
        public Integer getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return chaincodeCount
         */
        public Integer getChaincodeCount() {
            return this.chaincodeCount;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return consortiumName
         */
        public String getConsortiumName() {
            return this.consortiumName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleteTime
         */
        public String getDeleteTime() {
            return this.deleteTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return maxMessageCount
         */
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        /**
         * @return memberCount
         */
        public Integer getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return ownerBid
         */
        public String getOwnerBid() {
            return this.ownerBid;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return preferredMaxBytes
         */
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return supportChannelConfig
         */
        public Boolean getSupportChannelConfig() {
            return this.supportChannelConfig;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Integer batchTimeout; 
            private Integer blockCount; 
            private Integer chaincodeCount; 
            private String channelId; 
            private String channelName; 
            private String consortiumId; 
            private String consortiumName; 
            private String createTime; 
            private String deleteTime; 
            private Boolean deleted; 
            private Integer maxMessageCount; 
            private Integer memberCount; 
            private String ownerBid; 
            private String ownerName; 
            private Long ownerUid; 
            private Integer preferredMaxBytes; 
            private String requestId; 
            private String state; 
            private Boolean supportChannelConfig; 
            private String updateTime; 

            /**
             * BatchTimeout.
             */
            public Builder batchTimeout(Integer batchTimeout) {
                this.batchTimeout = batchTimeout;
                return this;
            }

            /**
             * BlockCount.
             */
            public Builder blockCount(Integer blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * ChaincodeCount.
             */
            public Builder chaincodeCount(Integer chaincodeCount) {
                this.chaincodeCount = chaincodeCount;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
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
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
                return this;
            }

            /**
             * ConsortiumName.
             */
            public Builder consortiumName(String consortiumName) {
                this.consortiumName = consortiumName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeleteTime.
             */
            public Builder deleteTime(String deleteTime) {
                this.deleteTime = deleteTime;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * MaxMessageCount.
             */
            public Builder maxMessageCount(Integer maxMessageCount) {
                this.maxMessageCount = maxMessageCount;
                return this;
            }

            /**
             * MemberCount.
             */
            public Builder memberCount(Integer memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            /**
             * OwnerBid.
             */
            public Builder ownerBid(String ownerBid) {
                this.ownerBid = ownerBid;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * PreferredMaxBytes.
             */
            public Builder preferredMaxBytes(Integer preferredMaxBytes) {
                this.preferredMaxBytes = preferredMaxBytes;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * SupportChannelConfig.
             */
            public Builder supportChannelConfig(Boolean supportChannelConfig) {
                this.supportChannelConfig = supportChannelConfig;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
