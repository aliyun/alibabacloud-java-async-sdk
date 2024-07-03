// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPredictDocRequest} extends {@link RequestModel}
 *
 * <p>GetPredictDocRequest</p>
 */
public class GetPredictDocRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long docId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    private GetPredictDocRequest(Builder builder) {
        super(builder);
        this.docId = builder.docId;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPredictDocRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docId
     */
    public Long getDocId() {
        return this.docId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<GetPredictDocRequest, Builder> {
        private Long docId; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(GetPredictDocRequest request) {
            super(request);
            this.docId = request.docId;
            this.product = request.product;
        } 

        /**
         * DocId.
         */
        public Builder docId(Long docId) {
            this.putQueryParameter("DocId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        @Override
        public GetPredictDocRequest build() {
            return new GetPredictDocRequest(this);
        } 

    } 

}
