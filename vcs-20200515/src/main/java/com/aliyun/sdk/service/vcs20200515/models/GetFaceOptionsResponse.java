// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFaceOptionsResponse} extends {@link TeaModel}
 *
 * <p>GetFaceOptionsResponse</p>
 */
public class GetFaceOptionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFaceOptionsResponseBody body;

    private GetFaceOptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFaceOptionsResponse create() {
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
    public GetFaceOptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFaceOptionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFaceOptionsResponseBody body);

        @Override
        GetFaceOptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFaceOptionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFaceOptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFaceOptionsResponse response) {
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
        public Builder body(GetFaceOptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFaceOptionsResponse build() {
            return new GetFaceOptionsResponse(this);
        } 

    } 

}
