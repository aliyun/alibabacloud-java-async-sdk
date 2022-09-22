// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMeetingTransResponse} extends {@link TeaModel}
 *
 * <p>GetMeetingTransResponse</p>
 */
public class GetMeetingTransResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMeetingTransResponseBody body;

    private GetMeetingTransResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMeetingTransResponse create() {
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
    public GetMeetingTransResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMeetingTransResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMeetingTransResponseBody body);

        @Override
        GetMeetingTransResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMeetingTransResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMeetingTransResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMeetingTransResponse response) {
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
        public Builder body(GetMeetingTransResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMeetingTransResponse build() {
            return new GetMeetingTransResponse(this);
        } 

    } 

}
