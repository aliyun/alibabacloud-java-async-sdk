// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGroupDetailResponse} extends {@link TeaModel}
 *
 * <p>GetGroupDetailResponse</p>
 */
public class GetGroupDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGroupDetailResponseBody body;

    private GetGroupDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGroupDetailResponse create() {
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
    public GetGroupDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGroupDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGroupDetailResponseBody body);

        @Override
        GetGroupDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGroupDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGroupDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGroupDetailResponse response) {
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
        public Builder body(GetGroupDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGroupDetailResponse build() {
            return new GetGroupDetailResponse(this);
        } 

    } 

}
