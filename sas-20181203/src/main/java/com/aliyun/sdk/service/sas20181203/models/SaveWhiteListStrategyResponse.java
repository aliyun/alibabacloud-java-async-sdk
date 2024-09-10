// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWhiteListStrategyResponse} extends {@link TeaModel}
 *
 * <p>SaveWhiteListStrategyResponse</p>
 */
public class SaveWhiteListStrategyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveWhiteListStrategyResponseBody body;

    private SaveWhiteListStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveWhiteListStrategyResponse create() {
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
    public SaveWhiteListStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveWhiteListStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveWhiteListStrategyResponseBody body);

        @Override
        SaveWhiteListStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveWhiteListStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveWhiteListStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveWhiteListStrategyResponse response) {
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
        public Builder body(SaveWhiteListStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveWhiteListStrategyResponse build() {
            return new SaveWhiteListStrategyResponse(this);
        } 

    } 

}
