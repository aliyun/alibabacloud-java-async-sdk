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
 * {@link ModifySagWifiRequest} extends {@link RequestModel}
 *
 * <p>ModifySagWifiRequest</p>
 */
public class ModifySagWifiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    private String authenticationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private String bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
    private String encryptAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuth")
    private String isAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsBroadcast")
    private String isBroadcast;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEnable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSID")
    private String SSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGSn;

    private ModifySagWifiRequest(Builder builder) {
        super(builder);
        this.authenticationType = builder.authenticationType;
        this.bandwidth = builder.bandwidth;
        this.channel = builder.channel;
        this.encryptAlgorithm = builder.encryptAlgorithm;
        this.isAuth = builder.isAuth;
        this.isBroadcast = builder.isBroadcast;
        this.isEnable = builder.isEnable;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.SSID = builder.SSID;
        this.smartAGId = builder.smartAGId;
        this.smartAGSn = builder.smartAGSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySagWifiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return encryptAlgorithm
     */
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    /**
     * @return isAuth
     */
    public String getIsAuth() {
        return this.isAuth;
    }

    /**
     * @return isBroadcast
     */
    public String getIsBroadcast() {
        return this.isBroadcast;
    }

    /**
     * @return isEnable
     */
    public String getIsEnable() {
        return this.isEnable;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
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

    /**
     * @return SSID
     */
    public String getSSID() {
        return this.SSID;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return smartAGSn
     */
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    public static final class Builder extends Request.Builder<ModifySagWifiRequest, Builder> {
        private String authenticationType; 
        private String bandwidth; 
        private String channel; 
        private String encryptAlgorithm; 
        private String isAuth; 
        private String isBroadcast; 
        private String isEnable; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String SSID; 
        private String smartAGId; 
        private String smartAGSn; 

        private Builder() {
            super();
        } 

        private Builder(ModifySagWifiRequest request) {
            super(request);
            this.authenticationType = request.authenticationType;
            this.bandwidth = request.bandwidth;
            this.channel = request.channel;
            this.encryptAlgorithm = request.encryptAlgorithm;
            this.isAuth = request.isAuth;
            this.isBroadcast = request.isBroadcast;
            this.isEnable = request.isEnable;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.SSID = request.SSID;
            this.smartAGId = request.smartAGId;
            this.smartAGSn = request.smartAGSn;
        } 

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong></li>
         * <li><strong>WPA-PSK</strong></li>
         * <li><strong>WPA2-PSK</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WPA2-PSK</p>
         */
        public Builder authenticationType(String authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>The bandwidth of the channel. Valid values:</p>
         * <ul>
         * <li><strong>Automatic</strong></li>
         * <li><strong>20 MHz</strong></li>
         * <li><strong>40 MHz</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20 MHz</p>
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The Wi-Fi channel.</p>
         * <p>Valid values: <strong>0 to 11</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li><strong>AUTO</strong>: automatically selects the encryption algorithm.</li>
         * <li><strong>TKIP</strong>: uses the Temporal Key Integrity Protocol (TKIP).</li>
         * <li><strong>AES</strong>: uses the Advanced Encryption Standard authorized by Wi-Fi®.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder encryptAlgorithm(String encryptAlgorithm) {
            this.putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }

        /**
         * <p>Specifies whether wireless security is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables wireless security.</li>
         * <li><strong>False</strong>: disables wireless security.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isAuth(String isAuth) {
            this.putQueryParameter("IsAuth", isAuth);
            this.isAuth = isAuth;
            return this;
        }

        /**
         * <p>Specifies whether broadcast over Wi-Fi is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables broadcast.</li>
         * <li><strong>False</strong>: disables broadcast.</li>
         * </ul>
         * <blockquote>
         * <p> Only after you enable broadcast, terminals that support wireless connections can search the Wi-Fi network by its SSID and receive Wi-Fi signals.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isBroadcast(String isBroadcast) {
            this.putQueryParameter("IsBroadcast", isBroadcast);
            this.isBroadcast = isBroadcast;
            return this;
        }

        /**
         * <p>Specifies whether Wi-Fi is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables Wi-Fi.</li>
         * <li><strong>False</strong>: disables Wi-Fi.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isEnable(String isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
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
         * <p>The password used to connect to the Wi-Fi network.</p>
         * <p>The password must be 8 to 32 characters in length, and can contain digits and letters.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The ID of the region where the SAG instance is deployed.</p>
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

        /**
         * <p>The service set identifier (SSID) of the Wi-Fi network.</p>
         * <p>The name must be 1 to 31 characters in length, and can contain digits and letters.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_sag_123456****</p>
         */
        public Builder SSID(String SSID) {
            this.putQueryParameter("SSID", SSID);
            this.SSID = SSID;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-whfn****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The serial number of the SAG device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag32a30****</p>
         */
        public Builder smartAGSn(String smartAGSn) {
            this.putQueryParameter("SmartAGSn", smartAGSn);
            this.smartAGSn = smartAGSn;
            return this;
        }

        @Override
        public ModifySagWifiRequest build() {
            return new ModifySagWifiRequest(this);
        } 

    } 

}
