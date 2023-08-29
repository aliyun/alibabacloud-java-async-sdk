// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IgnoreEventsResponse} extends {@link TeaModel}
 *
 * <p>IgnoreEventsResponse</p>
 */
public class IgnoreEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IgnoreEventsResponseBody body;

    private IgnoreEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IgnoreEventsResponse create() {
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
    public IgnoreEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IgnoreEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IgnoreEventsResponseBody body);

        @Override
        IgnoreEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IgnoreEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IgnoreEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IgnoreEventsResponse response) {
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
        public Builder body(IgnoreEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IgnoreEventsResponse build() {
            return new IgnoreEventsResponse(this);
        } 

    } 

}
