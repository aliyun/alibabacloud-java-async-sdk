// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InterceptCallResponse} extends {@link TeaModel}
 *
 * <p>InterceptCallResponse</p>
 */
public class InterceptCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InterceptCallResponseBody body;

    private InterceptCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InterceptCallResponse create() {
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
    public InterceptCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InterceptCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InterceptCallResponseBody body);

        @Override
        InterceptCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InterceptCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InterceptCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InterceptCallResponse response) {
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
        public Builder body(InterceptCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InterceptCallResponse build() {
            return new InterceptCallResponse(this);
        } 

    } 

}
