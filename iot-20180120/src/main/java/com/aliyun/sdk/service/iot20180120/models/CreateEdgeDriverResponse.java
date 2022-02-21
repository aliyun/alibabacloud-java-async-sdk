// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeDriverResponse} extends {@link TeaModel}
 *
 * <p>CreateEdgeDriverResponse</p>
 */
public class CreateEdgeDriverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEdgeDriverResponseBody body;

    private CreateEdgeDriverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEdgeDriverResponse create() {
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
    public CreateEdgeDriverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEdgeDriverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEdgeDriverResponseBody body);

        @Override
        CreateEdgeDriverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEdgeDriverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEdgeDriverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEdgeDriverResponse response) {
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
        public Builder body(CreateEdgeDriverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEdgeDriverResponse build() {
            return new CreateEdgeDriverResponse(this);
        } 

    } 

}
