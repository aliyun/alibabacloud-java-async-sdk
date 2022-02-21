// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChartNamespaceResponse} extends {@link TeaModel}
 *
 * <p>GetChartNamespaceResponse</p>
 */
public class GetChartNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChartNamespaceResponseBody body;

    private GetChartNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChartNamespaceResponse create() {
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
    public GetChartNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChartNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChartNamespaceResponseBody body);

        @Override
        GetChartNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChartNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChartNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChartNamespaceResponse response) {
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
        public Builder body(GetChartNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChartNamespaceResponse build() {
            return new GetChartNamespaceResponse(this);
        } 

    } 

}
