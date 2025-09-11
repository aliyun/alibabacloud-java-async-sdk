// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link AttachVscToFilesystemsResponse} extends {@link TeaModel}
 *
 * <p>AttachVscToFilesystemsResponse</p>
 */
public class AttachVscToFilesystemsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AttachVscToFilesystemsResponseBody body;

    private AttachVscToFilesystemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AttachVscToFilesystemsResponse create() {
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
    public AttachVscToFilesystemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachVscToFilesystemsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AttachVscToFilesystemsResponseBody body);

        @Override
        AttachVscToFilesystemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachVscToFilesystemsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AttachVscToFilesystemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachVscToFilesystemsResponse response) {
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
        public Builder body(AttachVscToFilesystemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachVscToFilesystemsResponse build() {
            return new AttachVscToFilesystemsResponse(this);
        } 

    } 

}
