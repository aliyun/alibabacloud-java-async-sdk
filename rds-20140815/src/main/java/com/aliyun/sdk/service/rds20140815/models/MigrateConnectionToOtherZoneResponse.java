// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateConnectionToOtherZoneResponse} extends {@link TeaModel}
 *
 * <p>MigrateConnectionToOtherZoneResponse</p>
 */
public class MigrateConnectionToOtherZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateConnectionToOtherZoneResponseBody body;

    private MigrateConnectionToOtherZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateConnectionToOtherZoneResponse create() {
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
    public MigrateConnectionToOtherZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateConnectionToOtherZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateConnectionToOtherZoneResponseBody body);

        @Override
        MigrateConnectionToOtherZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateConnectionToOtherZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateConnectionToOtherZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateConnectionToOtherZoneResponse response) {
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
        public Builder body(MigrateConnectionToOtherZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateConnectionToOtherZoneResponse build() {
            return new MigrateConnectionToOtherZoneResponse(this);
        } 

    } 

}
