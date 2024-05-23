// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchLSQLV3MySQLServiceResponse} extends {@link TeaModel}
 *
 * <p>SwitchLSQLV3MySQLServiceResponse</p>
 */
public class SwitchLSQLV3MySQLServiceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SwitchLSQLV3MySQLServiceResponseBody body;

    private SwitchLSQLV3MySQLServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SwitchLSQLV3MySQLServiceResponse create() {
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
    public SwitchLSQLV3MySQLServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchLSQLV3MySQLServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SwitchLSQLV3MySQLServiceResponseBody body);

        @Override
        SwitchLSQLV3MySQLServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchLSQLV3MySQLServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SwitchLSQLV3MySQLServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchLSQLV3MySQLServiceResponse response) {
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
        public Builder body(SwitchLSQLV3MySQLServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchLSQLV3MySQLServiceResponse build() {
            return new SwitchLSQLV3MySQLServiceResponse(this);
        } 

    } 

}
