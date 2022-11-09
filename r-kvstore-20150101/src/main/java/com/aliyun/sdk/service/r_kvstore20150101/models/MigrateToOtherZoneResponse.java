// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateToOtherZoneResponse} extends {@link TeaModel}
 *
 * <p>MigrateToOtherZoneResponse</p>
 */
public class MigrateToOtherZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateToOtherZoneResponseBody body;

    private MigrateToOtherZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateToOtherZoneResponse create() {
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
    public MigrateToOtherZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateToOtherZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateToOtherZoneResponseBody body);

        @Override
        MigrateToOtherZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateToOtherZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateToOtherZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateToOtherZoneResponse response) {
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
        public Builder body(MigrateToOtherZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateToOtherZoneResponse build() {
            return new MigrateToOtherZoneResponse(this);
        } 

    } 

}
