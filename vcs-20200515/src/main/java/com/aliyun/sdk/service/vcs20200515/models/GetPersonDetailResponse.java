// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPersonDetailResponse} extends {@link TeaModel}
 *
 * <p>GetPersonDetailResponse</p>
 */
public class GetPersonDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPersonDetailResponseBody body;

    private GetPersonDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPersonDetailResponse create() {
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
    public GetPersonDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPersonDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPersonDetailResponseBody body);

        @Override
        GetPersonDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPersonDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPersonDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPersonDetailResponse response) {
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
        public Builder body(GetPersonDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPersonDetailResponse build() {
            return new GetPersonDetailResponse(this);
        } 

    } 

}
