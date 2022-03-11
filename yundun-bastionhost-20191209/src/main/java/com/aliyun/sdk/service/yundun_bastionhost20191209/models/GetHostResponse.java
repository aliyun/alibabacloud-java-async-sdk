// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostResponse} extends {@link TeaModel}
 *
 * <p>GetHostResponse</p>
 */
public class GetHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHostResponseBody body;

    private GetHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHostResponse create() {
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
    public GetHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHostResponseBody body);

        @Override
        GetHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHostResponse response) {
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
        public Builder body(GetHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHostResponse build() {
            return new GetHostResponse(this);
        } 

    } 

}
