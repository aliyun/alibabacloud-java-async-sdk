// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressionVariableResponse} extends {@link TeaModel}
 *
 * <p>CreateExpressionVariableResponse</p>
 */
public class CreateExpressionVariableResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateExpressionVariableResponseBody body;

    private CreateExpressionVariableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateExpressionVariableResponse create() {
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
    public CreateExpressionVariableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateExpressionVariableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateExpressionVariableResponseBody body);

        @Override
        CreateExpressionVariableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateExpressionVariableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateExpressionVariableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateExpressionVariableResponse response) {
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
        public Builder body(CreateExpressionVariableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateExpressionVariableResponse build() {
            return new CreateExpressionVariableResponse(this);
        } 

    } 

}
