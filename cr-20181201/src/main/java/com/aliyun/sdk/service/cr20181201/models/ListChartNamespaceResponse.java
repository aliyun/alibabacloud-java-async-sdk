// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartNamespaceResponse} extends {@link TeaModel}
 *
 * <p>ListChartNamespaceResponse</p>
 */
public class ListChartNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChartNamespaceResponseBody body;

    private ListChartNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChartNamespaceResponse create() {
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
    public ListChartNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChartNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChartNamespaceResponseBody body);

        @Override
        ListChartNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChartNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChartNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChartNamespaceResponse response) {
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
        public Builder body(ListChartNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChartNamespaceResponse build() {
            return new ListChartNamespaceResponse(this);
        } 

    } 

}
