// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoTaskInfoResponse} extends {@link TeaModel}
 *
 * <p>GetVideoTaskInfoResponse</p>
 */
public class GetVideoTaskInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVideoTaskInfoResponseBody body;

    private GetVideoTaskInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVideoTaskInfoResponse create() {
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
    public GetVideoTaskInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVideoTaskInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVideoTaskInfoResponseBody body);

        @Override
        GetVideoTaskInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVideoTaskInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVideoTaskInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVideoTaskInfoResponse response) {
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
        public Builder body(GetVideoTaskInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVideoTaskInfoResponse build() {
            return new GetVideoTaskInfoResponse(this);
        } 

    } 

}
