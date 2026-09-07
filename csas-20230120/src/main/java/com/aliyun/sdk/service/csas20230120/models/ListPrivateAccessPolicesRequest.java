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
 * {@link ListPrivateAccessPolicesRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessPolicesRequest</p>
 */
public class ListPrivateAccessPolicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyAction")
    private String policyAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List<String> policyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ListPrivateAccessPolicesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.policyAction = builder.policyAction;
        this.policyIds = builder.policyIds;
        this.status = builder.status;
        this.tagId = builder.tagId;
        this.tagName = builder.tagName;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessPolicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyAction
     */
    public String getPolicyAction() {
        return this.policyAction;
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
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListPrivateAccessPolicesRequest, Builder> {
        private String applicationId; 
        private String applicationName; 
        private Integer currentPage; 
        private String name; 
        private Integer pageSize; 
        private String policyAction; 
        private java.util.List<String> policyIds; 
        private String status; 
        private String tagId; 
        private String tagName; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateAccessPolicesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationName = request.applicationName;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyAction = request.policyAction;
            this.policyIds = request.policyIds;
            this.status = request.status;
            this.tagId = request.tagId;
            this.tagName = request.tagName;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The ID of the private access application. The application ID cannot be used together with the private access tag ID for filtering. Sources of the value:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Queries private access applications by batch.</li>
         * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: Creates a private access application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The name of the private access application.</p>
         * 
         * <strong>example:</strong>
         * <p>办公</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The page number of the current page that is returned during paginated queries. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the private access policy. The name must be 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase English letters. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page that is set during paginated queries. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The action of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Block</strong>: Block.</li>
         * <li><strong>Allow</strong>: Allow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        public Builder policyAction(String policyAction) {
            this.putQueryParameter("PolicyAction", policyAction);
            this.policyAction = policyAction;
            return this;
        }

        /**
         * <p>The collection of private access policy IDs. You can specify up to 100 private access policy IDs.</p>
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * <p>The status of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
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
         * <p>The ID of the private access tag. The tag ID cannot be used together with the application ID for filtering. Sources of the value:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: Queries private access tags by batch.</li>
         * <li><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: Creates a private access tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag-c0cb77857a99****</p>
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>云产品</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * <p>The ID of the user group. Sources of the value:</p>
         * <ul>
         * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: Queries user groups by batch.</li>
         * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Creates a user group.</li>
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
        public ListPrivateAccessPolicesRequest build() {
            return new ListPrivateAccessPolicesRequest(this);
        } 

    } 

}
