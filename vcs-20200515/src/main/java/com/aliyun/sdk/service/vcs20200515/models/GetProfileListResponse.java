// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProfileListResponse} extends {@link TeaModel}
 *
 * <p>GetProfileListResponse</p>
 */
public class GetProfileListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProfileListResponseBody body;

    private GetProfileListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProfileListResponse create() {
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
    public GetProfileListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProfileListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProfileListResponseBody body);

        @Override
        GetProfileListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProfileListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProfileListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProfileListResponse response) {
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
        public Builder body(GetProfileListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProfileListResponse build() {
            return new GetProfileListResponse(this);
        } 

    } 

}
