// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListResourceInstanceWorkerResponse} extends {@link TeaModel}
 *
 * <p>ListResourceInstanceWorkerResponse</p>
 */
public class ListResourceInstanceWorkerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListResourceInstanceWorkerResponseBody body;

    private ListResourceInstanceWorkerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListResourceInstanceWorkerResponse create() {
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
    public ListResourceInstanceWorkerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceInstanceWorkerResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListResourceInstanceWorkerResponseBody body);

        @Override
        ListResourceInstanceWorkerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceInstanceWorkerResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListResourceInstanceWorkerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceInstanceWorkerResponse response) {
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
        public Builder body(ListResourceInstanceWorkerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceInstanceWorkerResponse build() {
            return new ListResourceInstanceWorkerResponse(this);
        } 

    } 

}
