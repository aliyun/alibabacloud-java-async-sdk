// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarFsPathMappingResponse} extends {@link TeaModel}
 *
 * <p>DeletePolarFsPathMappingResponse</p>
 */
public class DeletePolarFsPathMappingResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeletePolarFsPathMappingResponseBody body;

    private DeletePolarFsPathMappingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeletePolarFsPathMappingResponse create() {
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
    public DeletePolarFsPathMappingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePolarFsPathMappingResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeletePolarFsPathMappingResponseBody body);

        @Override
        DeletePolarFsPathMappingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePolarFsPathMappingResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeletePolarFsPathMappingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePolarFsPathMappingResponse response) {
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
        public Builder body(DeletePolarFsPathMappingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePolarFsPathMappingResponse build() {
            return new DeletePolarFsPathMappingResponse(this);
        } 

    } 

}
