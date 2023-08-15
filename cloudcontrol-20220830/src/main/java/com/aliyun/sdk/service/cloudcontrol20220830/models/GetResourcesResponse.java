// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcesResponse} extends {@link TeaModel}
 *
 * <p>GetResourcesResponse</p>
 */
public class GetResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourcesResponseBody body;

    private GetResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourcesResponse create() {
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
    public GetResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourcesResponseBody body);

        @Override
        GetResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourcesResponse response) {
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
        public Builder body(GetResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourcesResponse build() {
            return new GetResourcesResponse(this);
        } 

    } 

}
