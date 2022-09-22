// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMeetingTransResponse} extends {@link TeaModel}
 *
 * <p>StopMeetingTransResponse</p>
 */
public class StopMeetingTransResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopMeetingTransResponseBody body;

    private StopMeetingTransResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopMeetingTransResponse create() {
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
    public StopMeetingTransResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopMeetingTransResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopMeetingTransResponseBody body);

        @Override
        StopMeetingTransResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopMeetingTransResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopMeetingTransResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopMeetingTransResponse response) {
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
        public Builder body(StopMeetingTransResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopMeetingTransResponse build() {
            return new StopMeetingTransResponse(this);
        } 

    } 

}
