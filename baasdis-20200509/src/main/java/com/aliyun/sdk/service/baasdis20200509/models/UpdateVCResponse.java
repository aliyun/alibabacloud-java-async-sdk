// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVCResponse} extends {@link TeaModel}
 *
 * <p>UpdateVCResponse</p>
 */
public class UpdateVCResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateVCResponseBody body;

    private UpdateVCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateVCResponse create() {
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
    public UpdateVCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateVCResponseBody body);

        @Override
        UpdateVCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateVCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVCResponse response) {
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
        public Builder body(UpdateVCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVCResponse build() {
            return new UpdateVCResponse(this);
        } 

    } 

}
