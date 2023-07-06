// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizePurchaseRecordRequest} extends {@link RequestModel}
 *
 * <p>RecognizePurchaseRecordRequest</p>
 */
public class RecognizePurchaseRecordRequest extends Request {
    @Query
    @NameInMap("OutputMultiOrders")
    private Boolean outputMultiOrders;

    @Query
    @NameInMap("Url")
    @Validation(maxLength = 2048)
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizePurchaseRecordRequest(Builder builder) {
        super(builder);
        this.outputMultiOrders = builder.outputMultiOrders;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizePurchaseRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputMultiOrders
     */
    public Boolean getOutputMultiOrders() {
        return this.outputMultiOrders;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RecognizePurchaseRecordRequest, Builder> {
        private Boolean outputMultiOrders; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizePurchaseRecordRequest request) {
            super(request);
            this.outputMultiOrders = request.outputMultiOrders;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * OutputMultiOrders.
         */
        public Builder outputMultiOrders(Boolean outputMultiOrders) {
            this.putQueryParameter("OutputMultiOrders", outputMultiOrders);
            this.outputMultiOrders = outputMultiOrders;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RecognizePurchaseRecordRequest build() {
            return new RecognizePurchaseRecordRequest(this);
        } 

    } 

}
