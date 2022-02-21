// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUsedPropertyResponse} extends {@link TeaModel}
 *
 * <p>CheckUsedPropertyResponse</p>
 */
public class CheckUsedPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckUsedPropertyResponseBody body;

    private CheckUsedPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckUsedPropertyResponse create() {
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
    public CheckUsedPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckUsedPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckUsedPropertyResponseBody body);

        @Override
        CheckUsedPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckUsedPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckUsedPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckUsedPropertyResponse response) {
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
        public Builder body(CheckUsedPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckUsedPropertyResponse build() {
            return new CheckUsedPropertyResponse(this);
        } 

    } 

}
