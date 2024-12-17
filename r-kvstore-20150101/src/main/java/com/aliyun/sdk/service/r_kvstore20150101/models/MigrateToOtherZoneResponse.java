// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MigrateToOtherZoneResponse} extends {@link TeaModel}
 *
 * <p>MigrateToOtherZoneResponse</p>
 */
public class MigrateToOtherZoneResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private MigrateToOtherZoneResponseBody body;

    private MigrateToOtherZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public MigrateToOtherZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateToOtherZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(MigrateToOtherZoneResponseBody body);

        @Override
        MigrateToOtherZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateToOtherZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private MigrateToOtherZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateToOtherZoneResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
