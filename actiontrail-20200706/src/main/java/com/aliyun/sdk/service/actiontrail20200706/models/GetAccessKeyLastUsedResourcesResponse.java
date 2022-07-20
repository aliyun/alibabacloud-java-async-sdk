// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedResourcesResponse} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedResourcesResponse</p>
 */
public class GetAccessKeyLastUsedResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccessKeyLastUsedResourcesResponseBody body;

    private GetAccessKeyLastUsedResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccessKeyLastUsedResourcesResponse create() {
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
    public GetAccessKeyLastUsedResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccessKeyLastUsedResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccessKeyLastUsedResourcesResponseBody body);

        @Override
        GetAccessKeyLastUsedResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccessKeyLastUsedResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccessKeyLastUsedResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccessKeyLastUsedResourcesResponse response) {
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
        public Builder body(GetAccessKeyLastUsedResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccessKeyLastUsedResourcesResponse build() {
            return new GetAccessKeyLastUsedResourcesResponse(this);
        } 

    } 

}
