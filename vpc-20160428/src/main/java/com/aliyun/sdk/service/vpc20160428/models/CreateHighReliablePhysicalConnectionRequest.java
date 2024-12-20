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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apList(java.util.List<ApList> apList) {
            this.putQueryParameter("ApList", apList);
            this.apList = apList;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeviceAdvancedCapacity.
         */
        public Builder deviceAdvancedCapacity(java.util.List<String> deviceAdvancedCapacity) {
            this.putQueryParameter("DeviceAdvancedCapacity", deviceAdvancedCapacity);
            this.deviceAdvancedCapacity = deviceAdvancedCapacity;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
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
         * Tag.
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

            /**
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
             * Bandwidth.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * CircuitCode.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PeerLocation.
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
                return this;
            }

            /**
             * PortNum.
             */
            public Builder portNum(Integer portNum) {
                this.portNum = portNum;
                return this;
            }

            /**
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
             * Type.
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
