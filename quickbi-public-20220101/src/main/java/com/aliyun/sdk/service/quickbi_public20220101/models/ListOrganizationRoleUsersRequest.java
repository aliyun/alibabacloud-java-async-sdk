// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListOrganizationRoleUsersRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationRoleUsersRequest</p>
 */
public class ListOrganizationRoleUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    private ListOrganizationRoleUsersRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationRoleUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    public static final class Builder extends Request.Builder<ListOrganizationRoleUsersRequest, Builder> {
        private String keyword; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long roleId; 

        private Builder() {
            super();
        } 

        private Builder(ListOrganizationRoleUsersRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.roleId = request.roleId;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111</p>
         */
        public Builder roleId(Long roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        @Override
        public ListOrganizationRoleUsersRequest build() {
            return new ListOrganizationRoleUsersRequest(this);
        } 

    } 

}
