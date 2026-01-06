// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ListMultimodalSearchTaskResultResponse} extends {@link TeaModel}
 *
 * <p>ListMultimodalSearchTaskResultResponse</p>
 */
public class ListMultimodalSearchTaskResultResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListMultimodalSearchTaskResultResponseBody body;

    private ListMultimodalSearchTaskResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListMultimodalSearchTaskResultResponse create() {
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
    public ListMultimodalSearchTaskResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMultimodalSearchTaskResultResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListMultimodalSearchTaskResultResponseBody body);

        @Override
        ListMultimodalSearchTaskResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMultimodalSearchTaskResultResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListMultimodalSearchTaskResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMultimodalSearchTaskResultResponse response) {
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
        public Builder body(ListMultimodalSearchTaskResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMultimodalSearchTaskResultResponse build() {
            return new ListMultimodalSearchTaskResultResponse(this);
        } 

    } 

}
