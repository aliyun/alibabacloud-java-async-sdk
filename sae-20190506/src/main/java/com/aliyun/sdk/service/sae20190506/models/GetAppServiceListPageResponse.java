// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppServiceListPageResponse} extends {@link TeaModel}
 *
 * <p>GetAppServiceListPageResponse</p>
 */
public class GetAppServiceListPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppServiceListPageResponseBody body;

    private GetAppServiceListPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppServiceListPageResponse create() {
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
    public GetAppServiceListPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppServiceListPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppServiceListPageResponseBody body);

        @Override
        GetAppServiceListPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppServiceListPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppServiceListPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppServiceListPageResponse response) {
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
        public Builder body(GetAppServiceListPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppServiceListPageResponse build() {
            return new GetAppServiceListPageResponse(this);
        } 

    } 

}
