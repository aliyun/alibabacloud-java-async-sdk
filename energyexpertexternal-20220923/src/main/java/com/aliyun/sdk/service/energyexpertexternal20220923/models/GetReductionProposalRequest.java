// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetReductionProposalRequest} extends {@link RequestModel}
 *
 * <p>GetReductionProposalRequest</p>
 */
public class GetReductionProposalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataQualityEvaluationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dataQualityEvaluationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productType;

    private GetReductionProposalRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.dataQualityEvaluationType = builder.dataQualityEvaluationType;
        this.productId = builder.productId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReductionProposalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataQualityEvaluationType
     */
    public Integer getDataQualityEvaluationType() {
        return this.dataQualityEvaluationType;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return productType
     */
    public Long getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<GetReductionProposalRequest, Builder> {
        private String code; 
        private Integer dataQualityEvaluationType; 
        private Long productId; 
        private Long productType; 

        private Builder() {
            super();
        } 

        private Builder(GetReductionProposalRequest request) {
            super(request);
            this.code = request.code;
            this.dataQualityEvaluationType = request.dataQualityEvaluationType;
            this.productId = request.productId;
            this.productType = request.productType;
        } 

        /**
         * <p>The enterprise code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C-20080808-1</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The type of the data quality evaluation. 1 is DQI and 2 is DQR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataQualityEvaluationType(Integer dataQualityEvaluationType) {
            this.putBodyParameter("dataQualityEvaluationType", dataQualityEvaluationType);
            this.dataQualityEvaluationType = dataQualityEvaluationType;
            return this;
        }

        /**
         * <p>The product id.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder productId(Long productId) {
            this.putBodyParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>Product type: 1 indicates that the carbon footprint of the product is requested, and 5 indicates that the carbon footprint of the supply chain is requested.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder productType(Long productType) {
            this.putBodyParameter("productType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public GetReductionProposalRequest build() {
            return new GetReductionProposalRequest(this);
        } 

    } 

}
