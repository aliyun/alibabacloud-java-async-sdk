// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressConnectRouterAssociationRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressConnectRouterAssociationRequest</p>
 */
public class CreateExpressConnectRouterAssociationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedPrefixes")
    private java.util.List < String > allowedPrefixes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociationRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String associationRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateAttachment")
    private Boolean createAttachment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransitRouterOwnerId")
    private Long transitRouterOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
    private Long vpcOwnerId;

    private CreateExpressConnectRouterAssociationRequest(Builder builder) {
        super(builder);
        this.allowedPrefixes = builder.allowedPrefixes;
        this.associationRegionId = builder.associationRegionId;
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.createAttachment = builder.createAttachment;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterOwnerId = builder.transitRouterOwnerId;
        this.vpcId = builder.vpcId;
        this.vpcOwnerId = builder.vpcOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectRouterAssociationRequest create() {
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
     * @return associationRegionId
     */
    public String getAssociationRegionId() {
        return this.associationRegionId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createAttachment
     */
    public Boolean getCreateAttachment() {
        return this.createAttachment;
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
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return transitRouterOwnerId
     */
    public Long getTransitRouterOwnerId() {
        return this.transitRouterOwnerId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcOwnerId
     */
    public Long getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateExpressConnectRouterAssociationRequest, Builder> {
        private java.util.List < String > allowedPrefixes; 
        private String associationRegionId; 
        private String cenId; 
        private String clientToken; 
        private Boolean createAttachment; 
        private Boolean dryRun; 
        private String ecrId; 
        private String transitRouterId; 
        private Long transitRouterOwnerId; 
        private String vpcId; 
        private Long vpcOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressConnectRouterAssociationRequest request) {
            super(request);
            this.allowedPrefixes = request.allowedPrefixes;
            this.associationRegionId = request.associationRegionId;
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.createAttachment = request.createAttachment;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterOwnerId = request.transitRouterOwnerId;
            this.vpcId = request.vpcId;
            this.vpcOwnerId = request.vpcOwnerId;
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
         * AssociationRegionId.
         */
        public Builder associationRegionId(String associationRegionId) {
            this.putBodyParameter("AssociationRegionId", associationRegionId);
            this.associationRegionId = associationRegionId;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putBodyParameter("CenId", cenId);
            this.cenId = cenId;
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
         * CreateAttachment.
         */
        public Builder createAttachment(Boolean createAttachment) {
            this.putBodyParameter("CreateAttachment", createAttachment);
            this.createAttachment = createAttachment;
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
         * TransitRouterId.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putBodyParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * TransitRouterOwnerId.
         */
        public Builder transitRouterOwnerId(Long transitRouterOwnerId) {
            this.putBodyParameter("TransitRouterOwnerId", transitRouterOwnerId);
            this.transitRouterOwnerId = transitRouterOwnerId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcOwnerId.
         */
        public Builder vpcOwnerId(Long vpcOwnerId) {
            this.putBodyParameter("VpcOwnerId", vpcOwnerId);
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }

        @Override
        public CreateExpressConnectRouterAssociationRequest build() {
            return new CreateExpressConnectRouterAssociationRequest(this);
        } 

    } 

}
