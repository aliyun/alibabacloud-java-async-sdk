// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link ModifyExpressConnectRouterAssociationAllowedPrefixRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectRouterAssociationAllowedPrefixRequest</p>
 */
public class ModifyExpressConnectRouterAssociationAllowedPrefixRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedPrefixes")
    private java.util.List<String> allowedPrefixes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedPrefixesMode")
    private String allowedPrefixesMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String associationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    private ModifyExpressConnectRouterAssociationAllowedPrefixRequest(Builder builder) {
        super(builder);
        this.allowedPrefixes = builder.allowedPrefixes;
        this.allowedPrefixesMode = builder.allowedPrefixesMode;
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
    public java.util.List<String> getAllowedPrefixes() {
        return this.allowedPrefixes;
    }

    /**
     * @return allowedPrefixesMode
     */
    public String getAllowedPrefixesMode() {
        return this.allowedPrefixesMode;
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
        private java.util.List<String> allowedPrefixes; 
        private String allowedPrefixesMode; 
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
            this.allowedPrefixesMode = request.allowedPrefixesMode;
            this.associationId = request.associationId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.ownerAccount = request.ownerAccount;
        } 

        /**
         * <p>The allowed route prefixes.</p>
         */
        public Builder allowedPrefixes(java.util.List<String> allowedPrefixes) {
            this.putBodyParameter("AllowedPrefixes", allowedPrefixes);
            this.allowedPrefixes = allowedPrefixes;
            return this;
        }

        /**
         * AllowedPrefixesMode.
         */
        public Builder allowedPrefixesMode(String allowedPrefixesMode) {
            this.putBodyParameter("AllowedPrefixesMode", allowedPrefixesMode);
            this.allowedPrefixesMode = allowedPrefixesMode;
            return this;
        }

        /**
         * <p>The ID of the association between the ECR and the VPC or TR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-assoc-9p2qxx5phpca2m****</p>
         */
        public Builder associationId(String associationId) {
            this.putBodyParameter("AssociationId", associationId);
            this.associationId = associationId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ECR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
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
