// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDrdsDbNameResponse} extends {@link TeaModel}
 *
 * <p>CheckDrdsDbNameResponse</p>
 */
public class CheckDrdsDbNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDrdsDbNameResponseBody body;

    private CheckDrdsDbNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDrdsDbNameResponse create() {
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
    public CheckDrdsDbNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDrdsDbNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDrdsDbNameResponseBody body);

        @Override
        CheckDrdsDbNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDrdsDbNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDrdsDbNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDrdsDbNameResponse response) {
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
        public Builder body(CheckDrdsDbNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDrdsDbNameResponse build() {
            return new CheckDrdsDbNameResponse(this);
        } 

    } 

}
