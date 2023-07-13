// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomMetricResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomMetricResponse</p>
 */
public class DeleteCustomMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomMetricResponseBody body;

    private DeleteCustomMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomMetricResponse create() {
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
    public DeleteCustomMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomMetricResponseBody body);

        @Override
        DeleteCustomMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomMetricResponse response) {
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
        public Builder body(DeleteCustomMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomMetricResponse build() {
            return new DeleteCustomMetricResponse(this);
        } 

    } 

}
