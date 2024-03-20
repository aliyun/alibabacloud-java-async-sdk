// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceCredentialClientIdResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceCredentialClientIdResponse</p>
 */
public class ListDeviceCredentialClientIdResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListDeviceCredentialClientIdResponseBody body;

    private ListDeviceCredentialClientIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDeviceCredentialClientIdResponse create() {
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
    public ListDeviceCredentialClientIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceCredentialClientIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDeviceCredentialClientIdResponseBody body);

        @Override
        ListDeviceCredentialClientIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceCredentialClientIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListDeviceCredentialClientIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceCredentialClientIdResponse response) {
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
        public Builder body(ListDeviceCredentialClientIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceCredentialClientIdResponse build() {
            return new ListDeviceCredentialClientIdResponse(this);
        } 

    } 

}
