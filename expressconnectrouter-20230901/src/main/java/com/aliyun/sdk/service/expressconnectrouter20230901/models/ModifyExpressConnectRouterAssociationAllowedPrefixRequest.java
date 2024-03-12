// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyExpressConnectRouterAssociationAllowedPrefixRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectRouterAssociationAllowedPrefixRequest</p>
 */
public class ModifyExpressConnectRouterAssociationAllowedPrefixRequest extends Request {
    @Body
    @NameInMap("AllowedPrefixes")
    private java.util.List < String > allowedPrefixes;

    @Body
    @NameInMap("AssociationId")
    @Validation(required = true)
    private String associationId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EcrId")
    @Validation(required = true)
    private String ecrId;

    @Body
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    private ModifyExpressConnectRouterAssociationAllowedPrefixRequest(Builder builder) {
        super(builder);
        this.allowedPrefixes = builder.allowedPrefixes;
        this.associationId = builder.associationId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.ownerAccount = builder.ownerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressConnectRouterAssociationAllowedPrefixRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedPrefixes
     */
    public java.util.List < String > getAllowedPrefixes() {
        return this.allowedPrefixes;
    }

    /**
     * @return associationId
     */
    public String getAssociationId() {
        return this.associationId;
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
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public static final class Builder extends Request.Builder<ModifyExpressConnectRouterAssociationAllowedPrefixRequest, Builder> {
        private java.util.List < String > allowedPrefixes; 
        private String associationId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private String ownerAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExpressConnectRouterAssociationAllowedPrefixRequest request) {
            super(request);
            this.allowedPrefixes = request.allowedPrefixes;
            this.associationId = request.associationId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.ownerAccount = request.ownerAccount;
        } 

        /**
         * AllowedPrefixes.
         */
        public Builder allowedPrefixes(java.util.List < String > allowedPrefixes) {
            this.putBodyParameter("AllowedPrefixes", allowedPrefixes);
            this.allowedPrefixes = allowedPrefixes;
            return this;
        }

        /**
         * AssociationId.
         */
        public Builder associationId(String associationId) {
            this.putBodyParameter("AssociationId", associationId);
            this.associationId = associationId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EcrId.
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putBodyParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        @Override
        public ModifyExpressConnectRouterAssociationAllowedPrefixRequest build() {
            return new ModifyExpressConnectRouterAssociationAllowedPrefixRequest(this);
        } 

    } 

}
