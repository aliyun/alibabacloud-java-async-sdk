// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link ConfigVerifySceneAppInfoRequest} extends {@link RequestModel}
 *
 * <p>ConfigVerifySceneAppInfoRequest</p>
 */
public class ConfigVerifySceneAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CM")
    private Boolean cm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CT")
    private Boolean ct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CU")
    private Boolean cu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpWhitelist")
    private String ipWhitelist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    private ConfigVerifySceneAppInfoRequest(Builder builder) {
        super(builder);
        this.cm = builder.cm;
        this.ct = builder.ct;
        this.cu = builder.cu;
        this.email = builder.email;
        this.ipWhitelist = builder.ipWhitelist;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigVerifySceneAppInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cm
     */
    public Boolean getCm() {
        return this.cm;
    }

    /**
     * @return ct
     */
    public Boolean getCt() {
        return this.ct;
    }

    /**
     * @return cu
     */
    public Boolean getCu() {
        return this.cu;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<ConfigVerifySceneAppInfoRequest, Builder> {
        private Boolean cm; 
        private Boolean ct; 
        private Boolean cu; 
        private String email; 
        private String ipWhitelist; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(ConfigVerifySceneAppInfoRequest request) {
            super(request);
            this.cm = request.cm;
            this.ct = request.ct;
            this.cu = request.cu;
            this.email = request.email;
            this.ipWhitelist = request.ipWhitelist;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * CM.
         */
        public Builder cm(Boolean cm) {
            this.putQueryParameter("CM", cm);
            this.cm = cm;
            return this;
        }

        /**
         * CT.
         */
        public Builder ct(Boolean ct) {
            this.putQueryParameter("CT", ct);
            this.ct = ct;
            return this;
        }

        /**
         * CU.
         */
        public Builder cu(Boolean cu) {
            this.putQueryParameter("CU", cu);
            this.cu = cu;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@xxx.com">xxx@xxx.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * IpWhitelist.
         */
        public Builder ipWhitelist(String ipWhitelist) {
            this.putQueryParameter("IpWhitelist", ipWhitelist);
            this.ipWhitelist = ipWhitelist;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC220000011285006</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public ConfigVerifySceneAppInfoRequest build() {
            return new ConfigVerifySceneAppInfoRequest(this);
        } 

    } 

}
