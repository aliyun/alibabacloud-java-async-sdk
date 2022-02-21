// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckScaleOutBalancedResponse} extends {@link TeaModel}
 *
 * <p>CheckScaleOutBalancedResponse</p>
 */
public class CheckScaleOutBalancedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckScaleOutBalancedResponseBody body;

    private CheckScaleOutBalancedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckScaleOutBalancedResponse create() {
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
    public CheckScaleOutBalancedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckScaleOutBalancedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckScaleOutBalancedResponseBody body);

        @Override
        CheckScaleOutBalancedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckScaleOutBalancedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckScaleOutBalancedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckScaleOutBalancedResponse response) {
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
        public Builder body(CheckScaleOutBalancedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckScaleOutBalancedResponse build() {
            return new CheckScaleOutBalancedResponse(this);
        } 

    } 

}
