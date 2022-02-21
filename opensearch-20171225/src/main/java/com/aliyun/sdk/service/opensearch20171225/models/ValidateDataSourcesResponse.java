// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateDataSourcesResponse} extends {@link TeaModel}
 *
 * <p>ValidateDataSourcesResponse</p>
 */
public class ValidateDataSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateDataSourcesResponseBody body;

    private ValidateDataSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateDataSourcesResponse create() {
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
    public ValidateDataSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateDataSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateDataSourcesResponseBody body);

        @Override
        ValidateDataSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateDataSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateDataSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateDataSourcesResponse response) {
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
        public Builder body(ValidateDataSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateDataSourcesResponse build() {
            return new ValidateDataSourcesResponse(this);
        } 

    } 

}
