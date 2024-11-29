// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPfsSqlSampleResponse} extends {@link TeaModel}
 *
 * <p>GetPfsSqlSampleResponse</p>
 */
public class GetPfsSqlSampleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetPfsSqlSampleResponseBody body;

    private GetPfsSqlSampleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetPfsSqlSampleResponse create() {
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
    public GetPfsSqlSampleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPfsSqlSampleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetPfsSqlSampleResponseBody body);

        @Override
        GetPfsSqlSampleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPfsSqlSampleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetPfsSqlSampleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPfsSqlSampleResponse response) {
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
        public Builder body(GetPfsSqlSampleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPfsSqlSampleResponse build() {
            return new GetPfsSqlSampleResponse(this);
        } 

    } 

}
