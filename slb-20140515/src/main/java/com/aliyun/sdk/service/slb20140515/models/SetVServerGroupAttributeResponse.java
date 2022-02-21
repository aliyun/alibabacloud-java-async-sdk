// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVServerGroupAttributeResponse} extends {@link TeaModel}
 *
 * <p>SetVServerGroupAttributeResponse</p>
 */
public class SetVServerGroupAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetVServerGroupAttributeResponseBody body;

    private SetVServerGroupAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetVServerGroupAttributeResponse create() {
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
    public SetVServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetVServerGroupAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetVServerGroupAttributeResponseBody body);

        @Override
        SetVServerGroupAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetVServerGroupAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetVServerGroupAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetVServerGroupAttributeResponse response) {
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
        public Builder body(SetVServerGroupAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetVServerGroupAttributeResponse build() {
            return new SetVServerGroupAttributeResponse(this);
        } 

    } 

}
