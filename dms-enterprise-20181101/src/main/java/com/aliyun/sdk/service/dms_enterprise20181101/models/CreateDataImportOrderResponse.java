// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataImportOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateDataImportOrderResponse</p>
 */
public class CreateDataImportOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataImportOrderResponseBody body;

    private CreateDataImportOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataImportOrderResponse create() {
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
    public CreateDataImportOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataImportOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataImportOrderResponseBody body);

        @Override
        CreateDataImportOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataImportOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataImportOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataImportOrderResponse response) {
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
        public Builder body(CreateDataImportOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataImportOrderResponse build() {
            return new CreateDataImportOrderResponse(this);
        } 

    } 

}
