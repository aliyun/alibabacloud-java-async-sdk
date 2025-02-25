// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskCustomerResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskCustomerResponse</p>
 */
public class UpdateTaskCustomerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateTaskCustomerResponseBody body;

    private UpdateTaskCustomerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateTaskCustomerResponse create() {
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
    public UpdateTaskCustomerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskCustomerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateTaskCustomerResponseBody body);

        @Override
        UpdateTaskCustomerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskCustomerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateTaskCustomerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskCustomerResponse response) {
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
        public Builder body(UpdateTaskCustomerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskCustomerResponse build() {
            return new UpdateTaskCustomerResponse(this);
        } 

    } 

}
