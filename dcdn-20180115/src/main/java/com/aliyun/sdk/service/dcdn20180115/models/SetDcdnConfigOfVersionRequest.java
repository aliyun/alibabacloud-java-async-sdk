// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnConfigOfVersionRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnConfigOfVersionRequest</p>
 */
public class SetDcdnConfigOfVersionRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private String configId;

    @Query
    @NameInMap("FunctionArgs")
    @Validation(required = true)
    private String functionArgs;

    @Query
    @NameInMap("FunctionId")
    private Long functionId;

    @Query
    @NameInMap("FunctionName")
    private String functionName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private SetDcdnConfigOfVersionRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.functionArgs = builder.functionArgs;
        this.functionId = builder.functionId;
        this.functionName = builder.functionName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnConfigOfVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return functionArgs
     */
    public String getFunctionArgs() {
        return this.functionArgs;
    }

    /**
     * @return functionId
     */
    public Long getFunctionId() {
        return this.functionId;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<SetDcdnConfigOfVersionRequest, Builder> {
        private String configId; 
        private String functionArgs; 
        private Long functionId; 
        private String functionName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String securityToken; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnConfigOfVersionRequest request) {
            super(request);
            this.configId = request.configId;
            this.functionArgs = request.functionArgs;
            this.functionId = request.functionId;
            this.functionName = request.functionName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.versionId = request.versionId;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * FunctionArgs.
         */
        public Builder functionArgs(String functionArgs) {
            this.putQueryParameter("FunctionArgs", functionArgs);
            this.functionArgs = functionArgs;
            return this;
        }

        /**
         * FunctionId.
         */
        public Builder functionId(Long functionId) {
            this.putQueryParameter("FunctionId", functionId);
            this.functionId = functionId;
            return this;
        }

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public SetDcdnConfigOfVersionRequest build() {
            return new SetDcdnConfigOfVersionRequest(this);
        } 

    } 

}
