// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIfEcsTypeSupportHtConfigResponse} extends {@link TeaModel}
 *
 * <p>GetIfEcsTypeSupportHtConfigResponse</p>
 */
public class GetIfEcsTypeSupportHtConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIfEcsTypeSupportHtConfigResponseBody body;

    private GetIfEcsTypeSupportHtConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIfEcsTypeSupportHtConfigResponse create() {
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
    public GetIfEcsTypeSupportHtConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIfEcsTypeSupportHtConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIfEcsTypeSupportHtConfigResponseBody body);

        @Override
        GetIfEcsTypeSupportHtConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIfEcsTypeSupportHtConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIfEcsTypeSupportHtConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIfEcsTypeSupportHtConfigResponse response) {
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
        public Builder body(GetIfEcsTypeSupportHtConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIfEcsTypeSupportHtConfigResponse build() {
            return new GetIfEcsTypeSupportHtConfigResponse(this);
        } 

    } 

}
