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
 * {@link CreateGateVerifyExportLogRequest} extends {@link RequestModel}
 *
 * <p>CreateGateVerifyExportLogRequest</p>
 */
public class CreateGateVerifyExportLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer authenticationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryMonth")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    private CreateGateVerifyExportLogRequest(Builder builder) {
        super(builder);
        this.authenticationType = builder.authenticationType;
        this.osType = builder.osType;
        this.ownerId = builder.ownerId;
        this.queryMonth = builder.queryMonth;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGateVerifyExportLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queryMonth
     */
    public String getQueryMonth() {
        return this.queryMonth;
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

    public static final class Builder extends Request.Builder<CreateGateVerifyExportLogRequest, Builder> {
        private Integer authenticationType; 
        private String osType; 
        private Long ownerId; 
        private String queryMonth; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateGateVerifyExportLogRequest request) {
            super(request);
            this.authenticationType = request.authenticationType;
            this.osType = request.osType;
            this.ownerId = request.ownerId;
            this.queryMonth = request.queryMonth;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authenticationType(Integer authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
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
         * <p>202211</p>
         */
        public Builder queryMonth(String queryMonth) {
            this.putQueryParameter("QueryMonth", queryMonth);
            this.queryMonth = queryMonth;
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
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public CreateGateVerifyExportLogRequest build() {
            return new CreateGateVerifyExportLogRequest(this);
        } 

    } 

}
