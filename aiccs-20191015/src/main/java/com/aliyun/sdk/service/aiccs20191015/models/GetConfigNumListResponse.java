// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigNumListResponse} extends {@link TeaModel}
 *
 * <p>GetConfigNumListResponse</p>
 */
public class GetConfigNumListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConfigNumListResponseBody body;

    private GetConfigNumListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConfigNumListResponse create() {
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
    public GetConfigNumListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConfigNumListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConfigNumListResponseBody body);

        @Override
        GetConfigNumListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConfigNumListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConfigNumListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConfigNumListResponse response) {
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
        public Builder body(GetConfigNumListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConfigNumListResponse build() {
            return new GetConfigNumListResponse(this);
        } 

    } 

}
