// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCompareDetailResponse} extends {@link TeaModel}
 *
 * <p>GetCompareDetailResponse</p>
 */
public class GetCompareDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCompareDetailResponseBody body;

    private GetCompareDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCompareDetailResponse create() {
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
    public GetCompareDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCompareDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCompareDetailResponseBody body);

        @Override
        GetCompareDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCompareDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCompareDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCompareDetailResponse response) {
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
        public Builder body(GetCompareDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCompareDetailResponse build() {
            return new GetCompareDetailResponse(this);
        } 

    } 

}
