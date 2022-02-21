// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClassDetailResponse} extends {@link TeaModel}
 *
 * <p>GetClassDetailResponse</p>
 */
public class GetClassDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClassDetailResponseBody body;

    private GetClassDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClassDetailResponse create() {
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
    public GetClassDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClassDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClassDetailResponseBody body);

        @Override
        GetClassDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClassDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClassDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClassDetailResponse response) {
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
        public Builder body(GetClassDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClassDetailResponse build() {
            return new GetClassDetailResponse(this);
        } 

    } 

}
