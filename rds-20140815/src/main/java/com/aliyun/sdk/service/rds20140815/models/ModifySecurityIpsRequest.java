// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIpsRequest</p>
 */
public class ModifySecurityIpsRequest extends Request {
    @Query
    @NameInMap("DBInstanceIPArrayAttribute")
    private String DBInstanceIPArrayAttribute;

    @Query
    @NameInMap("DBInstanceIPArrayName")
    private String DBInstanceIPArrayName;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("FreshWhiteListReadins")
    private String freshWhiteListReadins;

    @Query
    @NameInMap("ModifyMode")
    private String modifyMode;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityIPType")
    private String securityIPType;

    @Query
    @NameInMap("SecurityIps")
    @Validation(required = true)
    private String securityIps;

    @Query
    @NameInMap("WhitelistNetworkType")
    private String whitelistNetworkType;

    private ModifySecurityIpsRequest(Builder builder) {
        super(builder);
        this.DBInstanceIPArrayAttribute = builder.DBInstanceIPArrayAttribute;
        this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
        this.DBInstanceId = builder.DBInstanceId;
        this.freshWhiteListReadins = builder.freshWhiteListReadins;
        this.modifyMode = builder.modifyMode;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityIPType = builder.securityIPType;
        this.securityIps = builder.securityIps;
        this.whitelistNetworkType = builder.whitelistNetworkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceIPArrayAttribute
     */
    public String getDBInstanceIPArrayAttribute() {
        return this.DBInstanceIPArrayAttribute;
    }

    /**
     * @return DBInstanceIPArrayName
     */
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return freshWhiteListReadins
     */
    public String getFreshWhiteListReadins() {
        return this.freshWhiteListReadins;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityIPType
     */
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    /**
     * @return whitelistNetworkType
     */
    public String getWhitelistNetworkType() {
        return this.whitelistNetworkType;
    }

    public static final class Builder extends Request.Builder<ModifySecurityIpsRequest, Builder> {
        private String DBInstanceIPArrayAttribute; 
        private String DBInstanceIPArrayName; 
        private String DBInstanceId; 
        private String freshWhiteListReadins; 
        private String modifyMode; 
        private Long resourceOwnerId; 
        private String securityIPType; 
        private String securityIps; 
        private String whitelistNetworkType; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityIpsRequest response) {
            super(response);
            this.DBInstanceIPArrayAttribute = response.DBInstanceIPArrayAttribute;
            this.DBInstanceIPArrayName = response.DBInstanceIPArrayName;
            this.DBInstanceId = response.DBInstanceId;
            this.freshWhiteListReadins = response.freshWhiteListReadins;
            this.modifyMode = response.modifyMode;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityIPType = response.securityIPType;
            this.securityIps = response.securityIps;
            this.whitelistNetworkType = response.whitelistNetworkType;
        } 

        /**
         * DBInstanceIPArrayAttribute.
         */
        public Builder DBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.putQueryParameter("DBInstanceIPArrayAttribute", DBInstanceIPArrayAttribute);
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }

        /**
         * DBInstanceIPArrayName.
         */
        public Builder DBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.putQueryParameter("DBInstanceIPArrayName", DBInstanceIPArrayName);
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * FreshWhiteListReadins.
         */
        public Builder freshWhiteListReadins(String freshWhiteListReadins) {
            this.putQueryParameter("FreshWhiteListReadins", freshWhiteListReadins);
            this.freshWhiteListReadins = freshWhiteListReadins;
            return this;
        }

        /**
         * ModifyMode.
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
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
         * SecurityIPType.
         */
        public Builder securityIPType(String securityIPType) {
            this.putQueryParameter("SecurityIPType", securityIPType);
            this.securityIPType = securityIPType;
            return this;
        }

        /**
         * SecurityIps.
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        /**
         * WhitelistNetworkType.
         */
        public Builder whitelistNetworkType(String whitelistNetworkType) {
            this.putQueryParameter("WhitelistNetworkType", whitelistNetworkType);
            this.whitelistNetworkType = whitelistNetworkType;
            return this;
        }

        @Override
        public ModifySecurityIpsRequest build() {
            return new ModifySecurityIpsRequest(this);
        } 

    } 

}
