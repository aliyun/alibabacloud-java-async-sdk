// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestartDBInstanceResponse</p>
 */
public class RestartDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartDBInstanceResponseBody body;

    private RestartDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartDBInstanceResponse create() {
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
    public RestartDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartDBInstanceResponseBody body);

        @Override
        RestartDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartDBInstanceResponse response) {
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
        public Builder body(RestartDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartDBInstanceResponse build() {
            return new RestartDBInstanceResponse(this);
        } 

    } 

}
