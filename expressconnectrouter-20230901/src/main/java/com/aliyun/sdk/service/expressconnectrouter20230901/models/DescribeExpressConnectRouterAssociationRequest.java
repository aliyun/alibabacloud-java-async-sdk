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
 * {@link DescribeExpressConnectRouterAssociationRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressConnectRouterAssociationRequest</p>
 */
public class DescribeExpressConnectRouterAssociationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociationId")
    private String associationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociationNodeType")
    private String associationNodeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociationRegionId")
    private String associationRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
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
         * <p>The ID of the association between the ECR and the VPC or TR.</p>
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
         * <p>The type of the associated resource. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>TR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder associationNodeType(String associationNodeType) {
            this.putBodyParameter("AssociationNodeType", associationNodeType);
            this.associationNodeType = associationNodeType;
            return this;
        }

        /**
         * <p>The region ID of the VPC or TR.</p>
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
         * <p>The maximum number of entries to read. Valid values: 1 to 2147483647. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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

        @Override
        public DescribeExpressConnectRouterAssociationRequest build() {
            return new DescribeExpressConnectRouterAssociationRequest(this);
        } 

    } 

}
