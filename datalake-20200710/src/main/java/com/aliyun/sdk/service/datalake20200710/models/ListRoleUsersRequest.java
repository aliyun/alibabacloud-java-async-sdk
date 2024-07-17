// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoleUsersRequest} extends {@link RequestModel}
 *
 * <p>ListRoleUsersRequest</p>
 */
public class ListRoleUsersRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNamePattern")
    private String userNamePattern;

    private ListRoleUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.roleName = builder.roleName;
        this.userNamePattern = builder.userNamePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoleUsersRequest create() {
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return userNamePattern
     */
    public String getUserNamePattern() {
        return this.userNamePattern;
    }

    public static final class Builder extends Request.Builder<ListRoleUsersRequest, Builder> {
        private String regionId; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String roleName; 
        private String userNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListRoleUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.roleName = request.roleName;
            this.userNamePattern = request.userNamePattern;
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
         * NextPageToken
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
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * use name pattern filter
         */
        public Builder userNamePattern(String userNamePattern) {
            this.putQueryParameter("UserNamePattern", userNamePattern);
            this.userNamePattern = userNamePattern;
            return this;
        }

        @Override
        public ListRoleUsersRequest build() {
            return new ListRoleUsersRequest(this);
        } 

    } 

}
