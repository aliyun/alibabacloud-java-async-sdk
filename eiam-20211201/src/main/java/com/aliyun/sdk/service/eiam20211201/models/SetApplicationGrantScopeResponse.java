// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetApplicationGrantScopeResponse} extends {@link TeaModel}
 *
 * <p>SetApplicationGrantScopeResponse</p>
 */
public class SetApplicationGrantScopeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetApplicationGrantScopeResponseBody body;

    private SetApplicationGrantScopeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetApplicationGrantScopeResponse create() {
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
    public SetApplicationGrantScopeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetApplicationGrantScopeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetApplicationGrantScopeResponseBody body);

        @Override
        SetApplicationGrantScopeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetApplicationGrantScopeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetApplicationGrantScopeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetApplicationGrantScopeResponse response) {
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
        public Builder body(SetApplicationGrantScopeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetApplicationGrantScopeResponse build() {
            return new SetApplicationGrantScopeResponse(this);
        } 

    } 

}
