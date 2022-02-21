// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProfileDetailResponse} extends {@link TeaModel}
 *
 * <p>GetProfileDetailResponse</p>
 */
public class GetProfileDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProfileDetailResponseBody body;

    private GetProfileDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProfileDetailResponse create() {
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
    public GetProfileDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProfileDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProfileDetailResponseBody body);

        @Override
        GetProfileDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProfileDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProfileDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProfileDetailResponse response) {
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
        public Builder body(GetProfileDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProfileDetailResponse build() {
            return new GetProfileDetailResponse(this);
        } 

    } 

}
