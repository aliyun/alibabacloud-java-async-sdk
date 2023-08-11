// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGrafanaDashboardUrlResponse} extends {@link TeaModel}
 *
 * <p>GetGrafanaDashboardUrlResponse</p>
 */
public class GetGrafanaDashboardUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGrafanaDashboardUrlResponseBody body;

    private GetGrafanaDashboardUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGrafanaDashboardUrlResponse create() {
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
    public GetGrafanaDashboardUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGrafanaDashboardUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGrafanaDashboardUrlResponseBody body);

        @Override
        GetGrafanaDashboardUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGrafanaDashboardUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGrafanaDashboardUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGrafanaDashboardUrlResponse response) {
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
        public Builder body(GetGrafanaDashboardUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGrafanaDashboardUrlResponse build() {
            return new GetGrafanaDashboardUrlResponse(this);
        } 

    } 

}
