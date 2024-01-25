// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterEventSourceResponse} extends {@link TeaModel}
 *
 * <p>RegisterEventSourceResponse</p>
 */
public class RegisterEventSourceResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private RegisterEventSourceResponseBody body;

    private RegisterEventSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RegisterEventSourceResponse create() {
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
    public RegisterEventSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterEventSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RegisterEventSourceResponseBody body);

        @Override
        RegisterEventSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterEventSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RegisterEventSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterEventSourceResponse response) {
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
        public Builder body(RegisterEventSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterEventSourceResponse build() {
            return new RegisterEventSourceResponse(this);
        } 

    } 

}
