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
 * {@link ModifySagRouteProtocolOspfRequest} extends {@link RequestModel}
 *
 * <p>ModifySagRouteProtocolOspfRequest</p>
 */
public class ModifySagRouteProtocolOspfRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer areaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authenticationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeadTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer deadTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HelloTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer helloTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5Key")
    private String md5Key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5KeyId")
    private Integer md5KeyId;

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
    @com.aliyun.core.annotation.NameInMap("RouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGSn;

    private ModifySagRouteProtocolOspfRequest(Builder builder) {
        super(builder);
        this.areaId = builder.areaId;
        this.authenticationType = builder.authenticationType;
        this.deadTime = builder.deadTime;
        this.helloTime = builder.helloTime;
        this.md5Key = builder.md5Key;
        this.md5KeyId = builder.md5KeyId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routerId = builder.routerId;
        this.smartAGId = builder.smartAGId;
        this.smartAGSn = builder.smartAGSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySagRouteProtocolOspfRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areaId
     */
    public Integer getAreaId() {
        return this.areaId;
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return deadTime
     */
    public Integer getDeadTime() {
        return this.deadTime;
    }

    /**
     * @return helloTime
     */
    public Integer getHelloTime() {
        return this.helloTime;
    }

    /**
     * @return md5Key
     */
    public String getMd5Key() {
        return this.md5Key;
    }

    /**
     * @return md5KeyId
     */
    public Integer getMd5KeyId() {
        return this.md5KeyId;
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
     * @return routerId
     */
    public String getRouterId() {
        return this.routerId;
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

    public static final class Builder extends Request.Builder<ModifySagRouteProtocolOspfRequest, Builder> {
        private Integer areaId; 
        private String authenticationType; 
        private Integer deadTime; 
        private Integer helloTime; 
        private String md5Key; 
        private Integer md5KeyId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routerId; 
        private String smartAGId; 
        private String smartAGSn; 

        private Builder() {
            super();
        } 

        private Builder(ModifySagRouteProtocolOspfRequest request) {
            super(request);
            this.areaId = request.areaId;
            this.authenticationType = request.authenticationType;
            this.deadTime = request.deadTime;
            this.helloTime = request.helloTime;
            this.md5Key = request.md5Key;
            this.md5KeyId = request.md5KeyId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routerId = request.routerId;
            this.smartAGId = request.smartAGId;
            this.smartAGSn = request.smartAGSn;
        } 

        /**
         * <p>The ID of the OSPF area.</p>
         * <p>Valid values: <strong>1 to 2147483647</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder areaId(Integer areaId) {
            this.putQueryParameter("AreaId", areaId);
            this.areaId = areaId;
            return this;
        }

        /**
         * <p>The authentication method. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: does not enable authentication.</li>
         * <li><strong>CLEARTEXT</strong>: uses plaintext authentication. You must enter the plaintext password.</li>
         * <li><strong>MD5</strong>: uses MD5 authentication. You must enter the MD5 key ID and the MD5 key.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder authenticationType(String authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>The timeout period of OSPF. Unit: seconds.</p>
         * <p>Valid values: <strong>1 to 65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder deadTime(Integer deadTime) {
            this.putQueryParameter("DeadTime", deadTime);
            this.deadTime = deadTime;
            return this;
        }

        /**
         * <p>The time interval at which Hello packets are sent. Unit: seconds.</p>
         * <p>Valid values: <strong>1 to 65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder helloTime(Integer helloTime) {
            this.putQueryParameter("HelloTime", helloTime);
            this.helloTime = helloTime;
            return this;
        }

        /**
         * <p>The MD5 key value.</p>
         * <p>Valid values: <strong>1 to 47</strong>.</p>
         * <blockquote>
         * <p> This parameter is required only if <strong>AuthenticationType</strong> is set to <strong>MD5</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder md5Key(String md5Key) {
            this.putQueryParameter("Md5Key", md5Key);
            this.md5Key = md5Key;
            return this;
        }

        /**
         * <p>The ID of the MD5 key.</p>
         * <p>Valid values: <strong>1 to 2147483647</strong>.</p>
         * <blockquote>
         * <p> This parameter is required only if <strong>AuthenticationType</strong> is set to <strong>MD5</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder md5KeyId(Integer md5KeyId) {
            this.putQueryParameter("Md5KeyId", md5KeyId);
            this.md5KeyId = md5KeyId;
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
         * <p>The plaintext password.</p>
         * <p>The password must be 1 to 8 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <blockquote>
         * <p> This parameter is required only if <strong>AuthenticationType</strong> is set to <strong>CLEARTEXT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1212****</p>
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
         * <p>The ID of the router that has OSPF enabled.</p>
         * <p>Set the value to an IPv4 address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
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
         * <p>The serial number of the SAG device associated with the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag32a30***</p>
         */
        public Builder smartAGSn(String smartAGSn) {
            this.putQueryParameter("SmartAGSn", smartAGSn);
            this.smartAGSn = smartAGSn;
            return this;
        }

        @Override
        public ModifySagRouteProtocolOspfRequest build() {
            return new ModifySagRouteProtocolOspfRequest(this);
        } 

    } 

}
