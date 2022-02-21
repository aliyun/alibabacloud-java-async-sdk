// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotspotConfigResponse} extends {@link TeaModel}
 *
 * <p>GetHotspotConfigResponse</p>
 */
public class GetHotspotConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotspotConfigResponseBody body;

    private GetHotspotConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotspotConfigResponse create() {
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
    public GetHotspotConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotspotConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotspotConfigResponseBody body);

        @Override
        GetHotspotConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotspotConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotspotConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotspotConfigResponse response) {
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
        public Builder body(GetHotspotConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotspotConfigResponse build() {
            return new GetHotspotConfigResponse(this);
        } 

    } 

}
