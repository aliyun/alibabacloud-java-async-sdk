// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRegistrationPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListRegistrationPoliciesRequest</p>
 */
public class ListRegistrationPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyLimitType")
    private String companyLimitType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonalLimitType")
    private String personalLimitType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List < String > policyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ListRegistrationPoliciesRequest(Builder builder) {
        super(builder);
        this.companyLimitType = builder.companyLimitType;
        this.currentPage = builder.currentPage;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.personalLimitType = builder.personalLimitType;
        this.policyIds = builder.policyIds;
        this.status = builder.status;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistrationPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyLimitType
     */
    public String getCompanyLimitType() {
        return this.companyLimitType;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
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
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return personalLimitType
     */
    public String getPersonalLimitType() {
        return this.personalLimitType;
    }

    /**
     * @return policyIds
     */
    public java.util.List < String > getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListRegistrationPoliciesRequest, Builder> {
        private String companyLimitType; 
        private Long currentPage; 
        private String matchMode; 
        private String name; 
        private Long pageSize; 
        private String personalLimitType; 
        private java.util.List < String > policyIds; 
        private String status; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListRegistrationPoliciesRequest request) {
            super(request);
            this.companyLimitType = request.companyLimitType;
            this.currentPage = request.currentPage;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.personalLimitType = request.personalLimitType;
            this.policyIds = request.policyIds;
            this.status = request.status;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * CompanyLimitType.
         */
        public Builder companyLimitType(String companyLimitType) {
            this.putQueryParameter("CompanyLimitType", companyLimitType);
            this.companyLimitType = companyLimitType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PersonalLimitType.
         */
        public Builder personalLimitType(String personalLimitType) {
            this.putQueryParameter("PersonalLimitType", personalLimitType);
            this.personalLimitType = personalLimitType;
            return this;
        }

        /**
         * PolicyIds.
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListRegistrationPoliciesRequest build() {
            return new ListRegistrationPoliciesRequest(this);
        } 

    } 

}
