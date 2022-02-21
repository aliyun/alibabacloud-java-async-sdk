// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTrafficControlApisResponse} extends {@link TeaModel}
 *
 * <p>RemoveTrafficControlApisResponse</p>
 */
public class RemoveTrafficControlApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveTrafficControlApisResponseBody body;

    private RemoveTrafficControlApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveTrafficControlApisResponse create() {
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
    public RemoveTrafficControlApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveTrafficControlApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveTrafficControlApisResponseBody body);

        @Override
        RemoveTrafficControlApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveTrafficControlApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveTrafficControlApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveTrafficControlApisResponse response) {
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
        public Builder body(RemoveTrafficControlApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveTrafficControlApisResponse build() {
            return new RemoveTrafficControlApisResponse(this);
        } 

    } 

}
