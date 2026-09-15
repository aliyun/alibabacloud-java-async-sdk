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
 * {@link CreateExpressCloudConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressCloudConnectionRequest</p>
 */
public class CreateExpressCloudConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactMail")
    private String contactMail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTel")
    private String contactTel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IDCardNo")
    private String IDCardNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdcSP")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idcSP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerCity")
    private String peerCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String peerLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortType")
    private String portType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedundantEccId")
    private String redundantEccId;

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

    private CreateExpressCloudConnectionRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.contactMail = builder.contactMail;
        this.contactTel = builder.contactTel;
        this.description = builder.description;
        this.IDCardNo = builder.IDCardNo;
        this.idcSP = builder.idcSP;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerCity = builder.peerCity;
        this.peerLocation = builder.peerLocation;
        this.portType = builder.portType;
        this.redundantEccId = builder.redundantEccId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressCloudConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return contactMail
     */
    public String getContactMail() {
        return this.contactMail;
    }

    /**
     * @return contactTel
     */
    public String getContactTel() {
        return this.contactTel;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return IDCardNo
     */
    public String getIDCardNo() {
        return this.IDCardNo;
    }

    /**
     * @return idcSP
     */
    public String getIdcSP() {
        return this.idcSP;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return peerCity
     */
    public String getPeerCity() {
        return this.peerCity;
    }

    /**
     * @return peerLocation
     */
    public String getPeerLocation() {
        return this.peerLocation;
    }

    /**
     * @return portType
     */
    public String getPortType() {
        return this.portType;
    }

    /**
     * @return redundantEccId
     */
    public String getRedundantEccId() {
        return this.redundantEccId;
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

    public static final class Builder extends Request.Builder<CreateExpressCloudConnectionRequest, Builder> {
        private Integer bandwidth; 
        private String contactMail; 
        private String contactTel; 
        private String description; 
        private String IDCardNo; 
        private String idcSP; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerCity; 
        private String peerLocation; 
        private String portType; 
        private String redundantEccId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressCloudConnectionRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.contactMail = request.contactMail;
            this.contactTel = request.contactTel;
            this.description = request.description;
            this.IDCardNo = request.IDCardNo;
            this.idcSP = request.idcSP;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerCity = request.peerCity;
            this.peerLocation = request.peerLocation;
            this.portType = request.portType;
            this.redundantEccId = request.redundantEccId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The bandwidth of the Express Cloud Connection instance, which corresponds to the bandwidth of the underlying physical connection.</p>
         * <p>Unit: Mbit/s.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The email address of the contact person for the Express Cloud Connection application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:XX@example.com">XX@example.com</a></p>
         */
        public Builder contactMail(String contactMail) {
            this.putQueryParameter("ContactMail", contactMail);
            this.contactMail = contactMail;
            return this;
        }

        /**
         * <p>The phone number of the contact person for the Express Cloud Connection application.</p>
         * 
         * <strong>example:</strong>
         * <p>132*********</p>
         */
        public Builder contactTel(String contactTel) {
            this.putQueryParameter("ContactTel", contactTel);
            this.contactTel = contactTel;
            return this;
        }

        /**
         * <p>The description of the Express Cloud Connection instance.</p>
         * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character, but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>高速上云服务</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID card number of the contact person for the Express Cloud Connection application.</p>
         * 
         * <strong>example:</strong>
         * <p>32*****************</p>
         */
        public Builder IDCardNo(String IDCardNo) {
            this.putQueryParameter("IDCardNo", IDCardNo);
            this.IDCardNo = IDCardNo;
            return this;
        }

        /**
         * <p>The network service provider of the IDC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CU</p>
         */
        public Builder idcSP(String idcSP) {
            this.putQueryParameter("IdcSP", idcSP);
            this.idcSP = idcSP;
            return this;
        }

        /**
         * <p>The name of the Express Cloud Connection instance.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-), but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The city where the on-premises IDC is located.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        public Builder peerCity(String peerCity) {
            this.putQueryParameter("PeerCity", peerCity);
            this.peerCity = peerCity;
            return this;
        }

        /**
         * <p>The geographic location of the on-premises data center.</p>
         * <blockquote>
         * <p>The location must be accurate to the street number, floor, room number, and rack number.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>市</strong>区/县<strong>路</strong>号<strong>物业或楼宇名称</strong>座<strong>楼层</strong>房间号<strong>机柜号</strong>机柜名称<strong>设备</strong>端口</p>
         */
        public Builder peerLocation(String peerLocation) {
            this.putQueryParameter("PeerLocation", peerLocation);
            this.peerLocation = peerLocation;
            return this;
        }

        /**
         * <p>The port type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><p>100Base-T: 100M Ethernet port</p>
         * </li>
         * <li><p>1000Base-T (default): GE electrical port</p>
         * </li>
         * <li><p>1000Base-LX: GE single-mode optical port (10 km)</p>
         * </li>
         * <li><p>10GBase-T: 10 GE electrical port</p>
         * </li>
         * <li><p>10GBase-LR: 10 GE single-mode optical port (10 km)</p>
         * </li>
         * </ul>
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
         * <p>The instance ID of the redundant Express Cloud Connection circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>ecc-d****</p>
         */
        public Builder redundantEccId(String redundantEccId) {
            this.putQueryParameter("RedundantEccId", redundantEccId);
            this.redundantEccId = redundantEccId;
            return this;
        }

        /**
         * <p>The region ID of the Express Cloud Connection instance.</p>
         * <p>This parameter is required.</p>
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
        public CreateExpressCloudConnectionRequest build() {
            return new CreateExpressCloudConnectionRequest(this);
        } 

    } 

}
