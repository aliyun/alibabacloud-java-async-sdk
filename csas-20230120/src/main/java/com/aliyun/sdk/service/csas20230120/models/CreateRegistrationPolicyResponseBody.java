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
 * {@link CreateRegistrationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRegistrationPolicyResponseBody</p>
 */
public class CreateRegistrationPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRegistrationPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRegistrationPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRegistrationPolicyResponseBody model) {
            this.policy = model.policy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The device registration policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FEF1144C-95D1-5F7C-81EF-9DB70EA49FCE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRegistrationPolicyResponseBody build() {
            return new CreateRegistrationPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRegistrationPolicyResponseBody</p>
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
             * <p>The total restriction count for device registration. This parameter takes effect only when LimitType is set to <strong>LimitAll</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder all(Integer all) {
                this.all = all;
                return this;
            }

            /**
             * <p>The restriction count for mobile logins. This parameter takes effect only when LimitType is set to <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder mobile(Integer mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The restriction count for PC logins. This parameter takes effect only when LimitType is set to <strong>LimitDiff</strong>.</p>
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
     * {@link CreateRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRegistrationPolicyResponseBody</p>
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
             * <li><p><strong>Company</strong>: Company device.</p>
             * </li>
             * <li><p><strong>Personal</strong>: Personal device.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Company</p>
             */
            public Builder deviceBelong(String deviceBelong) {
                this.deviceBelong = deviceBelong;
                return this;
            }

            /**
             * <p>The restriction count for device registration.</p>
             */
            public Builder limitCount(LimitCount limitCount) {
                this.limitCount = limitCount;
                return this;
            }

            /**
             * <p>The restriction type for device registration. Valid values:</p>
             * <ul>
             * <li><p><strong>Unlimited</strong>: No restrictions.</p>
             * </li>
             * <li><p><strong>LimitAll</strong>: Limit by total count.</p>
             * </li>
             * <li><p><strong>LimitDiff</strong>: Limit by device category.</p>
             * </li>
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
    /**
     * 
     * {@link CreateRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRegistrationPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
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
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List<String> whitelist;

        private Policy(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.limitDetail = builder.limitDetail;
            this.matchMode = builder.matchMode;
            this.name = builder.name;
            this.policyId = builder.policyId;
            this.priority = builder.priority;
            this.status = builder.status;
            this.userGroupIds = builder.userGroupIds;
            this.whitelist = builder.whitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
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
        public String getPriority() {
            return this.priority;
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
            private String priority; 
            private String status; 
            private java.util.List<String> userGroupIds; 
            private java.util.List<String> whitelist; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.limitDetail = model.limitDetail;
                this.matchMode = model.matchMode;
                this.name = model.name;
                this.policyId = model.policyId;
                this.priority = model.priority;
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
             * <p>A description of the device registration policy.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条设备注册策略</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of device registration limits.</p>
             */
            public Builder limitDetail(java.util.List<LimitDetail> limitDetail) {
                this.limitDetail = limitDetail;
                return this;
            }

            /**
             * <p>The target type for policy matching. Valid values:</p>
             * <ul>
             * <li><p><strong>UserGroupAll</strong>: Apply to all users.</p>
             * </li>
             * <li><p><strong>UserGroupNormal</strong>: Apply to selected user groups.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserGroupNormal</p>
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
             * <p>The priority of the device registration policy. A value of 0 indicates the highest priority. A value of 99 indicates the lowest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The status of the device registration policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Disabled.</p>
             * </li>
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
             * <p>The IDs of user groups to which the device registration policy applies. This field has a value only when MatchMode is set to <strong>UserGroupNormal</strong>.</p>
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * <p>The list of usernames in the whitelist for the device registration policy.</p>
             */
            public Builder whitelist(java.util.List<String> whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
