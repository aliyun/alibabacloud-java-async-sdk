// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExpressConnectRouterAssociationRequest} extends {@link RequestModel}
 *
 * <p>DeleteExpressConnectRouterAssociationRequest</p>
 */
public class DeleteExpressConnectRouterAssociationRequest extends Request {
    @Body
    @NameInMap("AssociationId")
    @Validation(required = true)
    private String associationId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DeleteAttachment")
    private Boolean deleteAttachment;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EcrId")
    @Validation(required = true)
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
         * DeleteAttachment.
         */
        public Builder deleteAttachment(Boolean deleteAttachment) {
            this.putBodyParameter("DeleteAttachment", deleteAttachment);
            this.deleteAttachment = deleteAttachment;
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

        @Override
        public DeleteExpressConnectRouterAssociationRequest build() {
            return new DeleteExpressConnectRouterAssociationRequest(this);
        } 

    } 

}
