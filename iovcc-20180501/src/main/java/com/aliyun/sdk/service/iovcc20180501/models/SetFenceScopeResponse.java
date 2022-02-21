// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetFenceScopeResponse} extends {@link TeaModel}
 *
 * <p>SetFenceScopeResponse</p>
 */
public class SetFenceScopeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetFenceScopeResponseBody body;

    private SetFenceScopeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetFenceScopeResponse create() {
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
    public SetFenceScopeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetFenceScopeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetFenceScopeResponseBody body);

        @Override
        SetFenceScopeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetFenceScopeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetFenceScopeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetFenceScopeResponse response) {
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
        public Builder body(SetFenceScopeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetFenceScopeResponse build() {
            return new SetFenceScopeResponse(this);
        } 

    } 

}
