// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptInquiredSystemEventResponse} extends {@link TeaModel}
 *
 * <p>AcceptInquiredSystemEventResponse</p>
 */
public class AcceptInquiredSystemEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcceptInquiredSystemEventResponseBody body;

    private AcceptInquiredSystemEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcceptInquiredSystemEventResponse create() {
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
    public AcceptInquiredSystemEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptInquiredSystemEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcceptInquiredSystemEventResponseBody body);

        @Override
        AcceptInquiredSystemEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptInquiredSystemEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcceptInquiredSystemEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptInquiredSystemEventResponse response) {
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
        public Builder body(AcceptInquiredSystemEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptInquiredSystemEventResponse build() {
            return new AcceptInquiredSystemEventResponse(this);
        } 

    } 

}
