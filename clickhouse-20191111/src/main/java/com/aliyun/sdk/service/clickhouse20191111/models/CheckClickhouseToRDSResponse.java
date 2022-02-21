// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckClickhouseToRDSResponse} extends {@link TeaModel}
 *
 * <p>CheckClickhouseToRDSResponse</p>
 */
public class CheckClickhouseToRDSResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckClickhouseToRDSResponseBody body;

    private CheckClickhouseToRDSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckClickhouseToRDSResponse create() {
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
    public CheckClickhouseToRDSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckClickhouseToRDSResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckClickhouseToRDSResponseBody body);

        @Override
        CheckClickhouseToRDSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckClickhouseToRDSResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckClickhouseToRDSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckClickhouseToRDSResponse response) {
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
        public Builder body(CheckClickhouseToRDSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckClickhouseToRDSResponse build() {
            return new CheckClickhouseToRDSResponse(this);
        } 

    } 

}
