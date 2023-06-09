// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceCountsResponse} extends {@link TeaModel}
 *
 * <p>GetResourceCountsResponse</p>
 */
public class GetResourceCountsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceCountsResponseBody body;

    private GetResourceCountsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceCountsResponse create() {
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
    public GetResourceCountsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceCountsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceCountsResponseBody body);

        @Override
        GetResourceCountsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceCountsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceCountsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceCountsResponse response) {
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
        public Builder body(GetResourceCountsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceCountsResponse build() {
            return new GetResourceCountsResponse(this);
        } 

    } 

}
