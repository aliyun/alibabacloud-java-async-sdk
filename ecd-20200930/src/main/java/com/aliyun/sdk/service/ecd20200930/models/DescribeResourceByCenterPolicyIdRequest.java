// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeResourceByCenterPolicyIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceByCenterPolicyIdRequest</p>
 */
public class DescribeResourceByCenterPolicyIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private DescribeResourceByCenterPolicyIdRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyGroupId = builder.policyGroupId;
        this.productType = builder.productType;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceByCenterPolicyIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<DescribeResourceByCenterPolicyIdRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String policyGroupId; 
        private String productType; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceByCenterPolicyIdRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyGroupId = request.policyGroupId;
            this.productType = request.productType;
            this.resourceId = request.resourceId;
        } 

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Maximum value: 100.</li>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l69tQX7yFxx6/4dbooBAOc</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-53iyi2aar0nd6****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The service type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>app: cloud applications.</li>
         * <li>resourceGroup: resource groups.</li>
         * <li>desktop: cloud computers.</li>
         * <li>desktopGroup: cloud computer shares.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-ia2zw38bi6cm7****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public DescribeResourceByCenterPolicyIdRequest build() {
            return new DescribeResourceByCenterPolicyIdRequest(this);
        } 

    } 

}
