// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetGlobalDatabaseNetworkResponse} extends {@link TeaModel}
 *
 * <p>ResetGlobalDatabaseNetworkResponse</p>
 */
public class ResetGlobalDatabaseNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ResetGlobalDatabaseNetworkResponseBody body;

    private ResetGlobalDatabaseNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ResetGlobalDatabaseNetworkResponse create() {
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
    public ResetGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetGlobalDatabaseNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ResetGlobalDatabaseNetworkResponseBody body);

        @Override
        ResetGlobalDatabaseNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetGlobalDatabaseNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ResetGlobalDatabaseNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetGlobalDatabaseNetworkResponse response) {
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
        public Builder body(ResetGlobalDatabaseNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetGlobalDatabaseNetworkResponse build() {
            return new ResetGlobalDatabaseNetworkResponse(this);
        } 

    } 

}
