// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyHostRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostRequest</p>
 */
public class ModifyHostRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostPrivateAddress")
    private String hostPrivateAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostPublicAddress")
    private String hostPublicAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
    private String networkDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSType")
    private String OSType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyHostRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.hostId = builder.hostId;
        this.hostName = builder.hostName;
        this.hostPrivateAddress = builder.hostPrivateAddress;
        this.hostPublicAddress = builder.hostPublicAddress;
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
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
     * @return networkDomainId
     */
    public String getNetworkDomainId() {
        return this.networkDomainId;
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
        private String networkDomainId; 
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
            this.networkDomainId = request.networkDomainId;
            this.OSType = request.OSType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The new description of the host. The description can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Host for test.</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the host.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the ID of the host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * <p>The new name of the host. The name can be up to 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>TestHost</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The new internal endpoint of the host. You can set this parameter to a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>193.168.XX.XX</p>
         */
        public Builder hostPrivateAddress(String hostPrivateAddress) {
            this.putQueryParameter("HostPrivateAddress", hostPrivateAddress);
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }

        /**
         * <p>The new public endpoint of the host. You can set this parameter to a domain name or an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>200.1.XX.XX</p>
         */
        public Builder hostPublicAddress(String hostPublicAddress) {
            this.putQueryParameter("HostPublicAddress", hostPublicAddress);
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }

        /**
         * <p>The ID of the bastion host on which you want to modify the information about the host.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the new network domain to which the host belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * <p>The new operating system of the host. Valid values:</p>
         * <ul>
         * <li><strong>Linux</strong></li>
         * <li><strong>Windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        public Builder OSType(String OSType) {
            this.putQueryParameter("OSType", OSType);
            this.OSType = OSType;
            return this;
        }

        /**
         * <p>The region ID of the bastion host on which you want to modify the information about the host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
