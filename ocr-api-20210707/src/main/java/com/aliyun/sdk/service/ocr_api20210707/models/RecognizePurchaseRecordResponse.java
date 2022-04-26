// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizePurchaseRecordResponse} extends {@link TeaModel}
 *
 * <p>RecognizePurchaseRecordResponse</p>
 */
public class RecognizePurchaseRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizePurchaseRecordResponseBody body;

    private RecognizePurchaseRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizePurchaseRecordResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public RecognizePurchaseRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizePurchaseRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizePurchaseRecordResponseBody body);

        @Override
        RecognizePurchaseRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizePurchaseRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizePurchaseRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizePurchaseRecordResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RecognizePurchaseRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizePurchaseRecordResponse build() {
            return new RecognizePurchaseRecordResponse(this);
        } 

    } 

}
