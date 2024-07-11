// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RelateDbForHBaseHaResponse} extends {@link TeaModel}
 *
 * <p>RelateDbForHBaseHaResponse</p>
 */
public class RelateDbForHBaseHaResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RelateDbForHBaseHaResponseBody body;

    private RelateDbForHBaseHaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RelateDbForHBaseHaResponse create() {
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
    public RelateDbForHBaseHaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RelateDbForHBaseHaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RelateDbForHBaseHaResponseBody body);

        @Override
        RelateDbForHBaseHaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RelateDbForHBaseHaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RelateDbForHBaseHaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RelateDbForHBaseHaResponse response) {
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
        public Builder body(RelateDbForHBaseHaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RelateDbForHBaseHaResponse build() {
            return new RelateDbForHBaseHaResponse(this);
        } 

    } 

}
