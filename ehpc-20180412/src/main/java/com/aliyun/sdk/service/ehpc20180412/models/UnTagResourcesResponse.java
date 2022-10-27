// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnTagResourcesResponse} extends {@link TeaModel}
 *
 * <p>UnTagResourcesResponse</p>
 */
public class UnTagResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnTagResourcesResponseBody body;

    private UnTagResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnTagResourcesResponse create() {
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
    public UnTagResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnTagResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnTagResourcesResponseBody body);

        @Override
        UnTagResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnTagResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnTagResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnTagResourcesResponse response) {
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
        public Builder body(UnTagResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnTagResourcesResponse build() {
            return new UnTagResourcesResponse(this);
        } 

    } 

}
