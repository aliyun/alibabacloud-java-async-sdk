// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link CreateNetworkPathRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkPathRequest</p>
 */
public class CreateNetworkPathRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPathDescription")
    private String networkPathDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPathName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkPathName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIpAddress")
    private String sourceIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePort")
    private Integer sourcePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIpAddress")
    private String targetIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPort")
    private Integer targetPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private CreateNetworkPathRequest(Builder builder) {
        super(builder);
        this.networkPathDescription = builder.networkPathDescription;
        this.networkPathName = builder.networkPathName;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceId = builder.sourceId;
        this.sourceIpAddress = builder.sourceIpAddress;
        this.sourcePort = builder.sourcePort;
        this.sourceType = builder.sourceType;
        this.tag = builder.tag;
        this.targetId = builder.targetId;
        this.targetIpAddress = builder.targetIpAddress;
        this.targetPort = builder.targetPort;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkPathRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPathDescription
     */
    public String getNetworkPathDescription() {
        return this.networkPathDescription;
    }

    /**
     * @return networkPathName
     */
    public String getNetworkPathName() {
        return this.networkPathName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * @return sourcePort
     */
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetIpAddress
     */
    public String getTargetIpAddress() {
        return this.targetIpAddress;
    }

    /**
     * @return targetPort
     */
    public Integer getTargetPort() {
        return this.targetPort;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateNetworkPathRequest, Builder> {
        private String networkPathDescription; 
        private String networkPathName; 
        private String protocol; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceId; 
        private String sourceIpAddress; 
        private Integer sourcePort; 
        private String sourceType; 
        private java.util.List<Tag> tag; 
        private String targetId; 
        private String targetIpAddress; 
        private Integer targetPort; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkPathRequest request) {
            super(request);
            this.networkPathDescription = request.networkPathDescription;
            this.networkPathName = request.networkPathName;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceId = request.sourceId;
            this.sourceIpAddress = request.sourceIpAddress;
            this.sourcePort = request.sourcePort;
            this.sourceType = request.sourceType;
            this.tag = request.tag;
            this.targetId = request.targetId;
            this.targetIpAddress = request.targetIpAddress;
            this.targetPort = request.targetPort;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The description of the network path.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyze the path from ECS to ECS</p>
         */
        public Builder networkPathDescription(String networkPathDescription) {
            this.putQueryParameter("NetworkPathDescription", networkPathDescription);
            this.networkPathDescription = networkPathDescription;
            return this;
        }

        /**
         * <p>The name of the network path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs2PublicIp</p>
         */
        public Builder networkPathName(String networkPathName) {
            this.putQueryParameter("NetworkPathName", networkPathName);
            this.networkPathName = networkPathName;
            return this;
        }

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: Transmission Control Protocol (TCP)</li>
         * <li><strong>udp</strong>: User Datagram Protocol (UDP)</li>
         * <li><strong>icmp</strong>: Internet Control Message Protocol (ICMP)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The region ID of the network path that you want to create.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm27qsxjj****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the source resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zef4ngqfarepyun****</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.17.XX.XX</p>
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * <p>The source port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder sourcePort(Integer sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * <p>The type of the source resource. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: the Elastic Compute Service (ECS) instance</li>
         * <li><strong>internetIp</strong>: the public IP address</li>
         * <li><strong>vsw</strong>: the vSwitch</li>
         * <li><strong>vpn</strong>: the VPN gateway</li>
         * <li><strong>vbr</strong>: the virtual border router (VBR)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The tags to add to the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the destination resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13d0e064gubm****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.210</p>
         */
        public Builder targetIpAddress(String targetIpAddress) {
            this.putQueryParameter("TargetIpAddress", targetIpAddress);
            this.targetIpAddress = targetIpAddress;
            return this;
        }

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder targetPort(Integer targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * <p>The type of the destination resource. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: the ECS instance</li>
         * <li><strong>internetIp</strong>: the public IP address</li>
         * <li><strong>vsw</strong>: the vSwitch</li>
         * <li><strong>vpn</strong>: the VPN gateway</li>
         * <li><strong>vbr</strong>: the VBR</li>
         * <li><strong>clb</strong>: the Classic Load Balancer (CLB) instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateNetworkPathRequest build() {
            return new CreateNetworkPathRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkPathRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkPathRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N to add to the resource. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * <p>You can add up to 20 tags in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>role</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ops</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
