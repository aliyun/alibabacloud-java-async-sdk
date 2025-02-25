// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReadDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateReadDBInstanceResponse</p>
 */
public class CreateReadDBInstanceResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateReadDBInstanceResponseBody body;

    private CreateReadDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateReadDBInstanceResponse create() {
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
    public CreateReadDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateReadDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateReadDBInstanceResponseBody body);

        @Override
        CreateReadDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateReadDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateReadDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateReadDBInstanceResponse response) {
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
        public Builder body(CreateReadDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateReadDBInstanceResponse build() {
            return new CreateReadDBInstanceResponse(this);
        } 

    } 

}
