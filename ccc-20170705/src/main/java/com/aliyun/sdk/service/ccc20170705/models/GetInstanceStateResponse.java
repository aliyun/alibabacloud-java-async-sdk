// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStateResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceStateResponse</p>
 */
public class GetInstanceStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceStateResponseBody body;

    private GetInstanceStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceStateResponse create() {
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
    public GetInstanceStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceStateResponseBody body);

        @Override
        GetInstanceStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceStateResponse response) {
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
        public Builder body(GetInstanceStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceStateResponse build() {
            return new GetInstanceStateResponse(this);
        } 

    } 

}
