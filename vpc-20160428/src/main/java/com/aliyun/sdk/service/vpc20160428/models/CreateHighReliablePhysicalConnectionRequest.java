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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong> (default): Chinese.</li>
         * <li><strong>en-US</strong>: English.</li>
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
         * <p>The list of access points.</p>
         * <p>This parameter is required.</p>
         */
        public Builder apList(java.util.List<ApList> apList) {
            this.putQueryParameter("ApList", apList);
            this.apList = apList;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>The list of advanced device capabilities.</p>
         */
        public Builder deviceAdvancedCapacity(java.util.List<String> deviceAdvancedCapacity) {
            this.putQueryParameter("DeviceAdvancedCapacity", deviceAdvancedCapacity);
            this.deviceAdvancedCapacity = deviceAdvancedCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run without creating the instance. The system checks the required parameters, request format, and instance status. If the check fails, the error code <code>DRYRUN.FAIL</code> is returned along with the corresponding error list. If the check succeeds, the code <code>DRYRUN.SUCCESS</code> is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends the request. After the request passes the check, the instance is created.</p>
         * </li>
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
         * <p>The zone redundancy mode. Valid values:</p>
         * <ul>
         * <li><strong>MultiApMultiDevice</strong>: Maximum disaster recovery. This mode uses two different access points and two different devices, providing maximum disaster recovery.</li>
         * <li><strong>MultiApSingleDevice</strong>: Enhanced disaster recovery. This mode uses two different access points and one device, providing enhanced disaster recovery.</li>
         * <li><strong>SingleApMultiDevice</strong>: Development and testing. This mode uses one access point and two devices. It is recommended only for development and testing of non-critical workloads.</li>
         * <li><strong>SingleApMultiConnection</strong>: High-bandwidth load balancing. This mode is available only to users in the whitelist. It uses one access point, one device, and multiple physical ports. Contact your account manager if you need this mode.</li>
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
         * <p>The port type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><p><strong>1000Base-LX</strong>: GE single-mode optical port (10 km).</p>
         * </li>
         * <li><p><strong>10GBase-LR</strong>: 10 GE single-mode optical port (10 km).</p>
         * </li>
         * <li><p><strong>40GBase-LR</strong>: 40 GE single-mode optical port.</p>
         * </li>
         * <li><p><strong>100GBase-LR</strong>: 100 GE single-mode optical port.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>40GBase-LR and 100GBase-LR are subject to the actual port availability in the backend. Contact your account manager for port availability details.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000Base-LX</p>
         */
        public Builder portType(String portType) {
            this.putQueryParameter("PortType", portType);
            this.portType = portType;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The ID of the resource group to which the Express Connect circuit belongs.</p>
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
         * <p>The list of tags.</p>
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

        @com.aliyun.core.annotation.NameInMap("OpticalModuleModel")
        private String opticalModuleModel;

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
            this.opticalModuleModel = builder.opticalModuleModel;
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
         * @return opticalModuleModel
         */
        public String getOpticalModuleModel() {
            return this.opticalModuleModel;
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
            private String opticalModuleModel; 
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
                this.opticalModuleModel = model.opticalModuleModel;
                this.peerLocation = model.peerLocation;
                this.portNum = model.portNum;
                this.regionId = model.regionId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the access point where the Express Connect circuit is located.</p>
             * <blockquote>
             * <p>When <strong>HighReliableType</strong> is set to <strong>MultiApMultiDevice</strong> or <strong>MultiApSingleDevice</strong>, you must specify two different access points. When <strong>HighReliableType</strong> is set to <strong>SingleApMultiDevice</strong> or <strong>SingleApMultiConnection</strong>, you must specify one access point.</p>
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
             * <p>The bandwidth of the shared Express Connect circuits. Unit: Mbit/s.</p>
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
             * <p>The circuit code provided by the connectivity provider for the Express Connect circuit.</p>
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
             * <p>The description must be 2 to 256 characters in length, and must start with a letter or Chinese character, but cannot start with <code>http://</code> or <code>https://</code>.</p>
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
             * <li><p><strong>CT</strong>: China Telecom.</p>
             * </li>
             * <li><p><strong>CU</strong>: China Unicom.</p>
             * </li>
             * <li><p><strong>CM</strong>: China Mobile.</p>
             * </li>
             * <li><p><strong>CO</strong>: Other Chinese carriers. </p>
             * </li>
             * <li><p><strong>Equinix</strong>: Equinix.</p>
             * </li>
             * <li><p><strong>Other</strong>: Other carriers outside the Chinese mainland.</p>
             * </li>
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
             * <p>The name of the Express Connect circuit.  </p>
             * <p>The name must be 2 to 128 characters in length, and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-), but cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The optical module model supported by the Express Connect circuit access point. Valid values:</p>
             * <ul>
             * <li>1000Base-LX : <ul>
             * <li><code>SFP-GE-LR-SM1310,10KM</code></li>
             * <li><code>SFP-GE-ER-SM1310,40KM</code></li>
             * <li><code>SFP-GE-ZR-SM1550,80KM</code></li>
             * </ul>
             * </li>
             * <li>10GBase-LR : <ul>
             * <li><code>SFP-10G-LR-SM1310,10KM</code></li>
             * <li><code>SFP-10G-ER-SM1550,40KM</code> </li>
             * <li><code>SFP-10G-ZR-SM1550,80KM</code></li>
             * </ul>
             * </li>
             * <li>40GBase-LR ： <ul>
             * <li><code>QSFP-40G-LR4-WDM1300,10KM</code></li>
             * <li><code>QSFP-40G-ER4-WDM1300,40KM</code></li>
             * <li><code>QSFP-40G-ZR4-WDM1300,80KM</code></li>
             * </ul>
             * </li>
             * <li>100GBase-LR ： <ul>
             * <li><code>QSFP28-100G-LR4-WDM1300,10KM</code></li>
             * <li><code>QSFP28-100G-ER4-WDM1300,40KM</code></li>
             * <li><code>QSFP28-100G-ZR4-WDM1300,80KM</code></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SFP-GE-LR-SM1310,10KM</p>
             */
            public Builder opticalModuleModel(String opticalModuleModel) {
                this.opticalModuleModel = opticalModuleModel;
                return this;
            }

            /**
             * <p>The geographical location of the on-premises data center.</p>
             * 
             * <strong>example:</strong>
             * <p>XX Street</p>
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
                return this;
            }

            /**
             * <p>The number of ports. This parameter is required only when <strong>HighReliableType</strong> is set to <strong>SingleApMultiConnection</strong>. Valid values: 2 to 16.</p>
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
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length, and must start with a letter or Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length, and must start with a letter or Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
