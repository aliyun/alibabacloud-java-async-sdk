// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ListUserRolesRequest</p>
 */
public class ListUserRolesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PrincipalArn")
    private String principalArn;

    @Query
    @NameInMap("RoleNamePattern")
    private String roleNamePattern;

    private ListUserRolesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.principalArn = builder.principalArn;
        this.roleNamePattern = builder.roleNamePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserRolesRequest create() {
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
     * @return principalArn
     */
    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * @return roleNamePattern
     */
    public String getRoleNamePattern() {
        return this.roleNamePattern;
    }

    public static final class Builder extends Request.Builder<ListUserRolesRequest, Builder> {
        private String regionId; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String principalArn; 
        private String roleNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListUserRolesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.principalArn = request.principalArn;
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
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrincipalArn.
         */
        public Builder principalArn(String principalArn) {
            this.putQueryParameter("PrincipalArn", principalArn);
            this.principalArn = principalArn;
            return this;
        }

        /**
         * role name pattern filter
         */
        public Builder roleNamePattern(String roleNamePattern) {
            this.putQueryParameter("RoleNamePattern", roleNamePattern);
            this.roleNamePattern = roleNamePattern;
            return this;
        }

        @Override
        public ListUserRolesRequest build() {
            return new ListUserRolesRequest(this);
        } 

    } 

}
