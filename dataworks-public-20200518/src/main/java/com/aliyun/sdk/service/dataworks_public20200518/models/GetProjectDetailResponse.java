// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectDetailResponse} extends {@link TeaModel}
 *
 * <p>GetProjectDetailResponse</p>
 */
public class GetProjectDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProjectDetailResponseBody body;

    private GetProjectDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProjectDetailResponse create() {
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
    public GetProjectDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProjectDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProjectDetailResponseBody body);

        @Override
        GetProjectDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProjectDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProjectDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProjectDetailResponse response) {
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
        public Builder body(GetProjectDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProjectDetailResponse build() {
            return new GetProjectDetailResponse(this);
        } 

    } 

}
