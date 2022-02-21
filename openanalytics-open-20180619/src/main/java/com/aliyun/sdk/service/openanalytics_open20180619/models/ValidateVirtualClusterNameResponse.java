// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateVirtualClusterNameResponse} extends {@link TeaModel}
 *
 * <p>ValidateVirtualClusterNameResponse</p>
 */
public class ValidateVirtualClusterNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateVirtualClusterNameResponseBody body;

    private ValidateVirtualClusterNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateVirtualClusterNameResponse create() {
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
    public ValidateVirtualClusterNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateVirtualClusterNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateVirtualClusterNameResponseBody body);

        @Override
        ValidateVirtualClusterNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateVirtualClusterNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateVirtualClusterNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateVirtualClusterNameResponse response) {
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
        public Builder body(ValidateVirtualClusterNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateVirtualClusterNameResponse build() {
            return new ValidateVirtualClusterNameResponse(this);
        } 

    } 

}
