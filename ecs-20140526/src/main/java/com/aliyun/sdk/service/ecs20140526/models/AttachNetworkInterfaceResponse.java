// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachNetworkInterfaceResponse} extends {@link TeaModel}
 *
 * <p>AttachNetworkInterfaceResponse</p>
 */
public class AttachNetworkInterfaceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AttachNetworkInterfaceResponseBody body;

    private AttachNetworkInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AttachNetworkInterfaceResponse create() {
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
    public AttachNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachNetworkInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AttachNetworkInterfaceResponseBody body);

        @Override
        AttachNetworkInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachNetworkInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AttachNetworkInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachNetworkInterfaceResponse response) {
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
        public Builder body(AttachNetworkInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachNetworkInterfaceResponse build() {
            return new AttachNetworkInterfaceResponse(this);
        } 

    } 

}
