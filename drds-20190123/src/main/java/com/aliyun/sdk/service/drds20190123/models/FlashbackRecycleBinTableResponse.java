// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link FlashbackRecycleBinTableResponse} extends {@link TeaModel}
 *
 * <p>FlashbackRecycleBinTableResponse</p>
 */
public class FlashbackRecycleBinTableResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private FlashbackRecycleBinTableResponseBody body;

    private FlashbackRecycleBinTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static FlashbackRecycleBinTableResponse create() {
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
    public FlashbackRecycleBinTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlashbackRecycleBinTableResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(FlashbackRecycleBinTableResponseBody body);

        @Override
        FlashbackRecycleBinTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlashbackRecycleBinTableResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private FlashbackRecycleBinTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlashbackRecycleBinTableResponse response) {
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
        public Builder body(FlashbackRecycleBinTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlashbackRecycleBinTableResponse build() {
            return new FlashbackRecycleBinTableResponse(this);
        } 

    } 

}
