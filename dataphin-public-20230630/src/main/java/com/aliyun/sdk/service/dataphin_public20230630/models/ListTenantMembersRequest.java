// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListTenantMembersRequest} extends {@link RequestModel}
 *
 * <p>ListTenantMembersRequest</p>
 */
public class ListTenantMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListTenantMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<ListTenantMembersRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListTenantMembersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public ListTenantMembersRequest build() {
            return new ListTenantMembersRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantMembersRequest} extends {@link TeaModel}
     *
     * <p>ListTenantMembersRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RoleList")
        private java.util.List<String> roleList;

        @com.aliyun.core.annotation.NameInMap("SearchText")
        private String searchText;

        @com.aliyun.core.annotation.NameInMap("UserGroupIdList")
        private java.util.List<String> userGroupIdList;

        private ListQuery(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.roleList = builder.roleList;
            this.searchText = builder.searchText;
            this.userGroupIdList = builder.userGroupIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return roleList
         */
        public java.util.List<String> getRoleList() {
            return this.roleList;
        }

        /**
         * @return searchText
         */
        public String getSearchText() {
            return this.searchText;
        }

        /**
         * @return userGroupIdList
         */
        public java.util.List<String> getUserGroupIdList() {
            return this.userGroupIdList;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<String> roleList; 
            private String searchText; 
            private java.util.List<String> userGroupIdList; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * RoleList.
             */
            public Builder roleList(java.util.List<String> roleList) {
                this.roleList = roleList;
                return this;
            }

            /**
             * SearchText.
             */
            public Builder searchText(String searchText) {
                this.searchText = searchText;
                return this;
            }

            /**
             * UserGroupIdList.
             */
            public Builder userGroupIdList(java.util.List<String> userGroupIdList) {
                this.userGroupIdList = userGroupIdList;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
