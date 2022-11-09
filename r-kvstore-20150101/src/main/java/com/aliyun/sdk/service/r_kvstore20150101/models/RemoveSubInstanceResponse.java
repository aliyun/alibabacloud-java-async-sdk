// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSubInstanceResponse} extends {@link TeaModel}
 *
 * <p>RemoveSubInstanceResponse</p>
 */
public class RemoveSubInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveSubInstanceResponseBody body;

    private RemoveSubInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveSubInstanceResponse create() {
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
    public RemoveSubInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSubInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveSubInstanceResponseBody body);

        @Override
        RemoveSubInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSubInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveSubInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSubInstanceResponse response) {
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
        public Builder body(RemoveSubInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSubInstanceResponse build() {
            return new RemoveSubInstanceResponse(this);
        } 

    } 

}
