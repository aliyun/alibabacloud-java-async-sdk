// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWatermarkResponse} extends {@link TeaModel}
 *
 * <p>GetWatermarkResponse</p>
 */
public class GetWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWatermarkResponseBody body;

    private GetWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWatermarkResponse create() {
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
    public GetWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWatermarkResponseBody body);

        @Override
        GetWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWatermarkResponse response) {
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
        public Builder body(GetWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWatermarkResponse build() {
            return new GetWatermarkResponse(this);
        } 

    } 

}
