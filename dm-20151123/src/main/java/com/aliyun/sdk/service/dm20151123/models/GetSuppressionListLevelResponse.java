// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSuppressionListLevelResponse} extends {@link TeaModel}
 *
 * <p>GetSuppressionListLevelResponse</p>
 */
public class GetSuppressionListLevelResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetSuppressionListLevelResponseBody body;

    private GetSuppressionListLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSuppressionListLevelResponse create() {
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
    public GetSuppressionListLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSuppressionListLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSuppressionListLevelResponseBody body);

        @Override
        GetSuppressionListLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSuppressionListLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSuppressionListLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSuppressionListLevelResponse response) {
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
        public Builder body(GetSuppressionListLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSuppressionListLevelResponse build() {
            return new GetSuppressionListLevelResponse(this);
        } 

    } 

}
