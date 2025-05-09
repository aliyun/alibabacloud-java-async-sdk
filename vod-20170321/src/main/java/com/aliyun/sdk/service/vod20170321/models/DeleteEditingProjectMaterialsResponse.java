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
 * {@link DeleteEditingProjectMaterialsResponse} extends {@link TeaModel}
 *
 * <p>DeleteEditingProjectMaterialsResponse</p>
 */
public class DeleteEditingProjectMaterialsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteEditingProjectMaterialsResponseBody body;

    private DeleteEditingProjectMaterialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteEditingProjectMaterialsResponse create() {
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
    public DeleteEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEditingProjectMaterialsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteEditingProjectMaterialsResponseBody body);

        @Override
        DeleteEditingProjectMaterialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEditingProjectMaterialsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteEditingProjectMaterialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEditingProjectMaterialsResponse response) {
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
        public Builder body(DeleteEditingProjectMaterialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEditingProjectMaterialsResponse build() {
            return new DeleteEditingProjectMaterialsResponse(this);
        } 

    } 

}
