// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSwimLaneResponse} extends {@link TeaModel}
 *
 * <p>CreateSwimLaneResponse</p>
 */
public class CreateSwimLaneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSwimLaneResponseBody body;

    private CreateSwimLaneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSwimLaneResponse create() {
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
    public CreateSwimLaneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSwimLaneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSwimLaneResponseBody body);

        @Override
        CreateSwimLaneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSwimLaneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSwimLaneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSwimLaneResponse response) {
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
        public Builder body(CreateSwimLaneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSwimLaneResponse build() {
            return new CreateSwimLaneResponse(this);
        } 

    } 

}
