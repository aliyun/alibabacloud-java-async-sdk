// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurgeInstanceResponse} extends {@link TeaModel}
 *
 * <p>PurgeInstanceResponse</p>
 */
public class PurgeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PurgeInstanceResponseBody body;

    private PurgeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PurgeInstanceResponse create() {
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
    public PurgeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PurgeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PurgeInstanceResponseBody body);

        @Override
        PurgeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PurgeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PurgeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PurgeInstanceResponse response) {
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
        public Builder body(PurgeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PurgeInstanceResponse build() {
            return new PurgeInstanceResponse(this);
        } 

    } 

}
