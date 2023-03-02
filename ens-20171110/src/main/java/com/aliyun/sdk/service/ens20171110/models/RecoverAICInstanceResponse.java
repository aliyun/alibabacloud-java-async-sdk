// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverAICInstanceResponse} extends {@link TeaModel}
 *
 * <p>RecoverAICInstanceResponse</p>
 */
public class RecoverAICInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecoverAICInstanceResponseBody body;

    private RecoverAICInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecoverAICInstanceResponse create() {
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
    public RecoverAICInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecoverAICInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecoverAICInstanceResponseBody body);

        @Override
        RecoverAICInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecoverAICInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecoverAICInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecoverAICInstanceResponse response) {
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
        public Builder body(RecoverAICInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecoverAICInstanceResponse build() {
            return new RecoverAICInstanceResponse(this);
        } 

    } 

}
