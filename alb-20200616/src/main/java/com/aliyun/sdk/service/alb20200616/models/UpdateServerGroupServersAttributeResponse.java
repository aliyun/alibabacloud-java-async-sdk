// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServerGroupServersAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateServerGroupServersAttributeResponse</p>
 */
public class UpdateServerGroupServersAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServerGroupServersAttributeResponseBody body;

    private UpdateServerGroupServersAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServerGroupServersAttributeResponse create() {
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
    public UpdateServerGroupServersAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServerGroupServersAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServerGroupServersAttributeResponseBody body);

        @Override
        UpdateServerGroupServersAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServerGroupServersAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServerGroupServersAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServerGroupServersAttributeResponse response) {
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
        public Builder body(UpdateServerGroupServersAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServerGroupServersAttributeResponse build() {
            return new UpdateServerGroupServersAttributeResponse(this);
        } 

    } 

}
