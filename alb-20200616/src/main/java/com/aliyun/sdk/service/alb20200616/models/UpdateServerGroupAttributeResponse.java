// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServerGroupAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateServerGroupAttributeResponse</p>
 */
public class UpdateServerGroupAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServerGroupAttributeResponseBody body;

    private UpdateServerGroupAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServerGroupAttributeResponse create() {
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
    public UpdateServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServerGroupAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServerGroupAttributeResponseBody body);

        @Override
        UpdateServerGroupAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServerGroupAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServerGroupAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServerGroupAttributeResponse response) {
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
        public Builder body(UpdateServerGroupAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServerGroupAttributeResponse build() {
            return new UpdateServerGroupAttributeResponse(this);
        } 

    } 

}
