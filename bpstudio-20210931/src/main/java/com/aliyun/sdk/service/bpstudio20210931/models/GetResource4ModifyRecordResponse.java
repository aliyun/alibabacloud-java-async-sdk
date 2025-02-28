// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link GetResource4ModifyRecordResponse} extends {@link TeaModel}
 *
 * <p>GetResource4ModifyRecordResponse</p>
 */
public class GetResource4ModifyRecordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetResource4ModifyRecordResponseBody body;

    private GetResource4ModifyRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetResource4ModifyRecordResponse create() {
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
    public GetResource4ModifyRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResource4ModifyRecordResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetResource4ModifyRecordResponseBody body);

        @Override
        GetResource4ModifyRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResource4ModifyRecordResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetResource4ModifyRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResource4ModifyRecordResponse response) {
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
        public Builder body(GetResource4ModifyRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResource4ModifyRecordResponse build() {
            return new GetResource4ModifyRecordResponse(this);
        } 

    } 

}
