// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostsForUserRequest} extends {@link RequestModel}
 *
 * <p>ListHostsForUserRequest</p>
 */
public class ListHostsForUserRequest extends Request {
    @Query
    @NameInMap("HostAddress")
    private String hostAddress;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("OSType")
    private String OSType;

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

    private ListHostsForUserRequest(Builder builder) {
        super(builder);
        this.hostAddress = builder.hostAddress;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
        this.OSType = builder.OSType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostsForUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAddress
     */
    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
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
     * @return OSType
     */
    public String getOSType() {
        return this.OSType;
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

    public static final class Builder extends Request.Builder<ListHostsForUserRequest, Builder> {
        private String hostAddress; 
        private String hostName; 
        private String instanceId; 
        private String mode; 
        private String OSType; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListHostsForUserRequest request) {
            super(request);
            this.hostAddress = request.hostAddress;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.mode = request.mode;
            this.OSType = request.OSType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * The endpoint of the host that you want to query. You can set this parameter to a domain name or an IP address. Only exact match is supported.
         */
        public Builder hostAddress(String hostAddress) {
            this.putQueryParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * The name of the host that you want to query. Only exact match is supported.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The ID of the bastion host on which you want to query the hosts that the user is authorized or not authorized to manage.
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
         * Specifies the category of the hosts that you want to query. Valid values:
         * <p>
         * 
         * *   **Authorized**: queries the hosts that the user is authorized to manage. This is the default value.
         * *   **Unauthorized**: queries the hosts that the user is not authorized to manage.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The operating system of the host that you want to query. Valid values:
         * <p>
         * 
         * *   **Linux**
         * *   **Windows**
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * The number of the page. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.\
         * <p>
         * Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the bastion host on which you want to query the hosts that the user is authorized or not authorized to manage.
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
         * The ID of the user.
         * <p>
         * 
         * > You can call the [ListUsers](~~204522~~) operation to query the ID of the user.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListHostsForUserRequest build() {
            return new ListHostsForUserRequest(this);
        } 

    } 

}
