// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConfigurationCloneResponse} extends {@link TeaModel}
 *
 * <p>CheckConfigurationCloneResponse</p>
 */
public class CheckConfigurationCloneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckConfigurationCloneResponseBody body;

    private CheckConfigurationCloneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckConfigurationCloneResponse create() {
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
    public CheckConfigurationCloneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckConfigurationCloneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckConfigurationCloneResponseBody body);

        @Override
        CheckConfigurationCloneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckConfigurationCloneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckConfigurationCloneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckConfigurationCloneResponse response) {
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
        public Builder body(CheckConfigurationCloneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckConfigurationCloneResponse build() {
            return new CheckConfigurationCloneResponse(this);
        } 

    } 

}
