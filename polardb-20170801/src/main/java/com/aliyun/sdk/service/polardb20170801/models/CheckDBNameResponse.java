// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDBNameResponse} extends {@link TeaModel}
 *
 * <p>CheckDBNameResponse</p>
 */
public class CheckDBNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDBNameResponseBody body;

    private CheckDBNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDBNameResponse create() {
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
    public CheckDBNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDBNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDBNameResponseBody body);

        @Override
        CheckDBNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDBNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDBNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDBNameResponse response) {
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
        public Builder body(CheckDBNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDBNameResponse build() {
            return new CheckDBNameResponse(this);
        } 

    } 

}
