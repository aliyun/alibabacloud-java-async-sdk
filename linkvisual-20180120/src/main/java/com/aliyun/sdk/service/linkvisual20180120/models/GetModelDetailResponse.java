// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelDetailResponse} extends {@link TeaModel}
 *
 * <p>GetModelDetailResponse</p>
 */
public class GetModelDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModelDetailResponseBody body;

    private GetModelDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModelDetailResponse create() {
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
    public GetModelDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModelDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModelDetailResponseBody body);

        @Override
        GetModelDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModelDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModelDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModelDetailResponse response) {
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
        public Builder body(GetModelDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModelDetailResponse build() {
            return new GetModelDetailResponse(this);
        } 

    } 

}
