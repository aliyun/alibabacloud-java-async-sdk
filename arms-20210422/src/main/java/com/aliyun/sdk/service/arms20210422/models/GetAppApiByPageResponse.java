// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppApiByPageResponse} extends {@link TeaModel}
 *
 * <p>GetAppApiByPageResponse</p>
 */
public class GetAppApiByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppApiByPageResponseBody body;

    private GetAppApiByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppApiByPageResponse create() {
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
    public GetAppApiByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppApiByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppApiByPageResponseBody body);

        @Override
        GetAppApiByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppApiByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppApiByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppApiByPageResponse response) {
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
        public Builder body(GetAppApiByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppApiByPageResponse build() {
            return new GetAppApiByPageResponse(this);
        } 

    } 

}
