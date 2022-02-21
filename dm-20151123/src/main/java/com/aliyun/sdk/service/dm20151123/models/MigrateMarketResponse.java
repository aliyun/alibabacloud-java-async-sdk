// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateMarketResponse} extends {@link TeaModel}
 *
 * <p>MigrateMarketResponse</p>
 */
public class MigrateMarketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateMarketResponseBody body;

    private MigrateMarketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateMarketResponse create() {
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
    public MigrateMarketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateMarketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateMarketResponseBody body);

        @Override
        MigrateMarketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateMarketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateMarketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateMarketResponse response) {
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
        public Builder body(MigrateMarketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateMarketResponse build() {
            return new MigrateMarketResponse(this);
        } 

    } 

}
