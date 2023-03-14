// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostGroupsForUserRequest} extends {@link RequestModel}
 *
 * <p>ListHostGroupsForUserRequest</p>
 */
public class ListHostGroupsForUserRequest extends Request {
    @Query
    @NameInMap("HostGroupName")
    private String hostGroupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mode")
    private String mode;

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
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ListHostGroupsForUserRequest(Builder builder) {
        super(builder);
        this.hostGroupName = builder.hostGroupName;
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsForUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostGroupName
     */
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListHostGroupsForUserRequest, Builder> {
        private String hostGroupName; 
        private String instanceId; 
        private String mode; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListHostGroupsForUserRequest request) {
            super(request);
            this.hostGroupName = request.hostGroupName;
            this.instanceId = request.instanceId;
            this.mode = request.mode;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * The name of the host group that you want to query. The name can be up to 128 characters in length. Only exact match is supported.
         */
        public Builder hostGroupName(String hostGroupName) {
            this.putQueryParameter("HostGroupName", hostGroupName);
            this.hostGroupName = hostGroupName;
            return this;
        }

        /**
         * The ID of the Bastionhost instance where you want to query the host groups that the user is authorized or not authorized to manage.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The category of the host group that you want to query. Valid values:
         * <p>
         * 
         * *   **Authorized**: Query the host groups that the user is authorized to manage. This is the default value.
         * *   **Unauthorized**: Query the host groups that the user is not authorized to manage.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * The number of entries to return on each page.
         * <p>
         * 
         * The value of the PageSize parameter must not exceed 100. Default value: 20. If you leave the PageSize parameter empty, 20 entries are returned on each page.
         * 
         * >  We recommend that you do not leave the PageSize parameter empty.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the Bastionhost instance where you want to query the host groups that the user is authorized or not authorized to manage.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the user.
         * <p>
         * 
         * >  You can call the [ListUsers](~~204522~~) operation to query the ID of the user.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListHostGroupsForUserRequest build() {
            return new ListHostGroupsForUserRequest(this);
        } 

    } 

}
