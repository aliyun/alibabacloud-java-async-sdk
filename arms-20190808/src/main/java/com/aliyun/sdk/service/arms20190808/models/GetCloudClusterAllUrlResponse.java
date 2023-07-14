// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudClusterAllUrlResponse} extends {@link TeaModel}
 *
 * <p>GetCloudClusterAllUrlResponse</p>
 */
public class GetCloudClusterAllUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCloudClusterAllUrlResponseBody body;

    private GetCloudClusterAllUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCloudClusterAllUrlResponse create() {
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
    public GetCloudClusterAllUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCloudClusterAllUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCloudClusterAllUrlResponseBody body);

        @Override
        GetCloudClusterAllUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCloudClusterAllUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCloudClusterAllUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCloudClusterAllUrlResponse response) {
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
        public Builder body(GetCloudClusterAllUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCloudClusterAllUrlResponse build() {
            return new GetCloudClusterAllUrlResponse(this);
        } 

    } 

}
