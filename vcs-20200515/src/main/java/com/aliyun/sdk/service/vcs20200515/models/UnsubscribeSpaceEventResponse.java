// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnsubscribeSpaceEventResponse} extends {@link TeaModel}
 *
 * <p>UnsubscribeSpaceEventResponse</p>
 */
public class UnsubscribeSpaceEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnsubscribeSpaceEventResponseBody body;

    private UnsubscribeSpaceEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnsubscribeSpaceEventResponse create() {
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
    public UnsubscribeSpaceEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnsubscribeSpaceEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnsubscribeSpaceEventResponseBody body);

        @Override
        UnsubscribeSpaceEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnsubscribeSpaceEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnsubscribeSpaceEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnsubscribeSpaceEventResponse response) {
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
        public Builder body(UnsubscribeSpaceEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnsubscribeSpaceEventResponse build() {
            return new UnsubscribeSpaceEventResponse(this);
        } 

    } 

}
