// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListRolesRequest} extends {@link RequestModel}
 *
 * <p>ListRolesRequest</p>
 */
public class ListRolesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorizerId")
    private String authorizerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorizerType")
    private String authorizerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("roleIds")
    private java.util.List<Long> roleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("roleType")
    private String roleType;

    private ListRolesRequest(Builder builder) {
        super(builder);
        this.authorizerId = builder.authorizerId;
        this.authorizerType = builder.authorizerType;
        this.enterpriseId = builder.enterpriseId;
        this.name = builder.name;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.platform = builder.platform;
        this.roleIds = builder.roleIds;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * @return authorizerType
     */
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return roleIds
     */
    public java.util.List<Long> getRoleIds() {
        return this.roleIds;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<ListRolesRequest, Builder> {
        private String authorizerId; 
        private String authorizerType; 
        private Long enterpriseId; 
        private String name; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String platform; 
        private java.util.List<Long> roleIds; 
        private String roleType; 

        private Builder() {
            super();
        } 

        private Builder(ListRolesRequest request) {
            super(request);
            this.authorizerId = request.authorizerId;
            this.authorizerType = request.authorizerType;
            this.enterpriseId = request.enterpriseId;
            this.name = request.name;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.platform = request.platform;
            this.roleIds = request.roleIds;
            this.roleType = request.roleType;
        } 

        /**
         * authorizerId.
         */
        public Builder authorizerId(String authorizerId) {
            this.putQueryParameter("authorizerId", authorizerId);
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * authorizerType.
         */
        public Builder authorizerType(String authorizerType) {
            this.putQueryParameter("authorizerType", authorizerType);
            this.authorizerType = authorizerType;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * roleIds.
         */
        public Builder roleIds(java.util.List<Long> roleIds) {
            String roleIdsShrink = shrink(roleIds, "roleIds", "json");
            this.putQueryParameter("roleIds", roleIdsShrink);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * roleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("roleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public ListRolesRequest build() {
            return new ListRolesRequest(this);
        } 

    } 

}
