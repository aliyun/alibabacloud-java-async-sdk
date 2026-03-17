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
 * {@link ModifySagWanRequest} extends {@link RequestModel}
 *
 * <p>ModifySagWanRequest</p>
 */
public class ModifySagWanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 1000000)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gateway")
    private String gateway;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IP")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String IPType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    private String mask;

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
    @com.aliyun.core.annotation.NameInMap("PortName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

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
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer weight;

    private ModifySagWanRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.gateway = builder.gateway;
        this.ip = builder.ip;
        this.IPType = builder.IPType;
        this.ISP = builder.ISP;
        this.mask = builder.mask;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.portName = builder.portName;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smartAGId = builder.smartAGId;
        this.smartAGSn = builder.smartAGSn;
        this.username = builder.username;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySagWanRequest create() {
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
     * @return gateway
     */
    public String getGateway() {
        return this.gateway;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return IPType
     */
    public String getIPType() {
        return this.IPType;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
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
     * @return portName
     */
    public String getPortName() {
        return this.portName;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<ModifySagWanRequest, Builder> {
        private Integer bandwidth; 
        private String gateway; 
        private String ip; 
        private String IPType; 
        private String ISP; 
        private String mask; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String portName; 
        private Integer priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smartAGId; 
        private String smartAGSn; 
        private String username; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(ModifySagWanRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.gateway = request.gateway;
            this.ip = request.ip;
            this.IPType = request.IPType;
            this.ISP = request.ISP;
            this.mask = request.mask;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.portName = request.portName;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smartAGId = request.smartAGId;
            this.smartAGSn = request.smartAGSn;
            this.username = request.username;
            this.weight = request.weight;
        } 

        /**
         * <p>The maximum bandwidth of the WAN port. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The IP address of the gateway.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If the WAN port uses a static IP address, you must set this parameter.</li>
         * <li>After this parameter is set, the SAG device generates a default route.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.254</p>
         */
        public Builder gateway(String gateway) {
            this.putQueryParameter("Gateway", gateway);
            this.gateway = gateway;
            return this;
        }

        /**
         * <p>The IP address of the WAN port.</p>
         * <blockquote>
         * <p> If the WAN port uses a static IP address, you must set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("IP", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The connection type of the WAN port: Valid values:</p>
         * <ul>
         * <li><strong>DHCP</strong>: The WAN port connects to the Internet through an IP address that is dynamically assigned by the Dynamic Host Configuration Protocol (DHCP) server.</li>
         * <li><strong>STATIC</strong>: The WAN port connects to the Internet through a static IP address. If you set this value, you must configure a static IP address, a subnet mask, and a gateway IP address for the WAN port.</li>
         * <li><strong>PPPOE</strong>: The WAN port connects to the Internet through dial-up connections. If you set this value, you must enter the username and password of the PPPoE account provided by the Internet service provider (ISP).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DHCP</p>
         */
        public Builder IPType(String IPType) {
            this.putQueryParameter("IPType", IPType);
            this.IPType = IPType;
            return this;
        }

        /**
         * <p>The ISP used by the WAN port. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom</li>
         * <li><strong>CM</strong>: China Mobile</li>
         * <li><strong>CU</strong>: China Unicom</li>
         * <li><strong>Other</strong>: Other ISPs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The subnet mask of the WAN port IP address.</p>
         * <blockquote>
         * <p> If the WAN port uses a static IP address, you must set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.0</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
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
         * <p>The password of the PPPoE account.</p>
         * <p>The username must be 6 to 30 characters in length, and can contain digits and letters.</p>
         * <blockquote>
         * <p> If the connection type of the WAN port is PPPoE, you must set this parameter. If you do not need to modify the password, you can ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>P12ppq***</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The number of the WAN port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder portName(String portName) {
            this.putQueryParameter("PortName", portName);
            this.portName = portName;
            return this;
        }

        /**
         * <p>The priority of the WAN port.</p>
         * <p>Valid values: <strong>-1</strong> and <strong>1 to 50</strong>.</p>
         * <p>A smaller value indicates a higher priority. A value of <strong>-1</strong> indicates that traffic forwarding is disabled on the WAN port.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the region where the SAG instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The username of the PPPoE account.</p>
         * <p>The username must be 6 to 30 characters in length, and can contain digits and letters.</p>
         * <blockquote>
         * <p> If the connection type of the WAN port is PPPoE, you must set this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>P12ppp***</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The weight of the WAN port.</p>
         * <p>Valid values: <strong>1 to 100</strong>. Default value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder weight(Integer weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public ModifySagWanRequest build() {
            return new ModifySagWanRequest(this);
        } 

    } 

}
