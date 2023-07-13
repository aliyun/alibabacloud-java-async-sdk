// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutExporterOutputResponse} extends {@link TeaModel}
 *
 * <p>PutExporterOutputResponse</p>
 */
public class PutExporterOutputResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutExporterOutputResponseBody body;

    private PutExporterOutputResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutExporterOutputResponse create() {
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
    public PutExporterOutputResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutExporterOutputResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutExporterOutputResponseBody body);

        @Override
        PutExporterOutputResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutExporterOutputResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutExporterOutputResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutExporterOutputResponse response) {
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
        public Builder body(PutExporterOutputResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutExporterOutputResponse build() {
            return new PutExporterOutputResponse(this);
        } 

    } 

}
