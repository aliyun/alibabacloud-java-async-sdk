// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertCustomResponse} extends {@link TeaModel}
 *
 * <p>InsertCustomResponse</p>
 */
public class InsertCustomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InsertCustomResponseBody body;

    private InsertCustomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InsertCustomResponse create() {
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
    public InsertCustomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InsertCustomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InsertCustomResponseBody body);

        @Override
        InsertCustomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InsertCustomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InsertCustomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InsertCustomResponse response) {
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
        public Builder body(InsertCustomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InsertCustomResponse build() {
            return new InsertCustomResponse(this);
        } 

    } 

}
