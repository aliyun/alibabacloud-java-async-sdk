// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataQualityAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GetDataQualityAnalysisRequest</p>
 */
public class GetDataQualityAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataQualityEvaluationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataQualityEvaluationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productType;

    private GetDataQualityAnalysisRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.dataQualityEvaluationType = builder.dataQualityEvaluationType;
        this.productId = builder.productId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityAnalysisRequest create() {
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
    public Long getDataQualityEvaluationType() {
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

    public static final class Builder extends Request.Builder<GetDataQualityAnalysisRequest, Builder> {
        private String code; 
        private Long dataQualityEvaluationType; 
        private Long productId; 
        private Long productType; 

        private Builder() {
            super();
        } 

        private Builder(GetDataQualityAnalysisRequest request) {
            super(request);
            this.code = request.code;
            this.dataQualityEvaluationType = request.dataQualityEvaluationType;
            this.productId = request.productId;
            this.productType = request.productType;
        } 

        /**
         * The enterprise code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * Data quality assessment type: 1 is DQI and 2 is DQR.
         */
        public Builder dataQualityEvaluationType(Long dataQualityEvaluationType) {
            this.putBodyParameter("dataQualityEvaluationType", dataQualityEvaluationType);
            this.dataQualityEvaluationType = dataQualityEvaluationType;
            return this;
        }

        /**
         * The product id.
         */
        public Builder productId(Long productId) {
            this.putBodyParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * Product type: 1 indicates that the carbon footprint of the product is requested, and 5 indicates that the carbon footprint of the supply chain is requested.
         */
        public Builder productType(Long productType) {
            this.putBodyParameter("productType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public GetDataQualityAnalysisRequest build() {
            return new GetDataQualityAnalysisRequest(this);
        } 

    } 

}
