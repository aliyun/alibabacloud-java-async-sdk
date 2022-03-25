// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualNodeResponse} extends {@link TeaModel}
 *
 * <p>CreateVirtualNodeResponse</p>
 */
public class CreateVirtualNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVirtualNodeResponseBody body;

    private CreateVirtualNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVirtualNodeResponse create() {
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
    public CreateVirtualNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVirtualNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVirtualNodeResponseBody body);

        @Override
        CreateVirtualNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVirtualNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVirtualNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVirtualNodeResponse response) {
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
        public Builder body(CreateVirtualNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVirtualNodeResponse build() {
            return new CreateVirtualNodeResponse(this);
        } 

    } 

}
