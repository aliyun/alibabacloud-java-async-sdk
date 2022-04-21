// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStsInfoAndOssPathResponse} extends {@link TeaModel}
 *
 * <p>GetStsInfoAndOssPathResponse</p>
 */
public class GetStsInfoAndOssPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStsInfoAndOssPathResponseBody body;

    private GetStsInfoAndOssPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStsInfoAndOssPathResponse create() {
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
    public GetStsInfoAndOssPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStsInfoAndOssPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStsInfoAndOssPathResponseBody body);

        @Override
        GetStsInfoAndOssPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStsInfoAndOssPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStsInfoAndOssPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStsInfoAndOssPathResponse response) {
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
        public Builder body(GetStsInfoAndOssPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStsInfoAndOssPathResponse build() {
            return new GetStsInfoAndOssPathResponse(this);
        } 

    } 

}
