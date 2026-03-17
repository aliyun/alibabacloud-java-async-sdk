// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link CreateSmartAccessGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateSmartAccessGatewayRequest</p>
 */
public class CreateSmartAccessGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlreadyHaveSag")
    private Boolean alreadyHaveSag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyerMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyerMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CPEVersion")
    private String CPEVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HardWareSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hardWareSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBandWidth")
    private Integer maxBandWidth;

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
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverCity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverCountry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverCountry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverDistrict")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverDistrict;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverMobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverPhone")
    private String receiverPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverState")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverTown")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverTown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverZip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverZip;

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

    private CreateSmartAccessGatewayRequest(Builder builder) {
        super(builder);
        this.alreadyHaveSag = builder.alreadyHaveSag;
        this.autoPay = builder.autoPay;
        this.buyerMessage = builder.buyerMessage;
        this.CPEVersion = builder.CPEVersion;
        this.chargeType = builder.chargeType;
        this.description = builder.description;
        this.haType = builder.haType;
        this.hardWareSpec = builder.hardWareSpec;
        this.maxBandWidth = builder.maxBandWidth;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.receiverAddress = builder.receiverAddress;
        this.receiverCity = builder.receiverCity;
        this.receiverCountry = builder.receiverCountry;
        this.receiverDistrict = builder.receiverDistrict;
        this.receiverEmail = builder.receiverEmail;
        this.receiverMobile = builder.receiverMobile;
        this.receiverName = builder.receiverName;
        this.receiverPhone = builder.receiverPhone;
        this.receiverState = builder.receiverState;
        this.receiverTown = builder.receiverTown;
        this.receiverZip = builder.receiverZip;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmartAccessGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alreadyHaveSag
     */
    public Boolean getAlreadyHaveSag() {
        return this.alreadyHaveSag;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return buyerMessage
     */
    public String getBuyerMessage() {
        return this.buyerMessage;
    }

    /**
     * @return CPEVersion
     */
    public String getCPEVersion() {
        return this.CPEVersion;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return haType
     */
    public String getHaType() {
        return this.haType;
    }

    /**
     * @return hardWareSpec
     */
    public String getHardWareSpec() {
        return this.hardWareSpec;
    }

    /**
     * @return maxBandWidth
     */
    public Integer getMaxBandWidth() {
        return this.maxBandWidth;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return receiverAddress
     */
    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    /**
     * @return receiverCity
     */
    public String getReceiverCity() {
        return this.receiverCity;
    }

    /**
     * @return receiverCountry
     */
    public String getReceiverCountry() {
        return this.receiverCountry;
    }

    /**
     * @return receiverDistrict
     */
    public String getReceiverDistrict() {
        return this.receiverDistrict;
    }

    /**
     * @return receiverEmail
     */
    public String getReceiverEmail() {
        return this.receiverEmail;
    }

    /**
     * @return receiverMobile
     */
    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    /**
     * @return receiverName
     */
    public String getReceiverName() {
        return this.receiverName;
    }

    /**
     * @return receiverPhone
     */
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    /**
     * @return receiverState
     */
    public String getReceiverState() {
        return this.receiverState;
    }

    /**
     * @return receiverTown
     */
    public String getReceiverTown() {
        return this.receiverTown;
    }

    /**
     * @return receiverZip
     */
    public String getReceiverZip() {
        return this.receiverZip;
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

    public static final class Builder extends Request.Builder<CreateSmartAccessGatewayRequest, Builder> {
        private Boolean alreadyHaveSag; 
        private Boolean autoPay; 
        private String buyerMessage; 
        private String CPEVersion; 
        private String chargeType; 
        private String description; 
        private String haType; 
        private String hardWareSpec; 
        private Integer maxBandWidth; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String receiverAddress; 
        private String receiverCity; 
        private String receiverCountry; 
        private String receiverDistrict; 
        private String receiverEmail; 
        private String receiverMobile; 
        private String receiverName; 
        private String receiverPhone; 
        private String receiverState; 
        private String receiverTown; 
        private String receiverZip; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmartAccessGatewayRequest request) {
            super(request);
            this.alreadyHaveSag = request.alreadyHaveSag;
            this.autoPay = request.autoPay;
            this.buyerMessage = request.buyerMessage;
            this.CPEVersion = request.CPEVersion;
            this.chargeType = request.chargeType;
            this.description = request.description;
            this.haType = request.haType;
            this.hardWareSpec = request.hardWareSpec;
            this.maxBandWidth = request.maxBandWidth;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.receiverAddress = request.receiverAddress;
            this.receiverCity = request.receiverCity;
            this.receiverCountry = request.receiverCountry;
            this.receiverDistrict = request.receiverDistrict;
            this.receiverEmail = request.receiverEmail;
            this.receiverMobile = request.receiverMobile;
            this.receiverName = request.receiverName;
            this.receiverPhone = request.receiverPhone;
            this.receiverState = request.receiverState;
            this.receiverTown = request.receiverTown;
            this.receiverZip = request.receiverZip;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>Specifies whether you already have an SAG device. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder alreadyHaveSag(Boolean alreadyHaveSag) {
            this.putQueryParameter("AlreadyHaveSag", alreadyHaveSag);
            this.alreadyHaveSag = alreadyHaveSag;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-payment for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <p>If you set the parameter to false, go to Billing Management to complete the payment after you call this operation. After you complete the payment, the instance can be created.</p>
         * <p>This parameter is required.</p>
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
         * <p>The remarks left by the buyer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Remarks</p>
         */
        public Builder buyerMessage(String buyerMessage) {
            this.putQueryParameter("BuyerMessage", buyerMessage);
            this.buyerMessage = buyerMessage;
            return this;
        }

        /**
         * <p>The edition of SAG when you create an SAG vCPE instance.</p>
         * <p>Set the value to <strong>basic</strong>, which specifies Basic Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder CPEVersion(String CPEVersion) {
            this.putQueryParameter("CPEVersion", CPEVersion);
            this.CPEVersion = CPEVersion;
            return this;
        }

        /**
         * <p>The billing method of the SAG instance.</p>
         * <p>Set the value to <strong>PREPAY</strong>, which specifies the subscription billing method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The description of the SAG instance.</p>
         * <p>The description must be 2 to 256 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The deployment mode. Valid values:</p>
         * <ul>
         * <li><strong>no_backup</strong>: You buy only one SAG device to connect private networks to Alibaba Cloud.</li>
         * <li><strong>cold_backup</strong>: You buy two SAG devices in active-standby mode. One SAG device serves as an active device and the other serves as a standby device. Only the active device is connected to Alibaba Cloud. If the active device is not working as expected, you must manually perform a switchover.</li>
         * <li><strong>warm_backup</strong>: You buy two SAG devices in active-active mode. Both SAG devices are connected to Alibaba Cloud. If an active device is not working as expected, a failover is automatically performed.</li>
         * </ul>
         * <blockquote>
         * <p> If you want to create an SAG vCPE instance, set the value to <strong>warm_backup</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>no_backup</p>
         */
        public Builder haType(String haType) {
            this.putQueryParameter("HaType", haType);
            this.haType = haType;
            return this;
        }

        /**
         * <p>The type of the SAG instance. Valid values:</p>
         * <ul>
         * <li><strong>sag-100wm</strong></li>
         * <li><strong>sag-1000</strong></li>
         * <li><strong>sag-vcpe</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-100wm</p>
         */
        public Builder hardWareSpec(String hardWareSpec) {
            this.putQueryParameter("HardWareSpec", hardWareSpec);
            this.hardWareSpec = hardWareSpec;
            return this;
        }

        /**
         * <p>The bandwidth of the SAG instance.</p>
         * <ul>
         * <li>If you want to create an SAG CPE instance and the model is <strong>sag-100wm</strong>, valid values of this parameter are <strong>2</strong> to <strong>50</strong>. Unit: Mbit/s.</li>
         * <li>If you want to create an SAG CPE instance and the model is <strong>sag-1000</strong>, valid values of this parameter are <strong>10</strong> to <strong>500</strong>. Unit: Mbit/s.</li>
         * <li>If you want to create an SAG vCPE instance, valid values of this parameter are <strong>10</strong> to <strong>1000</strong>. Unit: Mbit/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder maxBandWidth(Integer maxBandWidth) {
            this.putQueryParameter("MaxBandWidth", maxBandWidth);
            this.maxBandWidth = maxBandWidth;
            return this;
        }

        /**
         * <p>The name of the SAG instance.</p>
         * <p>The name must be 2 to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
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
         * <p>The subscription period of the SAG instance. Unit: months.</p>
         * <p>Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The detailed address of the recipient.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>No.XX</p>
         */
        public Builder receiverAddress(String receiverAddress) {
            this.putQueryParameter("ReceiverAddress", receiverAddress);
            this.receiverAddress = receiverAddress;
            return this;
        }

        /**
         * <p>The city of the recipient address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        public Builder receiverCity(String receiverCity) {
            this.putQueryParameter("ReceiverCity", receiverCity);
            this.receiverCity = receiverCity;
            return this;
        }

        /**
         * <p>The country of the recipient address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        public Builder receiverCountry(String receiverCountry) {
            this.putQueryParameter("ReceiverCountry", receiverCountry);
            this.receiverCountry = receiverCountry;
            return this;
        }

        /**
         * <p>The district of the recipient address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>West Lake</p>
         */
        public Builder receiverDistrict(String receiverDistrict) {
            this.putQueryParameter("ReceiverDistrict", receiverDistrict);
            this.receiverDistrict = receiverDistrict;
            return this;
        }

        /**
         * <p>The email address of the recipient.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xx@example.com">xx@example.com</a></p>
         */
        public Builder receiverEmail(String receiverEmail) {
            this.putQueryParameter("ReceiverEmail", receiverEmail);
            this.receiverEmail = receiverEmail;
            return this;
        }

        /**
         * <p>The mobile phone number of the recipient.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1884085****</p>
         */
        public Builder receiverMobile(String receiverMobile) {
            this.putQueryParameter("ReceiverMobile", receiverMobile);
            this.receiverMobile = receiverMobile;
            return this;
        }

        /**
         * <p>The name of the recipient.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder receiverName(String receiverName) {
            this.putQueryParameter("ReceiverName", receiverName);
            this.receiverName = receiverName;
            return this;
        }

        /**
         * <p>The landline phone number of the recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>8585****</p>
         */
        public Builder receiverPhone(String receiverPhone) {
            this.putQueryParameter("ReceiverPhone", receiverPhone);
            this.receiverPhone = receiverPhone;
            return this;
        }

        /**
         * <p>The province of the recipient address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        public Builder receiverState(String receiverState) {
            this.putQueryParameter("ReceiverState", receiverState);
            this.receiverState = receiverState;
            return this;
        }

        /**
         * <p>The town of the recipient address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhuan Tang</p>
         */
        public Builder receiverTown(String receiverTown) {
            this.putQueryParameter("ReceiverTown", receiverTown);
            this.receiverTown = receiverTown;
            return this;
        }

        /**
         * <p>The postcode of the recipient address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>310000</p>
         */
        public Builder receiverZip(String receiverZip) {
            this.putQueryParameter("ReceiverZip", receiverZip);
            this.receiverZip = receiverZip;
            return this;
        }

        /**
         * <p>The ID of the region where you want to deploy the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
        public CreateSmartAccessGatewayRequest build() {
            return new CreateSmartAccessGatewayRequest(this);
        } 

    } 

}
