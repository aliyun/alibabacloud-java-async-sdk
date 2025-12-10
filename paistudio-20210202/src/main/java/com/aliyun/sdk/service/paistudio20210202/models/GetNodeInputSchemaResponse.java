// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetNodeInputSchemaResponse} extends {@link TeaModel}
 *
 * <p>GetNodeInputSchemaResponse</p>
 */
public class GetNodeInputSchemaResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetNodeInputSchemaResponseBody body;

    private GetNodeInputSchemaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetNodeInputSchemaResponse create() {
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
    public GetNodeInputSchemaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodeInputSchemaResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetNodeInputSchemaResponseBody body);

        @Override
        GetNodeInputSchemaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodeInputSchemaResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetNodeInputSchemaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodeInputSchemaResponse response) {
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
        public Builder body(GetNodeInputSchemaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodeInputSchemaResponse build() {
            return new GetNodeInputSchemaResponse(this);
        } 

    } 

}
