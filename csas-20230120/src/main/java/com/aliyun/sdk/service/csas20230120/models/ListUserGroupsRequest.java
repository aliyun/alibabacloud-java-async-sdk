// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListUserGroupsRequest</p>
 */
public class ListUserGroupsRequest extends Request {
    @Query
    @NameInMap("AttributeValue")
    private String attributeValue;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PAPolicyId")
    private String PAPolicyId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("UserGroupIds")
    private java.util.List < String > userGroupIds;

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
    public java.util.List < String > getUserGroupIds() {
        return this.userGroupIds;
    }

    public static final class Builder extends Request.Builder<ListUserGroupsRequest, Builder> {
        private String attributeValue; 
        private Integer currentPage; 
        private String name; 
        private String PAPolicyId; 
        private Integer pageSize; 
        private java.util.List < String > userGroupIds; 

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
         * AttributeValue.
         */
        public Builder attributeValue(String attributeValue) {
            this.putQueryParameter("AttributeValue", attributeValue);
            this.attributeValue = attributeValue;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 用户组名称。长度为1~128个字符，支持中文和大小写英文字母，可包含数字、半角句号（.）、下划线（_）和短划线（-）。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PAPolicyId.
         */
        public Builder PAPolicyId(String PAPolicyId) {
            this.putQueryParameter("PAPolicyId", PAPolicyId);
            this.PAPolicyId = PAPolicyId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
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
