// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataAPIServiceResponse} extends {@link TeaModel}
 *
 * <p>CreateDataAPIServiceResponse</p>
 */
public class CreateDataAPIServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataAPIServiceResponseBody body;

    private CreateDataAPIServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataAPIServiceResponse create() {
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
    public CreateDataAPIServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataAPIServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataAPIServiceResponseBody body);

        @Override
        CreateDataAPIServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataAPIServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataAPIServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataAPIServiceResponse response) {
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
        public Builder body(CreateDataAPIServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataAPIServiceResponse build() {
            return new CreateDataAPIServiceResponse(this);
        } 

    } 

}
