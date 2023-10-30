// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostAccountsForUserGroupRequest} extends {@link RequestModel}
 *
 * <p>ListHostAccountsForUserGroupRequest</p>
 */
public class ListHostAccountsForUserGroupRequest extends Request {
    @Query
    @NameInMap("HostAccountName")
    private String hostAccountName;

    @Query
    @NameInMap("HostId")
    @Validation(required = true)
    private String hostId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    private ListHostAccountsForUserGroupRequest(Builder builder) {
        super(builder);
        this.hostAccountName = builder.hostAccountName;
        this.hostId = builder.hostId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostAccountsForUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountName
     */
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListHostAccountsForUserGroupRequest, Builder> {
        private String hostAccountName; 
        private String hostId; 
        private String instanceId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListHostAccountsForUserGroupRequest request) {
            super(request);
            this.hostAccountName = request.hostAccountName;
            this.hostId = request.hostId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * The name of the host account that you want to query. Exact match is supported.
         */
        public Builder hostAccountName(String hostAccountName) {
            this.putQueryParameter("HostAccountName", hostAccountName);
            this.hostAccountName = hostAccountName;
            return this;
        }

        /**
         * The ID of the host to query.
         * <p>
         * 
         * > You can call the [ListHosts](~~200665~~) operation to query the ID of the host.
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * The ID of the bastion host on which you want to query the host accounts to be managed by the specified user group on the specified host.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.\
         * <p>
         * Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the bastion host on which you want to query the host accounts to be managed by the specified user group on the specified host.
         * <p>
         * 
         * > For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the user group for which you want to query authorized host accounts.
         * <p>
         * 
         * > You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListHostAccountsForUserGroupRequest build() {
            return new ListHostAccountsForUserGroupRequest(this);
        } 

    } 

}
