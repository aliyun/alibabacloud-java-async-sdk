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
 * {@link ListProhibitedPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListProhibitedPoliciesRequest</p>
 */
public class ListProhibitedPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List<String> policyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareId")
    private SoftwareId softwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareName")
    private String softwareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ListProhibitedPoliciesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.enabled = builder.enabled;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.objectType = builder.objectType;
        this.pageSize = builder.pageSize;
        this.policyIds = builder.policyIds;
        this.policyType = builder.policyType;
        this.softwareId = builder.softwareId;
        this.softwareName = builder.softwareName;
        this.tagId = builder.tagId;
        this.tagName = builder.tagName;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProhibitedPoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyIds
     */
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return softwareId
     */
    public SoftwareId getSoftwareId() {
        return this.softwareId;
    }

    /**
     * @return softwareName
     */
    public String getSoftwareName() {
        return this.softwareName;
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

    public static final class Builder extends Request.Builder<ListProhibitedPoliciesRequest, Builder> {
        private Long currentPage; 
        private Boolean enabled; 
        private String matchMode; 
        private String name; 
        private String objectType; 
        private Long pageSize; 
        private java.util.List<String> policyIds; 
        private String policyType; 
        private SoftwareId softwareId; 
        private String softwareName; 
        private String tagId; 
        private String tagName; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListProhibitedPoliciesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.enabled = request.enabled;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.objectType = request.objectType;
            this.pageSize = request.pageSize;
            this.policyIds = request.policyIds;
            this.policyType = request.policyType;
            this.softwareId = request.softwareId;
            this.softwareName = request.softwareName;
            this.tagId = request.tagId;
            this.tagName = request.tagName;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
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
         * <p>Specifies whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. The policy is delivered to endpoints and takes effect.</li>
         * <li><strong>false</strong>: Disabled. The policy configuration is retained but not delivered to endpoints.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account. No user group needs to be specified.</li>
         * <li><strong>UserGroupNormal</strong>: Applies only to users in the user groups specified by UserGroupIds.</li>
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
         * <p>Policy Name of the software prohibition policy. Fuzzy match is supported. Policy Name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The object type of the controlled target. Valid values:</p>
         * <ul>
         * <li><strong>App</strong>: Controls by prohibited software. The controlled objects are specified by SoftwareIds.</li>
         * <li><strong>Tag</strong>: Controls by prohibited software tag. The controlled objects are specified by TagIds. All prohibited software under the tag is controlled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 500.</p>
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
         * <p>The collection of software prohibition policy IDs. Duplicate values are not allowed.</p>
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * <p>The action to take. Valid values:</p>
         * <ul>
         * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up notification on the endpoint to alert the user.</li>
         * <li><strong>BanSilent</strong>: Blocks the software from running without notifying the user. The blocking is silent.</li>
         * <li><strong>Warn</strong>: Only displays a pop-up notification on the endpoint to alert the user without blocking the software from running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ban</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The unique identifier of the prohibited software.</p>
         */
        public Builder softwareId(SoftwareId softwareId) {
            String softwareIdShrink = shrink(softwareId, "SoftwareId", "json");
            this.putQueryParameter("SoftwareId", softwareIdShrink);
            this.softwareId = softwareId;
            return this;
        }

        /**
         * <p>The name of the prohibited software. Fuzzy match is supported. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Thunder</p>
         */
        public Builder softwareName(String softwareName) {
            this.putQueryParameter("SoftwareName", softwareName);
            this.softwareName = softwareName;
            return this;
        }

        /**
         * <p>The prohibited software tag ID, used to filter policies that reference this tag. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedTags~~">ListProhibitedTags</a>: Lists prohibited software tags.</li>
         * <li><a href="~~CreateProhibitedTag~~">CreateProhibitedTag</a>: Creates a custom prohibited software tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag-d3f64e8bdd4a****</p>
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * <p>The name of the prohibited software tag. Fuzzy match is supported. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudProduct</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * <p>The user group ID, used to filter policies whose effective scope includes this user group. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: Lists user groups.</li>
         * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Creates a user group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>usergroup-9d4f2a7b3c1e****</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListProhibitedPoliciesRequest build() {
            return new ListProhibitedPoliciesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListProhibitedPoliciesRequest} extends {@link TeaModel}
     *
     * <p>ListProhibitedPoliciesRequest</p>
     */
    public static class SoftwareId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        private SoftwareId(Builder builder) {
            this.isDefault = builder.isDefault;
            this.softwareId = builder.softwareId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareId create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private String softwareId; 

            private Builder() {
            } 

            private Builder(SoftwareId model) {
                this.isDefault = model.isDefault;
                this.softwareId = model.softwareId;
            } 

            /**
             * <p>Specifies whether the prohibited software is a system built-in entry. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A system built-in prohibited software entry shared by all Alibaba Cloud accounts. Modification and deletion are not supported.</li>
             * <li><strong>false</strong>: Custom prohibited software under the current Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The prohibited software ID. You can obtain the value from the following operations:</p>
             * <ul>
             * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Lists prohibited software.</li>
             * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>swb-83995ff2ae38****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            public SoftwareId build() {
                return new SoftwareId(this);
            } 

        } 

    }
}
