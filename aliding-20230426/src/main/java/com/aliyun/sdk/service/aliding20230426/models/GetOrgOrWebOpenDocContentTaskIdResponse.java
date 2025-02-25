// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetOrgOrWebOpenDocContentTaskIdResponse} extends {@link TeaModel}
 *
 * <p>GetOrgOrWebOpenDocContentTaskIdResponse</p>
 */
public class GetOrgOrWebOpenDocContentTaskIdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetOrgOrWebOpenDocContentTaskIdResponseBody body;

    private GetOrgOrWebOpenDocContentTaskIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOrgOrWebOpenDocContentTaskIdResponse create() {
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
    public GetOrgOrWebOpenDocContentTaskIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrgOrWebOpenDocContentTaskIdResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOrgOrWebOpenDocContentTaskIdResponseBody body);

        @Override
        GetOrgOrWebOpenDocContentTaskIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrgOrWebOpenDocContentTaskIdResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetOrgOrWebOpenDocContentTaskIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrgOrWebOpenDocContentTaskIdResponse response) {
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
        public Builder body(GetOrgOrWebOpenDocContentTaskIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrgOrWebOpenDocContentTaskIdResponse build() {
            return new GetOrgOrWebOpenDocContentTaskIdResponse(this);
        } 

    } 

}
