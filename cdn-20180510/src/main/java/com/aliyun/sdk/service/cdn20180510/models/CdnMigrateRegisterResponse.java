// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CdnMigrateRegisterResponse} extends {@link TeaModel}
 *
 * <p>CdnMigrateRegisterResponse</p>
 */
public class CdnMigrateRegisterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private CdnMigrateRegisterResponseBody body;

    private CdnMigrateRegisterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CdnMigrateRegisterResponse create() {
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
    public CdnMigrateRegisterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CdnMigrateRegisterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CdnMigrateRegisterResponseBody body);

        @Override
        CdnMigrateRegisterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CdnMigrateRegisterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CdnMigrateRegisterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CdnMigrateRegisterResponse response) {
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
        public Builder body(CdnMigrateRegisterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CdnMigrateRegisterResponse build() {
            return new CdnMigrateRegisterResponse(this);
        } 

    } 

}
