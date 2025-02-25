// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDrdsDbNameResponse} extends {@link TeaModel}
 *
 * <p>CheckDrdsDbNameResponse</p>
 */
public class CheckDrdsDbNameResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CheckDrdsDbNameResponseBody body;

    private CheckDrdsDbNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CheckDrdsDbNameResponse create() {
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
    public CheckDrdsDbNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDrdsDbNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckDrdsDbNameResponseBody body);

        @Override
        CheckDrdsDbNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDrdsDbNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CheckDrdsDbNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDrdsDbNameResponse response) {
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
        public Builder body(CheckDrdsDbNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDrdsDbNameResponse build() {
            return new CheckDrdsDbNameResponse(this);
        } 

    } 

}
