// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageResponse} extends {@link TeaModel}
 *
 * <p>GetImageResponse</p>
 */
public class GetImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImageResponseBody body;

    private GetImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImageResponse create() {
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
    public GetImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImageResponseBody body);

        @Override
        GetImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageResponse response) {
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
        public Builder body(GetImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageResponse build() {
            return new GetImageResponse(this);
        } 

    } 

}
