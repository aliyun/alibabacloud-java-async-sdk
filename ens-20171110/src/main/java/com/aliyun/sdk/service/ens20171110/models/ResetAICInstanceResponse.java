// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAICInstanceResponse} extends {@link TeaModel}
 *
 * <p>ResetAICInstanceResponse</p>
 */
public class ResetAICInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetAICInstanceResponseBody body;

    private ResetAICInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetAICInstanceResponse create() {
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
    public ResetAICInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetAICInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetAICInstanceResponseBody body);

        @Override
        ResetAICInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetAICInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetAICInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetAICInstanceResponse response) {
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
        public Builder body(ResetAICInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetAICInstanceResponse build() {
            return new ResetAICInstanceResponse(this);
        } 

    } 

}
