// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManagePrivateRdsResponse} extends {@link TeaModel}
 *
 * <p>ManagePrivateRdsResponse</p>
 */
public class ManagePrivateRdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ManagePrivateRdsResponseBody body;

    private ManagePrivateRdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ManagePrivateRdsResponse create() {
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
    public ManagePrivateRdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ManagePrivateRdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ManagePrivateRdsResponseBody body);

        @Override
        ManagePrivateRdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ManagePrivateRdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ManagePrivateRdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ManagePrivateRdsResponse response) {
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
        public Builder body(ManagePrivateRdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ManagePrivateRdsResponse build() {
            return new ManagePrivateRdsResponse(this);
        } 

    } 

}
