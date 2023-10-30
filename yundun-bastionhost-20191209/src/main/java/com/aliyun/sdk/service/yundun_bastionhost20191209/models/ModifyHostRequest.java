// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostRequest</p>
 */
public class ModifyHostRequest extends Request {
    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("HostId")
    @Validation(required = true)
    private String hostId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("HostPrivateAddress")
    private String hostPrivateAddress;

    @Query
    @NameInMap("HostPublicAddress")
    private String hostPublicAddress;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OSType")
    private String OSType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyHostRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.hostId = builder.hostId;
        this.hostName = builder.hostName;
        this.hostPrivateAddress = builder.hostPrivateAddress;
        this.hostPublicAddress = builder.hostPublicAddress;
        this.instanceId = builder.instanceId;
        this.OSType = builder.OSType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return hostPrivateAddress
     */
    public String getHostPrivateAddress() {
        return this.hostPrivateAddress;
    }

    /**
     * @return hostPublicAddress
     */
    public String getHostPublicAddress() {
        return this.hostPublicAddress;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyHostRequest, Builder> {
        private String comment; 
        private String hostId; 
        private String hostName; 
        private String hostPrivateAddress; 
        private String hostPublicAddress; 
        private String instanceId; 
        private String OSType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostRequest request) {
            super(request);
            this.comment = request.comment;
            this.hostId = request.hostId;
            this.hostName = request.hostName;
            this.hostPrivateAddress = request.hostPrivateAddress;
            this.hostPublicAddress = request.hostPublicAddress;
            this.instanceId = request.instanceId;
            this.OSType = request.OSType;
            this.regionId = request.regionId;
        } 

        /**
         * The new internal endpoint of the host. You can set this parameter to a domain name or an IP address.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The ID of the Bastionhost instance where you want to modify the information of the host.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * The new name of the host. The name can be up to 128 characters.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The new description of the host. The value can be up to 500 characters in length.
         */
        public Builder hostPrivateAddress(String hostPrivateAddress) {
            this.putQueryParameter("HostPrivateAddress", hostPrivateAddress);
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }

        /**
         * The region ID of the Bastionhost instance where you want to modify the information of the host.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder hostPublicAddress(String hostPublicAddress) {
            this.putQueryParameter("HostPublicAddress", hostPublicAddress);
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }

        /**
         * You can call this operation to modify the basic information of an on-premises host, an Elastic Compute Service (ECS) instance, or a host in a dedicated cluster.
         * <p>
         * 
         * >  The basic information of ECS instances and hosts in dedicated clusters within your Alibaba Cloud account is synchronized to Bastionhost on a regular basis. After you modify the basic information of an ECS instance or a host in a dedicated cluster, the modification result may be overwritten by the synchronized information.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the host.
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * The new operating system of the host. Valid values:
         * <p>
         * 
         * *   **Linux**
         * *   **Windows**
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyHostRequest build() {
            return new ModifyHostRequest(this);
        } 

    } 

}
