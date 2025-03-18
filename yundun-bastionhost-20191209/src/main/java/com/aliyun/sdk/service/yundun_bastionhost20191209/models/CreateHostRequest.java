// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHostRequest} extends {@link RequestModel}
 *
 * <p>CreateHostRequest</p>
 */
public class CreateHostRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activeAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("InstanceRegionId")
    private String instanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
    private String networkDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
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
        this.networkDomainId = builder.networkDomainId;
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
        private String networkDomainId; 
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
            this.networkDomainId = request.networkDomainId;
            this.OSType = request.OSType;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceInstanceId = request.sourceInstanceId;
        } 

        /**
         * <p>The endpoint type of the host that you want to create. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: public endpoint</li>
         * <li><strong>Private</strong>: internal endpoint</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder activeAddressType(String activeAddressType) {
            this.putQueryParameter("ActiveAddressType", activeAddressType);
            this.activeAddressType = activeAddressType;
            return this;
        }

        /**
         * <p>The description of the host that you want to create. The value can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Local Host</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The name of the host that you want to create. The name can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>host01</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The internal endpoint of the host that you want to create. You can set this parameter to a domain name or an IP address.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>ActiveAddressType</strong> parameter is set to <strong>Private</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder hostPrivateAddress(String hostPrivateAddress) {
            this.putQueryParameter("HostPrivateAddress", hostPrivateAddress);
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }

        /**
         * <p>The public endpoint of the host that you want to create. You can set this parameter to a domain name or an IP address.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>ActiveAddressType</strong> parameter is set to <strong>Public</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder hostPublicAddress(String hostPublicAddress) {
            this.putQueryParameter("HostPublicAddress", hostPublicAddress);
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }

        /**
         * <p>The ID of the bastion host in which you want to create the host.</p>
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
         * <p>The ID of the region to which the ECS instance or the host in an ApsaraDB MyBase dedicated cluster belongs.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>Source</strong> parameter is set to <strong>Ecs</strong> or <strong>Rds</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * <p>The ID of the network domain to which the host to be imported belongs.</p>
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
         * <p>The operating system of the host that you want to create. Valid values:</p>
         * <ul>
         * <li><strong>Linux</strong></li>
         * <li><strong>Windows</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The region ID of the bastion host to which you want to import the host.</p>
         * <blockquote>
         * <p>For information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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

        /**
         * <p>The source of the host that you want to create. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: a host in a data center</li>
         * <li><strong>Ecs</strong>: an Elastic Compute Service (ECS) instance</li>
         * <li><strong>Rds</strong>: a host in an ApsaraDB MyBase dedicated cluster</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The ID of the ECS instance or the host in an ApsaraDB MyBase dedicated cluster.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>Source</strong> parameter is set to <strong>Ecs</strong> or <strong>Rds</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-dfabfda</p>
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
