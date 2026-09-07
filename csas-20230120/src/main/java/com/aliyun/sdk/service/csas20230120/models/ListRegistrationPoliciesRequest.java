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
    private java.util.List<String> policyIds;

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
    public java.util.List<String> getPolicyIds() {
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
        private java.util.List<String> policyIds; 
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
         * <p>The type of company device registration limit. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No limit.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limit by total number.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limit by device categorization.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LimitAll</p>
         */
        public Builder companyLimitType(String companyLimitType) {
            this.putQueryParameter("CompanyLimitType", companyLimitType);
            this.companyLimitType = companyLimitType;
            return this;
        }

        /**
         * <p>The current page number for paged queries. Values range from 1 to 10000.</p>
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
         * <p>The policy matching target type. Valid values:</p>
         * <ul>
         * <li><p><strong>UserGroupAll</strong>: Associate all users.</p>
         * </li>
         * <li><p><strong>UserGroupNormal</strong>: Associate some user groups.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupAll</p>
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The name of the device registration policy. It can be 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase English letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>registration_policy_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of items per page for paged queries. Values range from 1 to 500.</p>
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
         * <p>The type of personal device registration limit. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No limit.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limit by total number.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limit by device categorization.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LimitDiff</p>
         */
        public Builder personalLimitType(String personalLimitType) {
            this.putQueryParameter("PersonalLimitType", personalLimitType);
            this.personalLimitType = personalLimitType;
            return this;
        }

        /**
         * <p>A collection of device registration policy IDs. You can enter up to 100 device registration policy IDs.</p>
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
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
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The user group ID. Get this value from:</p>
         * <ul>
         * <li><p><a href="~~ListUserGroups~~">ListUserGroups</a>: Batch query user groups.</p>
         * </li>
         * <li><p><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Create user groups.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
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
