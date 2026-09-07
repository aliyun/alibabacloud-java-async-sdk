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
 * {@link UpdateRegistrationPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateRegistrationPolicyRequest</p>
 */
public class UpdateRegistrationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompanyLimitCount")
    private CompanyLimitCount companyLimitCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompanyLimitType")
    private String companyLimitType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PersonalLimitCount")
    private PersonalLimitCount personalLimitCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PersonalLimitType")
    private String personalLimitType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private UpdateRegistrationPolicyRequest(Builder builder) {
        super(builder);
        this.companyLimitCount = builder.companyLimitCount;
        this.companyLimitType = builder.companyLimitType;
        this.description = builder.description;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.personalLimitCount = builder.personalLimitCount;
        this.personalLimitType = builder.personalLimitType;
        this.policyId = builder.policyId;
        this.priority = builder.priority;
        this.status = builder.status;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRegistrationPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyLimitCount
     */
    public CompanyLimitCount getCompanyLimitCount() {
        return this.companyLimitCount;
    }

    /**
     * @return companyLimitType
     */
    public String getCompanyLimitType() {
        return this.companyLimitType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return personalLimitCount
     */
    public PersonalLimitCount getPersonalLimitCount() {
        return this.personalLimitCount;
    }

    /**
     * @return personalLimitType
     */
    public String getPersonalLimitType() {
        return this.personalLimitType;
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

    public static final class Builder extends Request.Builder<UpdateRegistrationPolicyRequest, Builder> {
        private CompanyLimitCount companyLimitCount; 
        private String companyLimitType; 
        private String description; 
        private String matchMode; 
        private String name; 
        private PersonalLimitCount personalLimitCount; 
        private String personalLimitType; 
        private String policyId; 
        private Long priority; 
        private String status; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRegistrationPolicyRequest request) {
            super(request);
            this.companyLimitCount = request.companyLimitCount;
            this.companyLimitType = request.companyLimitType;
            this.description = request.description;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.personalLimitCount = request.personalLimitCount;
            this.personalLimitType = request.personalLimitType;
            this.policyId = request.policyId;
            this.priority = request.priority;
            this.status = request.status;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The registration limit for corporate devices.</p>
         */
        public Builder companyLimitCount(CompanyLimitCount companyLimitCount) {
            String companyLimitCountShrink = shrink(companyLimitCount, "CompanyLimitCount", "json");
            this.putBodyParameter("CompanyLimitCount", companyLimitCountShrink);
            this.companyLimitCount = companyLimitCount;
            return this;
        }

        /**
         * <p>The registration limit type for corporate devices. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No limit.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limits the total number of devices.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limits devices by terminal type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LimitAll</p>
         */
        public Builder companyLimitType(String companyLimitType) {
            this.putBodyParameter("CompanyLimitType", companyLimitType);
            this.companyLimitType = companyLimitType;
            return this;
        }

        /**
         * <p>The description of the device registration policy. The description can be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条设备注册策略</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The matching target type of the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>UserGroupAll</strong>: Associates with all users.</p>
         * </li>
         * <li><p><strong>UserGroupNormal</strong>: Associates with specific user groups.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The name of the device registration policy. The name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>registration_policy_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The registration limit for personal devices.</p>
         */
        public Builder personalLimitCount(PersonalLimitCount personalLimitCount) {
            String personalLimitCountShrink = shrink(personalLimitCount, "PersonalLimitCount", "json");
            this.putBodyParameter("PersonalLimitCount", personalLimitCountShrink);
            this.personalLimitCount = personalLimitCount;
            return this;
        }

        /**
         * <p>The registration limit type for personal devices. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No limit.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limits the total number of devices.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limits devices by terminal type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LimitDiff</p>
         */
        public Builder personalLimitType(String personalLimitType) {
            this.putBodyParameter("PersonalLimitType", personalLimitType);
            this.personalLimitType = personalLimitType;
            return this;
        }

        /**
         * <p>The ID of the device registration policy. You can obtain the ID by calling one of the following operations:</p>
         * <ul>
         * <li><p><a href="~~ListRegistrationPolicies~~">ListRegistrationPolicies</a></p>
         * </li>
         * <li><p><a href="~~GetRegistrationPolicy~~">GetRegistrationPolicy</a></p>
         * </li>
         * <li><p><a href="~~CreateRegistrationPolicy~~">CreateRegistrationPolicy</a></p>
         * </li>
         * <li><p><a href="~~UpdateRegistrationPolicy~~">UpdateRegistrationPolicy</a></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-policy-63b2f1844b86****</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The priority of the device registration policy. A smaller value indicates a higher priority. The value 0 indicates the highest priority, and 99 indicates the lowest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder priority(Long priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The status of the device registration policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong></p>
         * </li>
         * <li><p><strong>Disabled</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The IDs of user groups. This parameter is required when MatchMode is set to <strong>UserGroupNormal</strong>. A policy can be associated with up to 100 user groups.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The list of whitelisted users for the device registration policy. You can add up to 1,000 usernames.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public UpdateRegistrationPolicyRequest build() {
            return new UpdateRegistrationPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRegistrationPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateRegistrationPolicyRequest</p>
     */
    public static class CompanyLimitCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("All")
        private Integer all;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private Integer mobile;

        @com.aliyun.core.annotation.NameInMap("PC")
        private Integer pc;

        private CompanyLimitCount(Builder builder) {
            this.all = builder.all;
            this.mobile = builder.mobile;
            this.pc = builder.pc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompanyLimitCount create() {
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

            private Builder(CompanyLimitCount model) {
                this.all = model.all;
                this.mobile = model.mobile;
                this.pc = model.pc;
            } 

            /**
             * <p>The total number of corporate devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when CompanyLimitType is set to <strong>LimitAll</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder all(Integer all) {
                this.all = all;
                return this;
            }

            /**
             * <p>The number of corporate mobile devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mobile(Integer mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The number of corporate PCs that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pc(Integer pc) {
                this.pc = pc;
                return this;
            }

            public CompanyLimitCount build() {
                return new CompanyLimitCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRegistrationPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateRegistrationPolicyRequest</p>
     */
    public static class PersonalLimitCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("All")
        private Integer all;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private Integer mobile;

        @com.aliyun.core.annotation.NameInMap("PC")
        private Integer pc;

        private PersonalLimitCount(Builder builder) {
            this.all = builder.all;
            this.mobile = builder.mobile;
            this.pc = builder.pc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonalLimitCount create() {
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

            private Builder(PersonalLimitCount model) {
                this.all = model.all;
                this.mobile = model.mobile;
                this.pc = model.pc;
            } 

            /**
             * <p>The total number of personal devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when PersonalLimitType is set to <strong>LimitAll</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder all(Integer all) {
                this.all = all;
                return this;
            }

            /**
             * <p>The number of personal mobile devices that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mobile(Integer mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The number of personal PCs that can be registered. The value can be from 0 to 100. The default value is 0. This parameter is valid only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pc(Integer pc) {
                this.pc = pc;
                return this;
            }

            public PersonalLimitCount build() {
                return new PersonalLimitCount(this);
            } 

        } 

    }
}
