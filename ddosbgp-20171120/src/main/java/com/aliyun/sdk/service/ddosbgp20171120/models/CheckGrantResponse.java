// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckGrantResponse} extends {@link TeaModel}
 *
 * <p>CheckGrantResponse</p>
 */
public class CheckGrantResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckGrantResponseBody body;

    private CheckGrantResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckGrantResponse create() {
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
    public CheckGrantResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckGrantResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckGrantResponseBody body);

        @Override
        CheckGrantResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckGrantResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckGrantResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckGrantResponse response) {
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
        public Builder body(CheckGrantResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckGrantResponse build() {
            return new CheckGrantResponse(this);
        } 

    } 

}
