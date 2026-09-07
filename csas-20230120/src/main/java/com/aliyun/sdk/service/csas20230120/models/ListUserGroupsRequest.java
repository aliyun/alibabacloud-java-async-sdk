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
 * {@link ListUserGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListUserGroupsRequest</p>
 */
public class ListUserGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttributeValue")
    private String attributeValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PAPolicyId")
    private String PAPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    private ListUserGroupsRequest(Builder builder) {
        super(builder);
        this.attributeValue = builder.attributeValue;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.PAPolicyId = builder.PAPolicyId;
        this.pageSize = builder.pageSize;
        this.userGroupIds = builder.userGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeValue
     */
    public String getAttributeValue() {
        return this.attributeValue;
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
     * @return PAPolicyId
     */
    public String getPAPolicyId() {
        return this.PAPolicyId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public static final class Builder extends Request.Builder<ListUserGroupsRequest, Builder> {
        private String attributeValue; 
        private Integer currentPage; 
        private String name; 
        private String PAPolicyId; 
        private Integer pageSize; 
        private java.util.List<String> userGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListUserGroupsRequest request) {
            super(request);
            this.attributeValue = request.attributeValue;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.PAPolicyId = request.PAPolicyId;
            this.pageSize = request.pageSize;
            this.userGroupIds = request.userGroupIds;
        } 

        /**
         * <p>The value of a user group property. The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder attributeValue(String attributeValue) {
            this.putQueryParameter("AttributeValue", attributeValue);
            this.attributeValue = attributeValue;
            return this;
        }

        /**
         * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
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
         * <p>The name of the user group. The name must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), and hyphens (-). It supports both uppercase and lowercase letters and Chinese characters.</p>
         * 
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of an internal network access policy. You can get this value from:</p>
         * <ul>
         * <li><p><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: List internal network access policies.</p>
         * </li>
         * <li><p><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create an internal network access policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-54a7838a48bf****</p>
         */
        public Builder PAPolicyId(String PAPolicyId) {
            this.putQueryParameter("PAPolicyId", PAPolicyId);
            this.PAPolicyId = PAPolicyId;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 1000.</p>
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
         * <p>A collection of user group IDs. You can specify up to 100 IDs.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        @Override
        public ListUserGroupsRequest build() {
            return new ListUserGroupsRequest(this);
        } 

    } 

}
