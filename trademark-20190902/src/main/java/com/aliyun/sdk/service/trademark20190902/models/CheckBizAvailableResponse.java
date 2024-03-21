// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBizAvailableResponse} extends {@link TeaModel}
 *
 * <p>CheckBizAvailableResponse</p>
 */
public class CheckBizAvailableResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CheckBizAvailableResponseBody body;

    private CheckBizAvailableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CheckBizAvailableResponse create() {
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
    public CheckBizAvailableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckBizAvailableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckBizAvailableResponseBody body);

        @Override
        CheckBizAvailableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckBizAvailableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CheckBizAvailableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckBizAvailableResponse response) {
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
        public Builder body(CheckBizAvailableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckBizAvailableResponse build() {
            return new CheckBizAvailableResponse(this);
        } 

    } 

}
