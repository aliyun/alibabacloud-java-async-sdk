// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkSQLEngineStateResponse} extends {@link TeaModel}
 *
 * <p>GetSparkSQLEngineStateResponse</p>
 */
public class GetSparkSQLEngineStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkSQLEngineStateResponseBody body;

    private GetSparkSQLEngineStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSparkSQLEngineStateResponse create() {
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
    public GetSparkSQLEngineStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkSQLEngineStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSparkSQLEngineStateResponseBody body);

        @Override
        GetSparkSQLEngineStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkSQLEngineStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSparkSQLEngineStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkSQLEngineStateResponse response) {
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
        public Builder body(GetSparkSQLEngineStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkSQLEngineStateResponse build() {
            return new GetSparkSQLEngineStateResponse(this);
        } 

    } 

}
