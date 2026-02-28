// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link SetInstanceRecordConfigResponse} extends {@link TeaModel}
 *
 * <p>SetInstanceRecordConfigResponse</p>
 */
public class SetInstanceRecordConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SetInstanceRecordConfigResponseBody body;

    private SetInstanceRecordConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetInstanceRecordConfigResponse create() {
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
    public SetInstanceRecordConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstanceRecordConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetInstanceRecordConfigResponseBody body);

        @Override
        SetInstanceRecordConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstanceRecordConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SetInstanceRecordConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstanceRecordConfigResponse response) {
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
        public Builder body(SetInstanceRecordConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstanceRecordConfigResponse build() {
            return new SetInstanceRecordConfigResponse(this);
        } 

    } 

}
