// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageAccessorIpResponse} extends {@link TeaModel}
 *
 * <p>ManageAccessorIpResponse</p>
 */
public class ManageAccessorIpResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ManageAccessorIpResponseBody body;

    private ManageAccessorIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ManageAccessorIpResponse create() {
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
    public ManageAccessorIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ManageAccessorIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ManageAccessorIpResponseBody body);

        @Override
        ManageAccessorIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ManageAccessorIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ManageAccessorIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ManageAccessorIpResponse response) {
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
        public Builder body(ManageAccessorIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ManageAccessorIpResponse build() {
            return new ManageAccessorIpResponse(this);
        } 

    } 

}
