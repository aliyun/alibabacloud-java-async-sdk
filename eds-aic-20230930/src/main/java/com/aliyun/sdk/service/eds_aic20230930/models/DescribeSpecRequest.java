// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpecRequest</p>
 */
public class DescribeSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatrixSpec")
    private String matrixSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecIds")
    private java.util.List<String> specIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecStatus")
    private String specStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    private DescribeSpecRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.matrixSpec = builder.matrixSpec;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.saleMode = builder.saleMode;
        this.specIds = builder.specIds;
        this.specStatus = builder.specStatus;
        this.specType = builder.specType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return matrixSpec
     */
    public String getMatrixSpec() {
        return this.matrixSpec;
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
     * @return saleMode
     */
    public String getSaleMode() {
        return this.saleMode;
    }

    /**
     * @return specIds
     */
    public java.util.List<String> getSpecIds() {
        return this.specIds;
    }

    /**
     * @return specStatus
     */
    public String getSpecStatus() {
        return this.specStatus;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    public static final class Builder extends Request.Builder<DescribeSpecRequest, Builder> {
        private String bizRegionId; 
        private String matrixSpec; 
        private Integer maxResults; 
        private String nextToken; 
        private String saleMode; 
        private java.util.List<String> specIds; 
        private String specStatus; 
        private String specType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpecRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.matrixSpec = request.matrixSpec;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.saleMode = request.saleMode;
            this.specIds = request.specIds;
            this.specStatus = request.specStatus;
            this.specType = request.specType;
        } 

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * MatrixSpec.
         */
        public Builder matrixSpec(String matrixSpec) {
            this.putQueryParameter("MatrixSpec", matrixSpec);
            this.matrixSpec = matrixSpec;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SaleMode.
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * SpecIds.
         */
        public Builder specIds(java.util.List<String> specIds) {
            this.putQueryParameter("SpecIds", specIds);
            this.specIds = specIds;
            return this;
        }

        /**
         * SpecStatus.
         */
        public Builder specStatus(String specStatus) {
            this.putQueryParameter("SpecStatus", specStatus);
            this.specStatus = specStatus;
            return this;
        }

        /**
         * SpecType.
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        @Override
        public DescribeSpecRequest build() {
            return new DescribeSpecRequest(this);
        } 

    } 

}
