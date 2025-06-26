// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oms20160615.models;

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
 * {@link DeleteMeasureDataResponse} extends {@link TeaModel}
 *
 * <p>DeleteMeasureDataResponse</p>
 */
public class DeleteMeasureDataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteMeasureDataResponseBody body;

    private DeleteMeasureDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteMeasureDataResponse create() {
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
    public DeleteMeasureDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMeasureDataResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteMeasureDataResponseBody body);

        @Override
        DeleteMeasureDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMeasureDataResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteMeasureDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMeasureDataResponse response) {
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
        public Builder body(DeleteMeasureDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMeasureDataResponse build() {
            return new DeleteMeasureDataResponse(this);
        } 

    } 

}
