// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumsResponseBody</p>
 */
public class DescribeFabricConsortiumsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFabricConsortiumsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricConsortiumsResponseBody create() {
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

        public DescribeFabricConsortiumsResponseBody build() {
            return new DescribeFabricConsortiumsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelCount")
        private Integer channelCount;

        @com.aliyun.core.annotation.NameInMap("ChannelPolicy")
        private String channelPolicy;

        @com.aliyun.core.annotation.NameInMap("CodeName")
        private String codeName;

        @com.aliyun.core.annotation.NameInMap("ConsortiumId")
        private String consortiumId;

        @com.aliyun.core.annotation.NameInMap("ConsortiumName")
        private String consortiumName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("MajorVersion")
        private String majorVersion;

        @com.aliyun.core.annotation.NameInMap("OrganizationCount")
        private Integer organizationCount;

        @com.aliyun.core.annotation.NameInMap("OwnerBid")
        private String ownerBid;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SupportChannelConfig")
        private Boolean supportChannelConfig;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Result(Builder builder) {
            this.channelCount = builder.channelCount;
            this.channelPolicy = builder.channelPolicy;
            this.codeName = builder.codeName;
            this.consortiumId = builder.consortiumId;
            this.consortiumName = builder.consortiumName;
            this.createTime = builder.createTime;
            this.domain = builder.domain;
            this.expiredTime = builder.expiredTime;
            this.majorVersion = builder.majorVersion;
            this.organizationCount = builder.organizationCount;
            this.ownerBid = builder.ownerBid;
            this.ownerName = builder.ownerName;
            this.ownerUid = builder.ownerUid;
            this.regionId = builder.regionId;
            this.requestId = builder.requestId;
            this.specName = builder.specName;
            this.state = builder.state;
            this.supportChannelConfig = builder.supportChannelConfig;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return channelCount
         */
        public Integer getChannelCount() {
            return this.channelCount;
        }

        /**
         * @return channelPolicy
         */
        public String getChannelPolicy() {
            return this.channelPolicy;
        }

        /**
         * @return codeName
         */
        public String getCodeName() {
            return this.codeName;
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return majorVersion
         */
        public String getMajorVersion() {
            return this.majorVersion;
        }

        /**
         * @return organizationCount
         */
        public Integer getOrganizationCount() {
            return this.organizationCount;
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
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Integer channelCount; 
            private String channelPolicy; 
            private String codeName; 
            private String consortiumId; 
            private String consortiumName; 
            private String createTime; 
            private String domain; 
            private String expiredTime; 
            private String majorVersion; 
            private Integer organizationCount; 
            private String ownerBid; 
            private String ownerName; 
            private Long ownerUid; 
            private String regionId; 
            private String requestId; 
            private String specName; 
            private String state; 
            private Boolean supportChannelConfig; 
            private java.util.List < Tags> tags; 

            /**
             * ChannelCount.
             */
            public Builder channelCount(Integer channelCount) {
                this.channelCount = channelCount;
                return this;
            }

            /**
             * ChannelPolicy.
             */
            public Builder channelPolicy(String channelPolicy) {
                this.channelPolicy = channelPolicy;
                return this;
            }

            /**
             * CodeName.
             */
            public Builder codeName(String codeName) {
                this.codeName = codeName;
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * MajorVersion.
             */
            public Builder majorVersion(String majorVersion) {
                this.majorVersion = majorVersion;
                return this;
            }

            /**
             * OrganizationCount.
             */
            public Builder organizationCount(Integer organizationCount) {
                this.organizationCount = organizationCount;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
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
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
