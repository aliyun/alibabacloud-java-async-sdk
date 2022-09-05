// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetManagedPrometheusStatusResponse} extends {@link TeaModel}
 *
 * <p>GetManagedPrometheusStatusResponse</p>
 */
public class GetManagedPrometheusStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetManagedPrometheusStatusResponseBody body;

    private GetManagedPrometheusStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetManagedPrometheusStatusResponse create() {
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
    public GetManagedPrometheusStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetManagedPrometheusStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetManagedPrometheusStatusResponseBody body);

        @Override
        GetManagedPrometheusStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetManagedPrometheusStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetManagedPrometheusStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetManagedPrometheusStatusResponse response) {
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
        public Builder body(GetManagedPrometheusStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetManagedPrometheusStatusResponse build() {
            return new GetManagedPrometheusStatusResponse(this);
        } 

    } 

}
