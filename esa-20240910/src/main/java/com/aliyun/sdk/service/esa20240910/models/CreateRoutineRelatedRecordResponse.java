// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineRelatedRecordResponse} extends {@link TeaModel}
 *
 * <p>CreateRoutineRelatedRecordResponse</p>
 */
public class CreateRoutineRelatedRecordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateRoutineRelatedRecordResponseBody body;

    private CreateRoutineRelatedRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateRoutineRelatedRecordResponse create() {
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
    public CreateRoutineRelatedRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRoutineRelatedRecordResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateRoutineRelatedRecordResponseBody body);

        @Override
        CreateRoutineRelatedRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRoutineRelatedRecordResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateRoutineRelatedRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRoutineRelatedRecordResponse response) {
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
        public Builder body(CreateRoutineRelatedRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRoutineRelatedRecordResponse build() {
            return new CreateRoutineRelatedRecordResponse(this);
        } 

    } 

}
