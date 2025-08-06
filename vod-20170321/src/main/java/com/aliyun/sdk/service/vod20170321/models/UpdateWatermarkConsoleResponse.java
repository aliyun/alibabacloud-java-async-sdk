// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateWatermarkConsoleResponse} extends {@link TeaModel}
 *
 * <p>UpdateWatermarkConsoleResponse</p>
 */
public class UpdateWatermarkConsoleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateWatermarkConsoleResponseBody body;

    private UpdateWatermarkConsoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateWatermarkConsoleResponse create() {
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
    public UpdateWatermarkConsoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWatermarkConsoleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateWatermarkConsoleResponseBody body);

        @Override
        UpdateWatermarkConsoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWatermarkConsoleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateWatermarkConsoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWatermarkConsoleResponse response) {
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
        public Builder body(UpdateWatermarkConsoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWatermarkConsoleResponse build() {
            return new UpdateWatermarkConsoleResponse(this);
        } 

    } 

}
