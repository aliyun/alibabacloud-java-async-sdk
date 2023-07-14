// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrometheusInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreatePrometheusInstanceResponse</p>
 */
public class CreatePrometheusInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePrometheusInstanceResponseBody body;

    private CreatePrometheusInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePrometheusInstanceResponse create() {
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
    public CreatePrometheusInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrometheusInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePrometheusInstanceResponseBody body);

        @Override
        CreatePrometheusInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrometheusInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePrometheusInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrometheusInstanceResponse response) {
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
        public Builder body(CreatePrometheusInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrometheusInstanceResponse build() {
            return new CreatePrometheusInstanceResponse(this);
        } 

    } 

}
