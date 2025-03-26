// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateHighReliablePhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateHighReliablePhysicalConnectionRequest</p>
 */
public class CreateHighReliablePhysicalConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ApList> apList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceAdvancedCapacity")
    private java.util.List<String> deviceAdvancedCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HighReliableType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String highReliableType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateHighReliablePhysicalConnectionRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.apList = builder.apList;
        this.clientToken = builder.clientToken;
        this.deviceAdvancedCapacity = builder.deviceAdvancedCapacity;
        this.dryRun = builder.dryRun;
        this.highReliableType = builder.highReliableType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portType = builder.portType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHighReliablePhysicalConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return apList
     */
    public java.util.List<ApList> getApList() {
        return this.apList;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deviceAdvancedCapacity
     */
    public java.util.List<String> getDeviceAdvancedCapacity() {
        return this.deviceAdvancedCapacity;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return highReliableType
     */
    public String getHighReliableType() {
        return this.highReliableType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return portType
     */
    public String getPortType() {
        return this.portType;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateHighReliablePhysicalConnectionRequest, Builder> {
        private String acceptLanguage; 
        private java.util.List<ApList> apList; 
        private String clientToken; 
        private java.util.List<String> deviceAdvancedCapacity; 
        private String dryRun; 
        private String highReliableType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String portType; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateHighReliablePhysicalConnectionRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.apList = request.apList;
            this.clientToken = request.clientToken;
            this.deviceAdvancedCapacity = request.deviceAdvancedCapacity;
            this.dryRun = request.dryRun;
            this.highReliableType = request.highReliableType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portType = request.portType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
        } 

        /**
         * <p>The language to display the results. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong> (default): Chinese</li>
         * <li><strong>en-US</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The access points.</p>
         * <p>This parameter is required.</p>
         */
        public Builder apList(java.util.List<ApList> apList) {
            this.putQueryParameter("ApList", apList);
            this.apList = apList;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The advanced features of the device.</p>
         */
        public Builder deviceAdvancedCapacity(java.util.List<String> deviceAdvancedCapacity) {
            this.putQueryParameter("DeviceAdvancedCapacity", deviceAdvancedCapacity);
            this.deviceAdvancedCapacity = deviceAdvancedCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The high availability mode. Valid values:</p>
         * <ul>
         * <li><strong>MultiApMultiDevice</strong> : This mode supports two access points and two devices, and provides the maximum disaster recovery capability.</li>
         * <li><strong>MultiApSingleDevice</strong> : This mode supports two access points and one device, and provides robust disaster recovery capability.</li>
         * <li><strong>SingleApMultiDevice</strong> : This mode supports one access point and two devices, and is recommended for non-critical business test and development.</li>
         * <li><strong>SingleApMultiConnection</strong> : This mode supports one access point, one device, and multiple physical ports. Only users in the whitelist can use this mode. To use this mode, contact your account manager.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MultiApMultiDevice</p>
         */
        public Builder highReliableType(String highReliableType) {
            this.putQueryParameter("HighReliableType", highReliableType);
            this.highReliableType = highReliableType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The port type. Valid values:</p>
         * <ul>
         * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-T</strong>: 1,000 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
         * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
         * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
         * </ul>
         * <blockquote>
         * <p> To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000Base-T</p>
         */
        public Builder portType(String portType) {
            this.putQueryParameter("PortType", portType);
            this.portType = portType;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateHighReliablePhysicalConnectionRequest build() {
            return new CreateHighReliablePhysicalConnectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateHighReliablePhysicalConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateHighReliablePhysicalConnectionRequest</p>
     */
    public static class ApList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("CircuitCode")
        private String circuitCode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LineOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String lineOperator;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PeerLocation")
        private String peerLocation;

        @com.aliyun.core.annotation.NameInMap("PortNum")
        private Integer portNum;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ApList(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.bandwidth = builder.bandwidth;
            this.circuitCode = builder.circuitCode;
            this.description = builder.description;
            this.lineOperator = builder.lineOperator;
            this.name = builder.name;
            this.peerLocation = builder.peerLocation;
            this.portNum = builder.portNum;
            this.regionId = builder.regionId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApList create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lineOperator
         */
        public String getLineOperator() {
            return this.lineOperator;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return peerLocation
         */
        public String getPeerLocation() {
            return this.peerLocation;
        }

        /**
         * @return portNum
         */
        public Integer getPortNum() {
            return this.portNum;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessPointId; 
            private Long bandwidth; 
            private String circuitCode; 
            private String description; 
            private String lineOperator; 
            private String name; 
            private String peerLocation; 
            private Integer portNum; 
            private String regionId; 
            private String type; 

            private Builder() {
            } 

            private Builder(ApList model) {
                this.accessPointId = model.accessPointId;
                this.bandwidth = model.bandwidth;
                this.circuitCode = model.circuitCode;
                this.description = model.description;
                this.lineOperator = model.lineOperator;
                this.name = model.name;
                this.peerLocation = model.peerLocation;
                this.portNum = model.portNum;
                this.regionId = model.regionId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the access point that is associated with the Express Connect circuit.</p>
             * <blockquote>
             * <p>Two access points must be specified when <strong>HighReliableType</strong> is set to <strong>MultiApMultiDevice</strong> or <strong>MultiApSingleDevice</strong>. One access point must be specified when <strong>HighReliableType</strong> is set to <strong>SingleApMultiDevice</strong> or <strong>SingleApMultiConnection</strong>.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-cn-beijing-ft-A</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the hosted connection. Unit: Mbit/s.</p>
             * <p>Valid values: 50, 100, 200, 300, 400, 500, 1000, 2000, 4000, 5000, 8000, and 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The circuit code of the Express Connect circuit, which is provided by the connectivity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>longtel001</p>
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * <p>The description of the Express Connect circuit.</p>
             * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>CT</strong>: China Telecom.</li>
             * <li><strong>CU</strong>: China Unicom.</li>
             * <li><strong>CM</strong>: China Mobile.</li>
             * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
             * <li><strong>Equinix</strong>: Equinix.</li>
             * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CT</p>
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * <p>The name of the Express Connect circuit.</p>
             * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or<code> https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The geographical location of the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-test</p>
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
                return this;
            }

            /**
             * <p>The number of ports. Valid values: 2 to 16. This parameter is required only when <strong>HighReliableType</strong> is set to <strong>SingleApMultiConnection</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder portNum(Integer portNum) {
                this.portNum = portNum;
                return this;
            }

            /**
             * <p>The region ID of the Express Connect circuit.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the Express Connect circuit. Default value: <strong>VPC</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ApList build() {
                return new ApList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighReliablePhysicalConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateHighReliablePhysicalConnectionRequest</p>
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
             * <p>The key of tag N to add to the resource. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the resource. Valid values of N: 1 to 20. The tag value cannot be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
