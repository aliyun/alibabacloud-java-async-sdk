// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePortsForClickHouseResponse} extends {@link TeaModel}
 *
 * <p>CreatePortsForClickHouseResponse</p>
 */
public class CreatePortsForClickHouseResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePortsForClickHouseResponseBody body;

    private CreatePortsForClickHouseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreatePortsForClickHouseResponse create() {
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
    public CreatePortsForClickHouseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePortsForClickHouseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreatePortsForClickHouseResponseBody body);

        @Override
        CreatePortsForClickHouseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePortsForClickHouseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreatePortsForClickHouseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePortsForClickHouseResponse response) {
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
        public Builder body(CreatePortsForClickHouseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePortsForClickHouseResponse build() {
            return new CreatePortsForClickHouseResponse(this);
        } 

    } 

}
