// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddSchemaPropertyResponse} extends {@link TeaModel}
 *
 * <p>AddSchemaPropertyResponse</p>
 */
public class AddSchemaPropertyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddSchemaPropertyResponseBody body;

    private AddSchemaPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddSchemaPropertyResponse create() {
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
    public AddSchemaPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSchemaPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddSchemaPropertyResponseBody body);

        @Override
        AddSchemaPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSchemaPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddSchemaPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSchemaPropertyResponse response) {
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
        public Builder body(AddSchemaPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSchemaPropertyResponse build() {
            return new AddSchemaPropertyResponse(this);
        } 

    } 

}
