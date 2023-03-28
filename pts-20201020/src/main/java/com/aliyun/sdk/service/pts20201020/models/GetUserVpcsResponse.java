// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserVpcsResponse} extends {@link TeaModel}
 *
 * <p>GetUserVpcsResponse</p>
 */
public class GetUserVpcsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserVpcsResponseBody body;

    private GetUserVpcsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserVpcsResponse create() {
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
    public GetUserVpcsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserVpcsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserVpcsResponseBody body);

        @Override
        GetUserVpcsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserVpcsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserVpcsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserVpcsResponse response) {
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
        public Builder body(GetUserVpcsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserVpcsResponse build() {
            return new GetUserVpcsResponse(this);
        } 

    } 

}
