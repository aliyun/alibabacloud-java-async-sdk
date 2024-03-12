// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectRouterAssociationRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressConnectRouterAssociationRequest</p>
 */
public class DescribeExpressConnectRouterAssociationRequest extends Request {
    @Body
    @NameInMap("AssociationId")
    private String associationId;

    @Body
    @NameInMap("AssociationNodeType")
    private String associationNodeType;

    @Body
    @NameInMap("AssociationRegionId")
    private String associationRegionId;

    @Body
    @NameInMap("CenId")
    private String cenId;

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
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("TransitRouterId")
    private String transitRouterId;

    @Body
    @NameInMap("VpcId")
    private String vpcId;

    private DescribeExpressConnectRouterAssociationRequest(Builder builder) {
        super(builder);
        this.associationId = builder.associationId;
        this.associationNodeType = builder.associationNodeType;
        this.associationRegionId = builder.associationRegionId;
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.transitRouterId = builder.transitRouterId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectRouterAssociationRequest create() {
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
     * @return associationNodeType
     */
    public String getAssociationNodeType() {
        return this.associationNodeType;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeExpressConnectRouterAssociationRequest, Builder> {
        private String associationId; 
        private String associationNodeType; 
        private String associationRegionId; 
        private String cenId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private Integer maxResults; 
        private String nextToken; 
        private String transitRouterId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressConnectRouterAssociationRequest request) {
            super(request);
            this.associationId = request.associationId;
            this.associationNodeType = request.associationNodeType;
            this.associationRegionId = request.associationRegionId;
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.transitRouterId = request.transitRouterId;
            this.vpcId = request.vpcId;
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
         * AssociationNodeType.
         */
        public Builder associationNodeType(String associationNodeType) {
            this.putBodyParameter("AssociationNodeType", associationNodeType);
            this.associationNodeType = associationNodeType;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeExpressConnectRouterAssociationRequest build() {
            return new DescribeExpressConnectRouterAssociationRequest(this);
        } 

    } 

}
