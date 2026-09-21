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
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

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
        this.chargeType = builder.chargeType;
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
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
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
        private String chargeType; 
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
            this.chargeType = request.chargeType;
            this.matrixSpec = request.matrixSpec;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.saleMode = request.saleMode;
            this.specIds = request.specIds;
            this.specStatus = request.specStatus;
            this.specType = request.specType;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The cloud phone matrix specification.</p>
         * 
         * <strong>example:</strong>
         * <p>cpm.gx7.10xlarge</p>
         */
        public Builder matrixSpec(String matrixSpec) {
            this.putQueryParameter("MatrixSpec", matrixSpec);
            this.matrixSpec = matrixSpec;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position from which to start the query. Leave this parameter empty to query from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The purchase mode of the cloud phone.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * <p>A list of specification IDs.</p>
         */
        public Builder specIds(java.util.List<String> specIds) {
            this.putQueryParameter("SpecIds", specIds);
            this.specIds = specIds;
            return this;
        }

        /**
         * <p>The specification status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder specStatus(String specStatus) {
            this.putQueryParameter("SpecStatus", specStatus);
            this.specStatus = specStatus;
            return this;
        }

        /**
         * <p>The specification type.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
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
