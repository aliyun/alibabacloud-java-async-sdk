// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartHiTSDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestartHiTSDBInstanceResponse</p>
 */
public class RestartHiTSDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartHiTSDBInstanceResponseBody body;

    private RestartHiTSDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartHiTSDBInstanceResponse create() {
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
    public RestartHiTSDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartHiTSDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartHiTSDBInstanceResponseBody body);

        @Override
        RestartHiTSDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartHiTSDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartHiTSDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartHiTSDBInstanceResponse response) {
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
        public Builder body(RestartHiTSDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartHiTSDBInstanceResponse build() {
            return new RestartHiTSDBInstanceResponse(this);
        } 

    } 

}
