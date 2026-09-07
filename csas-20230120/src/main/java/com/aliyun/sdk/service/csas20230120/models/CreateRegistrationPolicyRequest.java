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
 * {@link CreateRegistrationPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateRegistrationPolicyRequest</p>
 */
public class CreateRegistrationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompanyLimitCount")
    private CompanyLimitCount companyLimitCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompanyLimitType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyLimitType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PersonalLimitCount")
    private PersonalLimitCount personalLimitCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PersonalLimitType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String personalLimitType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private CreateRegistrationPolicyRequest(Builder builder) {
        super(builder);
        this.companyLimitCount = builder.companyLimitCount;
        this.companyLimitType = builder.companyLimitType;
        this.description = builder.description;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.personalLimitCount = builder.personalLimitCount;
        this.personalLimitType = builder.personalLimitType;
        this.priority = builder.priority;
        this.status = builder.status;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRegistrationPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRegistrationPolicyRequest, Builder> {
        private CompanyLimitCount companyLimitCount; 
        private String companyLimitType; 
        private String description; 
        private String matchMode; 
        private String name; 
        private PersonalLimitCount personalLimitCount; 
        private String personalLimitType; 
        private Long priority; 
        private String status; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(CreateRegistrationPolicyRequest request) {
            super(request);
            this.companyLimitCount = request.companyLimitCount;
            this.companyLimitType = request.companyLimitType;
            this.description = request.description;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.personalLimitCount = request.personalLimitCount;
            this.personalLimitType = request.personalLimitType;
            this.priority = request.priority;
            this.status = request.status;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The restriction count for company devices.</p>
         */
        public Builder companyLimitCount(CompanyLimitCount companyLimitCount) {
            String companyLimitCountShrink = shrink(companyLimitCount, "CompanyLimitCount", "json");
            this.putBodyParameter("CompanyLimitCount", companyLimitCountShrink);
            this.companyLimitCount = companyLimitCount;
            return this;
        }

        /**
         * <p>The restriction type for company devices. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No restrictions.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limit by total count.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limit by device category.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>A description of the device registration policy. The description must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
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
         * <p>The target type for policy matching. Valid values:</p>
         * <ul>
         * <li><p><strong>UserGroupAll</strong>: Apply to all users.</p>
         * </li>
         * <li><p><strong>UserGroupNormal</strong>: Apply to selected user groups.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UserGroupAll</p>
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The name of the device registration policy. The name must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
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
         * <p>The restriction count for personal devices.</p>
         */
        public Builder personalLimitCount(PersonalLimitCount personalLimitCount) {
            String personalLimitCountShrink = shrink(personalLimitCount, "PersonalLimitCount", "json");
            this.putBodyParameter("PersonalLimitCount", personalLimitCountShrink);
            this.personalLimitCount = personalLimitCount;
            return this;
        }

        /**
         * <p>The restriction type for personal devices. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No restrictions.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limit by total count.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limit by device category.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The priority of the device registration policy. A value of 0 indicates the highest priority. A value of 99 indicates the lowest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder priority(Long priority) {
            this.putBodyParameter("Priority", priority);
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
         * <p>This parameter is required.</p>
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
         * <p>The IDs of user groups to which the device registration policy applies. Required if MatchMode is set to <strong>UserGroupNormal</strong>. A maximum of 100 user groups can be specified per policy.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The list of usernames in the whitelist for the device registration policy. You can specify up to 1,000 usernames.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public CreateRegistrationPolicyRequest build() {
            return new CreateRegistrationPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRegistrationPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateRegistrationPolicyRequest</p>
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
             * <p>The total restriction count for company devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when CompanyLimitType is set to <strong>LimitAll</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder all(Integer all) {
                this.all = all;
                return this;
            }

            /**
             * <p>The restriction count for mobile logins by company devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mobile(Integer mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The restriction count for PC logins by company devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when CompanyLimitType is set to <strong>LimitDiff</strong>.</p>
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
     * {@link CreateRegistrationPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateRegistrationPolicyRequest</p>
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
             * <p>The total restriction count for personal devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when PersonalLimitType is set to <strong>LimitAll</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder all(Integer all) {
                this.all = all;
                return this;
            }

            /**
             * <p>The restriction count for mobile logins by personal devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder mobile(Integer mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The restriction count for PC logins by personal devices. Valid values: 0 to 100. Default value: 0. This parameter takes effect only when PersonalLimitType is set to <strong>LimitDiff</strong>.</p>
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
