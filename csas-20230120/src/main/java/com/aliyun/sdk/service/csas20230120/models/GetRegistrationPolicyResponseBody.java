// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
    private java.util.List<LimitDetail> limitDetail;

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
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<LimitDetail> getLimitDetail() {
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
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return whitelist
     */
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private java.util.List<LimitDetail> limitDetail; 
        private String matchMode; 
        private String name; 
        private String policyId; 
        private Long priority; 
        private String requestId; 
        private String status; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
        } 

        private Builder(GetRegistrationPolicyResponseBody model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.limitDetail = model.limitDetail;
            this.matchMode = model.matchMode;
            this.name = model.name;
            this.policyId = model.policyId;
            this.priority = model.priority;
            this.requestId = model.requestId;
            this.status = model.status;
            this.userGroupIds = model.userGroupIds;
            this.whitelist = model.whitelist;
        } 

        /**
         * <p>The time when the device registration policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条设备注册策略。</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The list of limit details of the device registration policy.</p>
         */
        public Builder limitDetail(java.util.List<LimitDetail> limitDetail) {
            this.limitDetail = limitDetail;
            return this;
        }

        /**
         * <p>The match mode of the policy. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: associated with all users.</li>
         * <li><strong>UserGroupNormal</strong>: associated with specific user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupAll</p>
         */
        public Builder matchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The name of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>registration_policy_name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-policy-dcbfd33cb004****</p>
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The priority of the device registration policy. The value 0 indicates the highest priority, and the value 99 indicates the lowest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>47363C2B-1AAA-5954-8847-0E50FCC54117</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the device registration policy. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The IDs of the user groups associated with the device registration policy. This parameter is valid when the match mode of the policy is <strong>UserGroupNormal</strong>.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The list of whitelisted users in the device registration policy.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public GetRegistrationPolicyResponseBody build() {
            return new GetRegistrationPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegistrationPolicyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LimitCount model) {
                this.all = model.all;
                this.mobile = model.mobile;
                this.pc = model.pc;
            } 

            /**
             * <p>The total device registration limit. This parameter is valid when the device registration limit type is <strong>LimitAll</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder all(Integer all) {
                this.all = all;
                return this;
            }

            /**
             * <p>The number of mobile logins allowed by the device registration limit. This parameter is valid when the device registration limit type is <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder mobile(Integer mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The number of PC logins allowed by the device registration limit. This parameter is valid when the device registration limit type is <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link GetRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegistrationPolicyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LimitDetail model) {
                this.deviceBelong = model.deviceBelong;
                this.limitCount = model.limitCount;
                this.limitType = model.limitType;
            } 

            /**
             * <p>The ownership of the device. Valid values:</p>
             * <ul>
             * <li><strong>Company</strong>: company-owned device.</li>
             * <li><strong>Personal</strong>: personal device.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Personal</p>
             */
            public Builder deviceBelong(String deviceBelong) {
                this.deviceBelong = deviceBelong;
                return this;
            }

            /**
             * <p>The device registration limit count.</p>
             */
            public Builder limitCount(LimitCount limitCount) {
                this.limitCount = limitCount;
                return this;
            }

            /**
             * <p>The type of the device registration limit. Valid values:</p>
             * <ul>
             * <li><strong>Unlimited</strong>: no limit.</li>
             * <li><strong>LimitAll</strong>: limit by total count.</li>
             * <li><strong>LimitDiff</strong>: limit by terminal category.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LimitDiff</p>
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
