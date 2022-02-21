// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeDriverVersionResponse} extends {@link TeaModel}
 *
 * <p>CreateEdgeDriverVersionResponse</p>
 */
public class CreateEdgeDriverVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEdgeDriverVersionResponseBody body;

    private CreateEdgeDriverVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEdgeDriverVersionResponse create() {
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
    public CreateEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEdgeDriverVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEdgeDriverVersionResponseBody body);

        @Override
        CreateEdgeDriverVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEdgeDriverVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEdgeDriverVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEdgeDriverVersionResponse response) {
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
        public Builder body(CreateEdgeDriverVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEdgeDriverVersionResponse build() {
            return new CreateEdgeDriverVersionResponse(this);
        } 

    } 

}
