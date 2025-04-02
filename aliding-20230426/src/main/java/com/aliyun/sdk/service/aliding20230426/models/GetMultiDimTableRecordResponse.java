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
 * {@link GetMultiDimTableRecordResponse} extends {@link TeaModel}
 *
 * <p>GetMultiDimTableRecordResponse</p>
 */
public class GetMultiDimTableRecordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetMultiDimTableRecordResponseBody body;

    private GetMultiDimTableRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetMultiDimTableRecordResponse create() {
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
    public GetMultiDimTableRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMultiDimTableRecordResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetMultiDimTableRecordResponseBody body);

        @Override
        GetMultiDimTableRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMultiDimTableRecordResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetMultiDimTableRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMultiDimTableRecordResponse response) {
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
        public Builder body(GetMultiDimTableRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMultiDimTableRecordResponse build() {
            return new GetMultiDimTableRecordResponse(this);
        } 

    } 

}
