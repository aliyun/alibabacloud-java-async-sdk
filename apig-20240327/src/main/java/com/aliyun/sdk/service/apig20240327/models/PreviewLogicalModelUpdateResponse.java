// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link PreviewLogicalModelUpdateResponse} extends {@link TeaModel}
 *
 * <p>PreviewLogicalModelUpdateResponse</p>
 */
public class PreviewLogicalModelUpdateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PreviewLogicalModelUpdateResponseBody body;

    private PreviewLogicalModelUpdateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PreviewLogicalModelUpdateResponse create() {
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
    public PreviewLogicalModelUpdateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreviewLogicalModelUpdateResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(PreviewLogicalModelUpdateResponseBody body);

        @Override
        PreviewLogicalModelUpdateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreviewLogicalModelUpdateResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private PreviewLogicalModelUpdateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreviewLogicalModelUpdateResponse response) {
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
        public Builder body(PreviewLogicalModelUpdateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreviewLogicalModelUpdateResponse build() {
            return new PreviewLogicalModelUpdateResponse(this);
        } 

    } 

}
