// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegistrationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegistrationPolicyResponseBody</p>
 */
public class GetRegistrationPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("LimitDetail")
    private java.util.List < LimitDetail> limitDetail;

    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List < String > userGroupIds;

    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List < String > whitelist;

    private GetRegistrationPolicyResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.limitDetail = builder.limitDetail;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.policyId = builder.policyId;
        this.priority = builder.priority;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegistrationPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return limitDetail
     */
    public java.util.List < LimitDetail> getLimitDetail() {
        return this.limitDetail;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
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
     * @return userGroupIds
     */
    public java.util.List < String > getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return whitelist
     */
    public java.util.List < String > getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private java.util.List < LimitDetail> limitDetail; 
        private String matchMode; 
        private String name; 
        private String policyId; 
        private Long priority; 
        private String requestId; 
        private String status; 
        private java.util.List < String > userGroupIds; 
        private java.util.List < String > whitelist; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * LimitDetail.
         */
        public Builder limitDetail(java.util.List < LimitDetail> limitDetail) {
            this.limitDetail = limitDetail;
            return this;
        }

        /**
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.matchMode = matchMode;
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
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Long priority) {
            this.priority = priority;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * Whitelist.
         */
        public Builder whitelist(java.util.List < String > whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public GetRegistrationPolicyResponseBody build() {
            return new GetRegistrationPolicyResponseBody(this);
        } 

    } 

    public static class LimitCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("All")
        private Integer all;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private Integer mobile;

        @com.aliyun.core.annotation.NameInMap("PC")
        private Integer pc;

        private LimitCount(Builder builder) {
            this.all = builder.all;
            this.mobile = builder.mobile;
            this.pc = builder.pc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimitCount create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public Integer getAll() {
            return this.all;
        }

        /**
         * @return mobile
         */
        public Integer getMobile() {
            return this.mobile;
        }

        /**
         * @return pc
         */
        public Integer getPc() {
            return this.pc;
        }

        public static final class Builder {
            private Integer all; 
            private Integer mobile; 
            private Integer pc; 

            /**
             * All.
             */
            public Builder all(Integer all) {
                this.all = all;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(Integer mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * PC.
             */
            public Builder pc(Integer pc) {
                this.pc = pc;
                return this;
            }

            public LimitCount build() {
                return new LimitCount(this);
            } 

        } 

    }
    public static class LimitDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceBelong")
        private String deviceBelong;

        @com.aliyun.core.annotation.NameInMap("LimitCount")
        private LimitCount limitCount;

        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        private LimitDetail(Builder builder) {
            this.deviceBelong = builder.deviceBelong;
            this.limitCount = builder.limitCount;
            this.limitType = builder.limitType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimitDetail create() {
            return builder().build();
        }

        /**
         * @return deviceBelong
         */
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        /**
         * @return limitCount
         */
        public LimitCount getLimitCount() {
            return this.limitCount;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        public static final class Builder {
            private String deviceBelong; 
            private LimitCount limitCount; 
            private String limitType; 

            /**
             * DeviceBelong.
             */
            public Builder deviceBelong(String deviceBelong) {
                this.deviceBelong = deviceBelong;
                return this;
            }

            /**
             * LimitCount.
             */
            public Builder limitCount(LimitCount limitCount) {
                this.limitCount = limitCount;
                return this;
            }

            /**
             * LimitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            public LimitDetail build() {
                return new LimitDetail(this);
            } 

        } 

    }
}
