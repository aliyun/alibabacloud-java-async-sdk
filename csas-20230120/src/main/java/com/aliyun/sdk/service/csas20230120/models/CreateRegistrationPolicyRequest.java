// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List < String > whitelist;

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
    public java.util.List < String > getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return whitelist
     */
    public java.util.List < String > getWhitelist() {
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
        private java.util.List < String > userGroupIds; 
        private java.util.List < String > whitelist; 

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
         * CompanyLimitCount.
         */
        public Builder companyLimitCount(CompanyLimitCount companyLimitCount) {
            String companyLimitCountShrink = shrink(companyLimitCount, "CompanyLimitCount", "json");
            this.putBodyParameter("CompanyLimitCount", companyLimitCountShrink);
            this.companyLimitCount = companyLimitCount;
            return this;
        }

        /**
         * CompanyLimitType.
         */
        public Builder companyLimitType(String companyLimitType) {
            this.putBodyParameter("CompanyLimitType", companyLimitType);
            this.companyLimitType = companyLimitType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PersonalLimitCount.
         */
        public Builder personalLimitCount(PersonalLimitCount personalLimitCount) {
            String personalLimitCountShrink = shrink(personalLimitCount, "PersonalLimitCount", "json");
            this.putBodyParameter("PersonalLimitCount", personalLimitCountShrink);
            this.personalLimitCount = personalLimitCount;
            return this;
        }

        /**
         * PersonalLimitType.
         */
        public Builder personalLimitType(String personalLimitType) {
            this.putBodyParameter("PersonalLimitType", personalLimitType);
            this.personalLimitType = personalLimitType;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Long priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * Whitelist.
         */
        public Builder whitelist(java.util.List < String > whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public CreateRegistrationPolicyRequest build() {
            return new CreateRegistrationPolicyRequest(this);
        } 

    } 

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

            public CompanyLimitCount build() {
                return new CompanyLimitCount(this);
            } 

        } 

    }
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

            public PersonalLimitCount build() {
                return new PersonalLimitCount(this);
            } 

        } 

    }
}
