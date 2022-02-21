// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateAvailableZoneResponse} extends {@link TeaModel}
 *
 * <p>MigrateAvailableZoneResponse</p>
 */
public class MigrateAvailableZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateAvailableZoneResponseBody body;

    private MigrateAvailableZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateAvailableZoneResponse create() {
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
    public MigrateAvailableZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateAvailableZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateAvailableZoneResponseBody body);

        @Override
        MigrateAvailableZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateAvailableZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateAvailableZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateAvailableZoneResponse response) {
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
        public Builder body(MigrateAvailableZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateAvailableZoneResponse build() {
            return new MigrateAvailableZoneResponse(this);
        } 

    } 

}
