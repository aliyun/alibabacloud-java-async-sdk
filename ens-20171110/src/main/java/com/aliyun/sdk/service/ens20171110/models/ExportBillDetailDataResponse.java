// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportBillDetailDataResponse} extends {@link TeaModel}
 *
 * <p>ExportBillDetailDataResponse</p>
 */
public class ExportBillDetailDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportBillDetailDataResponseBody body;

    private ExportBillDetailDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportBillDetailDataResponse create() {
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
    public ExportBillDetailDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportBillDetailDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportBillDetailDataResponseBody body);

        @Override
        ExportBillDetailDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportBillDetailDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportBillDetailDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportBillDetailDataResponse response) {
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
        public Builder body(ExportBillDetailDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportBillDetailDataResponse build() {
            return new ExportBillDetailDataResponse(this);
        } 

    } 

}
