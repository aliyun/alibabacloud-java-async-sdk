// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveResponse} extends {@link TeaModel}
 *
 * <p>GetLiveResponse</p>
 */
public class GetLiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveResponseBody body;

    private GetLiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLiveResponse create() {
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
    public GetLiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLiveResponseBody body);

        @Override
        GetLiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveResponse response) {
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
        public Builder body(GetLiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveResponse build() {
            return new GetLiveResponse(this);
        } 

    } 

}
