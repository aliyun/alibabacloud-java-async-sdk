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
 * {@link CreateExpressConnectRouterAssociationRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressConnectRouterAssociationRequest</p>
 */
public class CreateExpressConnectRouterAssociationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedPrefixes")
    private java.util.List<String> allowedPrefixes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedPrefixesMode")
    private String allowedPrefixesMode;

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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
        this.allowedPrefixesMode = builder.allowedPrefixesMode;
        this.associationRegionId = builder.associationRegionId;
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.createAttachment = builder.createAttachment;
        this.description = builder.description;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private java.util.List<String> allowedPrefixes; 
        private String allowedPrefixesMode; 
        private String associationRegionId; 
        private String cenId; 
        private String clientToken; 
        private Boolean createAttachment; 
        private String description; 
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
            this.allowedPrefixesMode = request.allowedPrefixesMode;
            this.associationRegionId = request.associationRegionId;
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.createAttachment = request.createAttachment;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterOwnerId = request.transitRouterOwnerId;
            this.vpcId = request.vpcId;
            this.vpcOwnerId = request.vpcOwnerId;
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
         * <p>The region ID of the resource to be associated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder associationRegionId(String associationRegionId) {
            this.putBodyParameter("AssociationRegionId", associationRegionId);
            this.associationRegionId = associationRegionId;
            return this;
        }

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-of3o1the3i4gwb****</p>
         */
        public Builder cenId(String cenId) {
            this.putBodyParameter("CenId", cenId);
            this.cenId = cenId;
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
         * <p>Specifies whether to initiate an association on the TR when the ECR is associated with the TR. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: You do not need to initiate an association on the TR.</li>
         * <li><strong>false</strong>: You need to initiate an association on the TR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createAttachment(Boolean createAttachment) {
            this.putBodyParameter("CreateAttachment", createAttachment);
            this.createAttachment = createAttachment;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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
         * <p>The TR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-2ze4i71c6be454e2l****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putBodyParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that owns the TR. Default value: ID of the Alibaba Cloud account that logs in.</p>
         * <blockquote>
         * <p> If you want to connect to a network instance that belongs to a different account, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>189159362009****</p>
         */
        public Builder transitRouterOwnerId(Long transitRouterOwnerId) {
            this.putBodyParameter("TransitRouterOwnerId", transitRouterOwnerId);
            this.transitRouterOwnerId = transitRouterOwnerId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1h37fchc6jmfyln****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that owns the VPC. Default value: ID of the Alibaba Cloud account that logs in.</p>
         * <blockquote>
         * <p> If you want to connect to a network instance that belongs to a different account, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>132193271328****</p>
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
