// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleSecurityEventsResponse} extends {@link TeaModel}
 *
 * <p>HandleSecurityEventsResponse</p>
 */
public class HandleSecurityEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HandleSecurityEventsResponseBody body;

    private HandleSecurityEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HandleSecurityEventsResponse create() {
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
    public HandleSecurityEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HandleSecurityEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HandleSecurityEventsResponseBody body);

        @Override
        HandleSecurityEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HandleSecurityEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HandleSecurityEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HandleSecurityEventsResponse response) {
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
        public Builder body(HandleSecurityEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HandleSecurityEventsResponse build() {
            return new HandleSecurityEventsResponse(this);
        } 

    } 

}
