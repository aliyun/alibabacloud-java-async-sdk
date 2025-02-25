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
 * {@link CreatePhysicalConnectionSetupOrderRequest} extends {@link RequestModel}
 *
 * <p>CreatePhysicalConnectionSetupOrderRequest</p>
 */
public class CreatePhysicalConnectionSetupOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineOperator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lineOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortType")
    private String portType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedundantPhysicalConnectionId")
    private String redundantPhysicalConnectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreatePhysicalConnectionSetupOrderRequest(Builder builder) {
        super(builder);
        this.accessPointId = builder.accessPointId;
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.lineOperator = builder.lineOperator;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portType = builder.portType;
        this.redundantPhysicalConnectionId = builder.redundantPhysicalConnectionId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionSetupOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return lineOperator
     */
    public String getLineOperator() {
        return this.lineOperator;
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
     * @return redundantPhysicalConnectionId
     */
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreatePhysicalConnectionSetupOrderRequest, Builder> {
        private String accessPointId; 
        private Boolean autoPay; 
        private String clientToken; 
        private String lineOperator; 
        private String ownerAccount; 
        private Long ownerId; 
        private String portType; 
        private String redundantPhysicalConnectionId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePhysicalConnectionSetupOrderRequest request) {
            super(request);
            this.accessPointId = request.accessPointId;
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.lineOperator = request.lineOperator;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portType = request.portType;
            this.redundantPhysicalConnectionId = request.redundantPhysicalConnectionId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the access point.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-beijing-ft-A</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payments. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): disables automatic payment.</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>318BB676-0A2B-43A0-9AD8-F1D34E93750F</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom</li>
         * <li><strong>CU</strong>: China Unicom</li>
         * <li><strong>CM</strong>: China Mobile</li>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland</li>
         * <li><strong>Equinix</strong>: Equinix</li>
         * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        public Builder lineOperator(String lineOperator) {
            this.putQueryParameter("LineOperator", lineOperator);
            this.lineOperator = lineOperator;
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
         * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-T</strong> (default): 1,000 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
         * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
         * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
         * </ul>
         * <blockquote>
         * <p> Whether 40GBase-LR and 100GBase-LR ports can be created depends on resource supplies. For more information, contact your account manager.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100Base-T</p>
         */
        public Builder portType(String portType) {
            this.putQueryParameter("PortType", portType);
            this.portType = portType;
            return this;
        }

        /**
         * <p>The ID of the redundant physical connection. The redundant physical connection must be in the <strong>Allocated</strong>, <strong>Confirmed</strong>, or <strong>Enabled</strong> state.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp10zsv5ntp****</p>
         */
        public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.putQueryParameter("RedundantPhysicalConnectionId", redundantPhysicalConnectionId);
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public CreatePhysicalConnectionSetupOrderRequest build() {
            return new CreatePhysicalConnectionSetupOrderRequest(this);
        } 

    } 

}
