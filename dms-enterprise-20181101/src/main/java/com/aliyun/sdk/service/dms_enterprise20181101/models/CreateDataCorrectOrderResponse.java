// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataCorrectOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateDataCorrectOrderResponse</p>
 */
public class CreateDataCorrectOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataCorrectOrderResponseBody body;

    private CreateDataCorrectOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataCorrectOrderResponse create() {
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
    public CreateDataCorrectOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataCorrectOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataCorrectOrderResponseBody body);

        @Override
        CreateDataCorrectOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataCorrectOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataCorrectOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataCorrectOrderResponse response) {
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
        public Builder body(CreateDataCorrectOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataCorrectOrderResponse build() {
            return new CreateDataCorrectOrderResponse(this);
        } 

    } 

}
