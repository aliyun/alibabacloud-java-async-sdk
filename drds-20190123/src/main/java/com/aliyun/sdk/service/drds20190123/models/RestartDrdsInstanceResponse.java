// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDrdsInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestartDrdsInstanceResponse</p>
 */
public class RestartDrdsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartDrdsInstanceResponseBody body;

    private RestartDrdsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartDrdsInstanceResponse create() {
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
    public RestartDrdsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartDrdsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartDrdsInstanceResponseBody body);

        @Override
        RestartDrdsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartDrdsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartDrdsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartDrdsInstanceResponse response) {
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
        public Builder body(RestartDrdsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartDrdsInstanceResponse build() {
            return new RestartDrdsInstanceResponse(this);
        } 

    } 

}
