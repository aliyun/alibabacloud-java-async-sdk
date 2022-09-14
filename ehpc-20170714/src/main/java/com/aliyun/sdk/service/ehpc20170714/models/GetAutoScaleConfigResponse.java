// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoScaleConfigResponse} extends {@link TeaModel}
 *
 * <p>GetAutoScaleConfigResponse</p>
 */
public class GetAutoScaleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAutoScaleConfigResponseBody body;

    private GetAutoScaleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAutoScaleConfigResponse create() {
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
    public GetAutoScaleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAutoScaleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAutoScaleConfigResponseBody body);

        @Override
        GetAutoScaleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAutoScaleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAutoScaleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAutoScaleConfigResponse response) {
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
        public Builder body(GetAutoScaleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAutoScaleConfigResponse build() {
            return new GetAutoScaleConfigResponse(this);
        } 

    } 

}
