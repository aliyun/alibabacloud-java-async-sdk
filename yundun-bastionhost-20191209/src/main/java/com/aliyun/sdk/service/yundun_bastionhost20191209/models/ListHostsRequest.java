// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostsRequest} extends {@link RequestModel}
 *
 * <p>ListHostsRequest</p>
 */
public class ListHostsRequest extends Request {
    @Query
    @NameInMap("HostAddress")
    private String hostAddress;

    @Query
    @NameInMap("HostGroupId")
    private String hostGroupId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

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
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @Query
    @NameInMap("SourceInstanceState")
    private String sourceInstanceState;

    private ListHostsRequest(Builder builder) {
        super(builder);
        this.hostAddress = builder.hostAddress;
        this.hostGroupId = builder.hostGroupId;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.OSType = builder.OSType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.sourceInstanceState = builder.sourceInstanceState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostsRequest create() {
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
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return sourceInstanceState
     */
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

    public static final class Builder extends Request.Builder<ListHostsRequest, Builder> {
        private String hostAddress; 
        private String hostGroupId; 
        private String hostName; 
        private String instanceId; 
        private String OSType; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String source; 
        private String sourceInstanceId; 
        private String sourceInstanceState; 

        private Builder() {
            super();
        } 

        private Builder(ListHostsRequest request) {
            super(request);
            this.hostAddress = request.hostAddress;
            this.hostGroupId = request.hostGroupId;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.OSType = request.OSType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceInstanceId = request.sourceInstanceId;
            this.sourceInstanceState = request.sourceInstanceState;
        } 

        /**
         * The address of the host that you want to query. You can set this parameter to a domain name or an IP address. Only exact match is supported.
         */
        public Builder hostAddress(String hostAddress) {
            this.putQueryParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * The ID of the host group to which the host to be queried belongs.
         * <p>
         * 
         * > You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
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
         * The ID of the bastion host on which you want to query hosts.
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
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         * <p>
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the bastion host on which you want to query hosts.
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
         * The source of the host that you want to query. Valid values:
         * <p>
         * 
         * *   **Local**: a host in a data center
         * *   **Ecs**: an Elastic Compute Service (ECS) instance
         * *   **Rds**: a host in an ApsaraDB MyBase dedicated cluster
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the ECS instance or the host in an ApsaraDB MyBase dedicated cluster that you want to query. Only exact match is supported.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * The status of the host that you want to query. Valid values:
         * <p>
         * 
         * *   **Normal**: normal
         * *   **Release**: released
         */
        public Builder sourceInstanceState(String sourceInstanceState) {
            this.putQueryParameter("SourceInstanceState", sourceInstanceState);
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }

        @Override
        public ListHostsRequest build() {
            return new ListHostsRequest(this);
        } 

    } 

}
