// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomAuthIdentityResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomAuthIdentityResponse</p>
 */
public class UpdateCustomAuthIdentityResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateCustomAuthIdentityResponseBody body;

    private UpdateCustomAuthIdentityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateCustomAuthIdentityResponse create() {
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
    public UpdateCustomAuthIdentityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomAuthIdentityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateCustomAuthIdentityResponseBody body);

        @Override
        UpdateCustomAuthIdentityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomAuthIdentityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateCustomAuthIdentityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomAuthIdentityResponse response) {
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
        public Builder body(UpdateCustomAuthIdentityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomAuthIdentityResponse build() {
            return new UpdateCustomAuthIdentityResponse(this);
        } 

    } 

}
