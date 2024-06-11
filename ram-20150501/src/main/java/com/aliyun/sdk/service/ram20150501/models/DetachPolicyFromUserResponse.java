// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachPolicyFromUserResponse} extends {@link TeaModel}
 *
 * <p>DetachPolicyFromUserResponse</p>
 */
public class DetachPolicyFromUserResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DetachPolicyFromUserResponseBody body;

    private DetachPolicyFromUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DetachPolicyFromUserResponse create() {
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
    public DetachPolicyFromUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachPolicyFromUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DetachPolicyFromUserResponseBody body);

        @Override
        DetachPolicyFromUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachPolicyFromUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DetachPolicyFromUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachPolicyFromUserResponse response) {
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
        public Builder body(DetachPolicyFromUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachPolicyFromUserResponse build() {
            return new DetachPolicyFromUserResponse(this);
        } 

    } 

}
