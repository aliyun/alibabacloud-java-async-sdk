// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFullNatEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateFullNatEntryRequest</p>
 */
public class CreateFullNatEntryRequest extends Request {
    @Query
    @NameInMap("AccessIp")
    @Validation(required = true)
    private String accessIp;

    @Query
    @NameInMap("AccessPort")
    @Validation(required = true)
    private String accessPort;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("FullNatEntryDescription")
    private String fullNatEntryDescription;

    @Query
    @NameInMap("FullNatEntryName")
    private String fullNatEntryName;

    @Query
    @NameInMap("FullNatTableId")
    @Validation(required = true)
    private String fullNatTableId;

    @Query
    @NameInMap("IpProtocol")
    @Validation(required = true)
    private String ipProtocol;

    @Query
    @NameInMap("NatIp")
    @Validation(required = true)
    private String natIp;

    @Query
    @NameInMap("NatIpPort")
    @Validation(required = true)
    private String natIpPort;

    @Query
    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    private String networkInterfaceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateFullNatEntryRequest(Builder builder) {
        super(builder);
        this.accessIp = builder.accessIp;
        this.accessPort = builder.accessPort;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fullNatEntryDescription = builder.fullNatEntryDescription;
        this.fullNatEntryName = builder.fullNatEntryName;
        this.fullNatTableId = builder.fullNatTableId;
        this.ipProtocol = builder.ipProtocol;
        this.natIp = builder.natIp;
        this.natIpPort = builder.natIpPort;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFullNatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessIp
     */
    public String getAccessIp() {
        return this.accessIp;
    }

    /**
     * @return accessPort
     */
    public String getAccessPort() {
        return this.accessPort;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fullNatEntryDescription
     */
    public String getFullNatEntryDescription() {
        return this.fullNatEntryDescription;
    }

    /**
     * @return fullNatEntryName
     */
    public String getFullNatEntryName() {
        return this.fullNatEntryName;
    }

    /**
     * @return fullNatTableId
     */
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpPort
     */
    public String getNatIpPort() {
        return this.natIpPort;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
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

    public static final class Builder extends Request.Builder<CreateFullNatEntryRequest, Builder> {
        private String accessIp; 
        private String accessPort; 
        private String clientToken; 
        private Boolean dryRun; 
        private String fullNatEntryDescription; 
        private String fullNatEntryName; 
        private String fullNatTableId; 
        private String ipProtocol; 
        private String natIp; 
        private String natIpPort; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFullNatEntryRequest request) {
            super(request);
            this.accessIp = request.accessIp;
            this.accessPort = request.accessPort;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fullNatEntryDescription = request.fullNatEntryDescription;
            this.fullNatEntryName = request.fullNatEntryName;
            this.fullNatTableId = request.fullNatTableId;
            this.ipProtocol = request.ipProtocol;
            this.natIp = request.natIp;
            this.natIpPort = request.natIpPort;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * 需要进行转发的后端IP
         */
        public Builder accessIp(String accessIp) {
            this.putQueryParameter("AccessIp", accessIp);
            this.accessIp = accessIp;
            return this;
        }

        /**
         * 需要进行端口转发的内部端口，取值范围：1~65535。
         */
        public Builder accessPort(String accessPort) {
            this.putQueryParameter("AccessPort", accessPort);
            this.accessPort = accessPort;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * FullNatEntryDescription.
         */
        public Builder fullNatEntryDescription(String fullNatEntryDescription) {
            this.putQueryParameter("FullNatEntryDescription", fullNatEntryDescription);
            this.fullNatEntryDescription = fullNatEntryDescription;
            return this;
        }

        /**
         * FULLNAT规则的名称。 长度为2~128个字符，必须以大小写字母或中文开头，但不能以http://或https://开头。
         */
        public Builder fullNatEntryName(String fullNatEntryName) {
            this.putQueryParameter("FullNatEntryName", fullNatEntryName);
            this.fullNatEntryName = fullNatEntryName;
            return this;
        }

        /**
         * FullNAT条目所属的FullNAT列表的ID。
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.putQueryParameter("FullNatTableId", fullNatTableId);
            this.fullNatTableId = fullNatTableId;
            return this;
        }

        /**
         * 协议类型，取值： • TCP：转发TCP协议的报文。 • UDP：转发UDP协议的报文。
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * 提供入方向访问的IP地址，该公网IP需要是当前VpcNat下的NatIP
         */
        public Builder natIp(String natIp) {
            this.putQueryParameter("NatIp", natIp);
            this.natIp = natIp;
            return this;
        }

        /**
         * 需要进行端口转发的外部端口，取值范围：1~65535。
         */
        public Builder natIpPort(String natIpPort) {
            this.putQueryParameter("NatIpPort", natIpPort);
            this.natIpPort = natIpPort;
            return this;
        }

        /**
         * NetworkInterfaceId.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
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
         * RegionId.
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
        public CreateFullNatEntryRequest build() {
            return new CreateFullNatEntryRequest(this);
        } 

    } 

}
