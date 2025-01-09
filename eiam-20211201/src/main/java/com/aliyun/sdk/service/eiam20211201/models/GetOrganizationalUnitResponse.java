// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetOrganizationalUnitResponse} extends {@link TeaModel}
 *
 * <p>GetOrganizationalUnitResponse</p>
 */
public class GetOrganizationalUnitResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetOrganizationalUnitResponseBody body;

    private GetOrganizationalUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOrganizationalUnitResponse create() {
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
    public GetOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrganizationalUnitResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOrganizationalUnitResponseBody body);

        @Override
        GetOrganizationalUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrganizationalUnitResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetOrganizationalUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrganizationalUnitResponse response) {
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
        public Builder body(GetOrganizationalUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrganizationalUnitResponse build() {
            return new GetOrganizationalUnitResponse(this);
        } 

    } 

}
