// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRolesRequest} extends {@link RequestModel}
 *
 * <p>ListRolesRequest</p>
 */
public class ListRolesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleNamePattern")
    private String roleNamePattern;

    private ListRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.roleNamePattern = builder.roleNamePattern;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return roleNamePattern
     */
    public String getRoleNamePattern() {
        return this.roleNamePattern;
    }

    public static final class Builder extends Request.Builder<ListRolesRequest, Builder> {
        private String regionId; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String roleNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListRolesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.roleNamePattern = request.roleNamePattern;
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
         * Next PageToken
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
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
         * RoleNamePattern.
         */
        public Builder roleNamePattern(String roleNamePattern) {
            this.putQueryParameter("RoleNamePattern", roleNamePattern);
            this.roleNamePattern = roleNamePattern;
            return this;
        }

        @Override
        public ListRolesRequest build() {
            return new ListRolesRequest(this);
        } 

    } 

}
