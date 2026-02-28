// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QuerySuperDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>QuerySuperDeviceGroupResponse</p>
 */
public class QuerySuperDeviceGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QuerySuperDeviceGroupResponseBody body;

    private QuerySuperDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QuerySuperDeviceGroupResponse create() {
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
    public QuerySuperDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySuperDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QuerySuperDeviceGroupResponseBody body);

        @Override
        QuerySuperDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySuperDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QuerySuperDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySuperDeviceGroupResponse response) {
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
        public Builder body(QuerySuperDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySuperDeviceGroupResponse build() {
            return new QuerySuperDeviceGroupResponse(this);
        } 

    } 

}
