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
 * {@link DeleteExpressConnectRouterAssociationRequest} extends {@link RequestModel}
 *
 * <p>DeleteExpressConnectRouterAssociationRequest</p>
 */
public class DeleteExpressConnectRouterAssociationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String associationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteAttachment")
    private Boolean deleteAttachment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    private DeleteExpressConnectRouterAssociationRequest(Builder builder) {
        super(builder);
        this.associationId = builder.associationId;
        this.clientToken = builder.clientToken;
        this.deleteAttachment = builder.deleteAttachment;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExpressConnectRouterAssociationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return deleteAttachment
     */
    public Boolean getDeleteAttachment() {
        return this.deleteAttachment;
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

    public static final class Builder extends Request.Builder<DeleteExpressConnectRouterAssociationRequest, Builder> {
        private String associationId; 
        private String clientToken; 
        private Boolean deleteAttachment; 
        private Boolean dryRun; 
        private String ecrId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExpressConnectRouterAssociationRequest request) {
            super(request);
            this.associationId = request.associationId;
            this.clientToken = request.clientToken;
            this.deleteAttachment = request.deleteAttachment;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
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
         * <p>Specifies whether to delete the association between the ECR and the VPC or TR. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteAttachment(Boolean deleteAttachment) {
            this.putBodyParameter("DeleteAttachment", deleteAttachment);
            this.deleteAttachment = deleteAttachment;
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

        @Override
        public DeleteExpressConnectRouterAssociationRequest build() {
            return new DeleteExpressConnectRouterAssociationRequest(this);
        } 

    } 

}
