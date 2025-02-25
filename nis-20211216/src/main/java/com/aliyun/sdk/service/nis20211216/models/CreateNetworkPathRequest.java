// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Tag> tag;

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
    public java.util.List < Tag> getTag() {
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
        private java.util.List < Tag> tag; 
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
         * The description of the network path.
         */
        public Builder networkPathDescription(String networkPathDescription) {
            this.putQueryParameter("NetworkPathDescription", networkPathDescription);
            this.networkPathDescription = networkPathDescription;
            return this;
        }

        /**
         * The name of the network path.
         */
        public Builder networkPathName(String networkPathName) {
            this.putQueryParameter("NetworkPathName", networkPathName);
            this.networkPathName = networkPathName;
            return this;
        }

        /**
         * The protocol type. Valid values:
         * <p>
         * 
         * *   **tcp**: Transmission Control Protocol (TCP)
         * *   **udp**: User Datagram Protocol (UDP)
         * *   **icmp**: Internet Control Message Protocol (ICMP)
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The region ID of the network path that you want to create.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the source resource.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The source IP address.
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * The source port.
         */
        public Builder sourcePort(Integer sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * The type of the source resource. Valid values:
         * <p>
         * 
         * *   **ecs**: the Elastic Compute Service (ECS) instance
         * *   **internetIp**: the public IP address
         * *   **vsw**: the vSwitch
         * *   **vpn**: the VPN gateway
         * *   **vbr**: the virtual border router (VBR)
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The tags to add to the resource.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the destination resource.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The destination IP address.
         */
        public Builder targetIpAddress(String targetIpAddress) {
            this.putQueryParameter("TargetIpAddress", targetIpAddress);
            this.targetIpAddress = targetIpAddress;
            return this;
        }

        /**
         * The destination port.
         */
        public Builder targetPort(Integer targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * The type of the destination resource. Valid values:
         * <p>
         * 
         * *   **ecs**: the ECS instance
         * *   **internetIp**: the public IP address
         * *   **vsw**: the vSwitch
         * *   **vpn**: the VPN gateway
         * *   **vbr**: the VBR
         * *   **clb**: the Classic Load Balancer (CLB) instance
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

            /**
             * The key of tag N to add to the resource. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.
             * <p>
             * 
             * You can add up to 20 tags in each call.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.
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
