// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVmAndSaveStockResponse} extends {@link TeaModel}
 *
 * <p>CreateVmAndSaveStockResponse</p>
 */
public class CreateVmAndSaveStockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVmAndSaveStockResponseBody body;

    private CreateVmAndSaveStockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVmAndSaveStockResponse create() {
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
    public CreateVmAndSaveStockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVmAndSaveStockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVmAndSaveStockResponseBody body);

        @Override
        CreateVmAndSaveStockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVmAndSaveStockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVmAndSaveStockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVmAndSaveStockResponse response) {
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
        public Builder body(CreateVmAndSaveStockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVmAndSaveStockResponse build() {
            return new CreateVmAndSaveStockResponse(this);
        } 

    } 

}
