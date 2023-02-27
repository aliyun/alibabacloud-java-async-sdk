// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealtimeInstanceStatesResponse} extends {@link TeaModel}
 *
 * <p>GetRealtimeInstanceStatesResponse</p>
 */
public class GetRealtimeInstanceStatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRealtimeInstanceStatesResponseBody body;

    private GetRealtimeInstanceStatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRealtimeInstanceStatesResponse create() {
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
    public GetRealtimeInstanceStatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRealtimeInstanceStatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRealtimeInstanceStatesResponseBody body);

        @Override
        GetRealtimeInstanceStatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRealtimeInstanceStatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRealtimeInstanceStatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRealtimeInstanceStatesResponse response) {
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
        public Builder body(GetRealtimeInstanceStatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRealtimeInstanceStatesResponse build() {
            return new GetRealtimeInstanceStatesResponse(this);
        } 

    } 

}
