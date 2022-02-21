// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRectifyImageResponse} extends {@link TeaModel}
 *
 * <p>GetRectifyImageResponse</p>
 */
public class GetRectifyImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRectifyImageResponseBody body;

    private GetRectifyImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRectifyImageResponse create() {
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
    public GetRectifyImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRectifyImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRectifyImageResponseBody body);

        @Override
        GetRectifyImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRectifyImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRectifyImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRectifyImageResponse response) {
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
        public Builder body(GetRectifyImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRectifyImageResponse build() {
            return new GetRectifyImageResponse(this);
        } 

    } 

}
