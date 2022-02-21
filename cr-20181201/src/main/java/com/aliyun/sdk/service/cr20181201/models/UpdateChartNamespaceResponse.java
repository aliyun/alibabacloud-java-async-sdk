// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateChartNamespaceResponse} extends {@link TeaModel}
 *
 * <p>UpdateChartNamespaceResponse</p>
 */
public class UpdateChartNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateChartNamespaceResponseBody body;

    private UpdateChartNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateChartNamespaceResponse create() {
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
    public UpdateChartNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateChartNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateChartNamespaceResponseBody body);

        @Override
        UpdateChartNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateChartNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateChartNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateChartNamespaceResponse response) {
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
        public Builder body(UpdateChartNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateChartNamespaceResponse build() {
            return new UpdateChartNamespaceResponse(this);
        } 

    } 

}
