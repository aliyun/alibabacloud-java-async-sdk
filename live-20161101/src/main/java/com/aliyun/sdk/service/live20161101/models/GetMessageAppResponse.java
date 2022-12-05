// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageAppResponse} extends {@link TeaModel}
 *
 * <p>GetMessageAppResponse</p>
 */
public class GetMessageAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMessageAppResponseBody body;

    private GetMessageAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMessageAppResponse create() {
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
    public GetMessageAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMessageAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMessageAppResponseBody body);

        @Override
        GetMessageAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMessageAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMessageAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMessageAppResponse response) {
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
        public Builder body(GetMessageAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMessageAppResponse build() {
            return new GetMessageAppResponse(this);
        } 

    } 

}
