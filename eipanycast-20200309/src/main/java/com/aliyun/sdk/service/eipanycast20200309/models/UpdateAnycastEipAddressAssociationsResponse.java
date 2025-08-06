// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link UpdateAnycastEipAddressAssociationsResponse} extends {@link TeaModel}
 *
 * <p>UpdateAnycastEipAddressAssociationsResponse</p>
 */
public class UpdateAnycastEipAddressAssociationsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateAnycastEipAddressAssociationsResponseBody body;

    private UpdateAnycastEipAddressAssociationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateAnycastEipAddressAssociationsResponse create() {
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
    public UpdateAnycastEipAddressAssociationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAnycastEipAddressAssociationsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateAnycastEipAddressAssociationsResponseBody body);

        @Override
        UpdateAnycastEipAddressAssociationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAnycastEipAddressAssociationsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateAnycastEipAddressAssociationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAnycastEipAddressAssociationsResponse response) {
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
        public Builder body(UpdateAnycastEipAddressAssociationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAnycastEipAddressAssociationsResponse build() {
            return new UpdateAnycastEipAddressAssociationsResponse(this);
        } 

    } 

}
