// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckInstanceExistResponse} extends {@link TeaModel}
 *
 * <p>CheckInstanceExistResponse</p>
 */
public class CheckInstanceExistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckInstanceExistResponseBody body;

    private CheckInstanceExistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckInstanceExistResponse create() {
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
    public CheckInstanceExistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckInstanceExistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckInstanceExistResponseBody body);

        @Override
        CheckInstanceExistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckInstanceExistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckInstanceExistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckInstanceExistResponse response) {
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
        public Builder body(CheckInstanceExistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckInstanceExistResponse build() {
            return new CheckInstanceExistResponse(this);
        } 

    } 

}
