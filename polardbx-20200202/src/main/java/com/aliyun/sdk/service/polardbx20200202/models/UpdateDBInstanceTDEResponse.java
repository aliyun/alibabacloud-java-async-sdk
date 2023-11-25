// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDBInstanceTDEResponse} extends {@link TeaModel}
 *
 * <p>UpdateDBInstanceTDEResponse</p>
 */
public class UpdateDBInstanceTDEResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDBInstanceTDEResponseBody body;

    private UpdateDBInstanceTDEResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateDBInstanceTDEResponse create() {
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
    public UpdateDBInstanceTDEResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDBInstanceTDEResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateDBInstanceTDEResponseBody body);

        @Override
        UpdateDBInstanceTDEResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDBInstanceTDEResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateDBInstanceTDEResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDBInstanceTDEResponse response) {
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
        public Builder body(UpdateDBInstanceTDEResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDBInstanceTDEResponse build() {
            return new UpdateDBInstanceTDEResponse(this);
        } 

    } 

}
