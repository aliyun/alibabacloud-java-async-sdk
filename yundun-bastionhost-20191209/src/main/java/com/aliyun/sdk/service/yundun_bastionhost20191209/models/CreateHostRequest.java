// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostRequest} extends {@link RequestModel}
 *
 * <p>CreateHostRequest</p>
 */
public class CreateHostRequest extends Request {
    @Query
    @NameInMap("ActiveAddressType")
    @Validation(required = true)
    private String activeAddressType;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("HostName")
    @Validation(required = true)
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
    @NameInMap("InstanceRegionId")
    private String instanceRegionId;

    @Query
    @NameInMap("OSType")
    @Validation(required = true)
    private String OSType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    private CreateHostRequest(Builder builder) {
        super(builder);
        this.activeAddressType = builder.activeAddressType;
        this.comment = builder.comment;
        this.hostName = builder.hostName;
        this.hostPrivateAddress = builder.hostPrivateAddress;
        this.hostPublicAddress = builder.hostPublicAddress;
        this.instanceId = builder.instanceId;
        this.instanceRegionId = builder.instanceRegionId;
        this.OSType = builder.OSType;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.sourceInstanceId = builder.sourceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeAddressType
     */
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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
     * @return instanceRegionId
     */
    public String getInstanceRegionId() {
        return this.instanceRegionId;
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

    public static final class Builder extends Request.Builder<CreateHostRequest, Builder> {
        private String activeAddressType; 
        private String comment; 
        private String hostName; 
        private String hostPrivateAddress; 
        private String hostPublicAddress; 
        private String instanceId; 
        private String instanceRegionId; 
        private String OSType; 
        private String regionId; 
        private String source; 
        private String sourceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHostRequest request) {
            super(request);
            this.activeAddressType = request.activeAddressType;
            this.comment = request.comment;
            this.hostName = request.hostName;
            this.hostPrivateAddress = request.hostPrivateAddress;
            this.hostPublicAddress = request.hostPublicAddress;
            this.instanceId = request.instanceId;
            this.instanceRegionId = request.instanceRegionId;
            this.OSType = request.OSType;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceInstanceId = request.sourceInstanceId;
        } 

        /**
         * The endpoint type of the host that you want to create. Valid values:
         * <p>
         * 
         * *   **Public**: a public endpoint
         * *   **Private**: an internal endpoint
         */
        public Builder activeAddressType(String activeAddressType) {
            this.putQueryParameter("ActiveAddressType", activeAddressType);
            this.activeAddressType = activeAddressType;
            return this;
        }

        /**
         * The description of the host that you want to create. The value can be up to 500 characters.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The name of the host that you want to create. The name can be up to 128 characters in length.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The internal endpoint of the host that you want to create. You can set this parameter to a domain name or an IP address.
         * <p>
         * 
         * >  This parameter is required if the **ActiveAddressType** parameter is set to **Private**.
         */
        public Builder hostPrivateAddress(String hostPrivateAddress) {
            this.putQueryParameter("HostPrivateAddress", hostPrivateAddress);
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }

        /**
         * The public endpoint of the host that you want to create. You can set this parameter to a domain name or an IP address.
         * <p>
         * 
         * >  This parameter is required if the **ActiveAddressType** parameter is set to **Public**.
         */
        public Builder hostPublicAddress(String hostPublicAddress) {
            this.putQueryParameter("HostPublicAddress", hostPublicAddress);
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }

        /**
         * The ID of the Bastionhost instance where you want to create the host.
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
         * The ID of the region where the ECS instance or dedicated cluster host that you want to create resides.
         * <p>
         * 
         * >  This parameter is required if the **Source** parameter is set to **Ecs** or **Rds**.
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * The operating system of the host that you want to create. Valid values:
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
         * The region ID of the Bastionhost instance where you want to create the host.
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
         * The source of the host that you want to create. Valid values:
         * <p>
         * 
         * *   **Local**: an on-premises host
         * *   **Ecs**: an Elastic Compute Service (ECS) instance
         * *   **Rds**: a host in a dedicated cluster
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the ECS instance or dedicated cluster host that you want to create.
         * <p>
         * 
         * >  This parameter is required if the **Source** parameter is set to **Ecs** or **Rds**.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        @Override
        public CreateHostRequest build() {
            return new CreateHostRequest(this);
        } 

    } 

}
