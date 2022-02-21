// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIImageJobsResponse} extends {@link TeaModel}
 *
 * <p>GetAIImageJobsResponse</p>
 */
public class GetAIImageJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAIImageJobsResponseBody body;

    private GetAIImageJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAIImageJobsResponse create() {
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
    public GetAIImageJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAIImageJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAIImageJobsResponseBody body);

        @Override
        GetAIImageJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAIImageJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAIImageJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAIImageJobsResponse response) {
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
        public Builder body(GetAIImageJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAIImageJobsResponse build() {
            return new GetAIImageJobsResponse(this);
        } 

    } 

}
