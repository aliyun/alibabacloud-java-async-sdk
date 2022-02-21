// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PromVpcExporterManagerResponse} extends {@link TeaModel}
 *
 * <p>PromVpcExporterManagerResponse</p>
 */
public class PromVpcExporterManagerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PromVpcExporterManagerResponseBody body;

    private PromVpcExporterManagerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PromVpcExporterManagerResponse create() {
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
    public PromVpcExporterManagerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PromVpcExporterManagerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PromVpcExporterManagerResponseBody body);

        @Override
        PromVpcExporterManagerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PromVpcExporterManagerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PromVpcExporterManagerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PromVpcExporterManagerResponse response) {
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
        public Builder body(PromVpcExporterManagerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PromVpcExporterManagerResponse build() {
            return new PromVpcExporterManagerResponse(this);
        } 

    } 

}
