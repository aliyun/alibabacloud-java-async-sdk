// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingConfigResponse} extends {@link TeaModel}
 *
 * <p>GetWebHostingConfigResponse</p>
 */
public class GetWebHostingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWebHostingConfigResponseBody body;

    private GetWebHostingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWebHostingConfigResponse create() {
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
    public GetWebHostingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWebHostingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWebHostingConfigResponseBody body);

        @Override
        GetWebHostingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWebHostingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWebHostingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWebHostingConfigResponse response) {
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
        public Builder body(GetWebHostingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWebHostingConfigResponse build() {
            return new GetWebHostingConfigResponse(this);
        } 

    } 

}
