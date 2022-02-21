// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertDevopsUserResponse} extends {@link TeaModel}
 *
 * <p>InsertDevopsUserResponse</p>
 */
public class InsertDevopsUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InsertDevopsUserResponseBody body;

    private InsertDevopsUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InsertDevopsUserResponse create() {
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
    public InsertDevopsUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InsertDevopsUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InsertDevopsUserResponseBody body);

        @Override
        InsertDevopsUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InsertDevopsUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InsertDevopsUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InsertDevopsUserResponse response) {
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
        public Builder body(InsertDevopsUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InsertDevopsUserResponse build() {
            return new InsertDevopsUserResponse(this);
        } 

    } 

}
