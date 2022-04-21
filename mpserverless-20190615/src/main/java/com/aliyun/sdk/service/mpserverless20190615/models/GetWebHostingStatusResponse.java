// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingStatusResponse} extends {@link TeaModel}
 *
 * <p>GetWebHostingStatusResponse</p>
 */
public class GetWebHostingStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWebHostingStatusResponseBody body;

    private GetWebHostingStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWebHostingStatusResponse create() {
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
    public GetWebHostingStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWebHostingStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWebHostingStatusResponseBody body);

        @Override
        GetWebHostingStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWebHostingStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWebHostingStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWebHostingStatusResponse response) {
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
        public Builder body(GetWebHostingStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWebHostingStatusResponse build() {
            return new GetWebHostingStatusResponse(this);
        } 

    } 

}
