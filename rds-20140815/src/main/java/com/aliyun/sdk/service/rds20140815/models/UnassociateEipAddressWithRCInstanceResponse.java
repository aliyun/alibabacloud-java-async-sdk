// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnassociateEipAddressWithRCInstanceResponse} extends {@link TeaModel}
 *
 * <p>UnassociateEipAddressWithRCInstanceResponse</p>
 */
public class UnassociateEipAddressWithRCInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UnassociateEipAddressWithRCInstanceResponseBody body;

    private UnassociateEipAddressWithRCInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UnassociateEipAddressWithRCInstanceResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public UnassociateEipAddressWithRCInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassociateEipAddressWithRCInstanceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UnassociateEipAddressWithRCInstanceResponseBody body);

        @Override
        UnassociateEipAddressWithRCInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassociateEipAddressWithRCInstanceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UnassociateEipAddressWithRCInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassociateEipAddressWithRCInstanceResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(UnassociateEipAddressWithRCInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassociateEipAddressWithRCInstanceResponse build() {
            return new UnassociateEipAddressWithRCInstanceResponse(this);
        } 

    } 

}
