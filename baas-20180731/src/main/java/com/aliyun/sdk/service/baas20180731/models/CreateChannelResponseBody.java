// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChannelResponseBody</p>
 */
public class CreateChannelResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private CreateChannelResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChannelResponseBody create() {
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

        public CreateChannelResponseBody build() {
            return new CreateChannelResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("BatchTimeout")
        private Integer batchTimeout;

        @NameInMap("BlockCount")
        private Integer blockCount;

        @NameInMap("ChaincodeCount")
        private Integer chaincodeCount;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("ConsortiumId")
        private String consortiumId;

        @NameInMap("ConsortiumName")
        private String consortiumName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MaxMessageCount")
        private Integer maxMessageCount;

        @NameInMap("MemberCount")
        private Integer memberCount;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerBid")
        private String ownerBid;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("OwnerUid")
        private Integer ownerUid;

        @NameInMap("PreferredMaxBytes")
        private Integer preferredMaxBytes;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("State")
        private String state;

        @NameInMap("SupportConfig")
        private Boolean supportConfig;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.batchTimeout = builder.batchTimeout;
            this.blockCount = builder.blockCount;
            this.chaincodeCount = builder.chaincodeCount;
            this.channelId = builder.channelId;
            this.consortiumId = builder.consortiumId;
            this.consortiumName = builder.consortiumName;
            this.createTime = builder.createTime;
            this.maxMessageCount = builder.maxMessageCount;
            this.memberCount = builder.memberCount;
            this.name = builder.name;
            this.ownerBid = builder.ownerBid;
            this.ownerName = builder.ownerName;
            this.ownerUid = builder.ownerUid;
            this.preferredMaxBytes = builder.preferredMaxBytes;
            this.requestId = builder.requestId;
            this.state = builder.state;
            this.supportConfig = builder.supportConfig;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
        public Integer getOwnerUid() {
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
         * @return supportConfig
         */
        public Boolean getSupportConfig() {
            return this.supportConfig;
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
            private String consortiumId; 
            private String consortiumName; 
            private String createTime; 
            private Integer maxMessageCount; 
            private Integer memberCount; 
            private String name; 
            private String ownerBid; 
            private String ownerName; 
            private Integer ownerUid; 
            private Integer preferredMaxBytes; 
            private String requestId; 
            private String state; 
            private Boolean supportConfig; 
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
            public Builder ownerUid(Integer ownerUid) {
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
             * SupportConfig.
             */
            public Builder supportConfig(Boolean supportConfig) {
                this.supportConfig = supportConfig;
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
