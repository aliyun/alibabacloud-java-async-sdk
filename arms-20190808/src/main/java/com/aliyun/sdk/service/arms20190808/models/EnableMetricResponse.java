// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMetricResponse} extends {@link TeaModel}
 *
 * <p>EnableMetricResponse</p>
 */
public class EnableMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableMetricResponseBody body;

    private EnableMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableMetricResponse create() {
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
    public EnableMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableMetricResponseBody body);

        @Override
        EnableMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableMetricResponse response) {
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
        public Builder body(EnableMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableMetricResponse build() {
            return new EnableMetricResponse(this);
        } 

    } 

}
