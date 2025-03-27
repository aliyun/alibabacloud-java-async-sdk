// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetEdgeContainerLogsResponse} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerLogsResponse</p>
 */
public class GetEdgeContainerLogsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetEdgeContainerLogsResponseBody body;

    private GetEdgeContainerLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetEdgeContainerLogsResponse create() {
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
    public GetEdgeContainerLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEdgeContainerLogsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetEdgeContainerLogsResponseBody body);

        @Override
        GetEdgeContainerLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEdgeContainerLogsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetEdgeContainerLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEdgeContainerLogsResponse response) {
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
        public Builder body(GetEdgeContainerLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEdgeContainerLogsResponse build() {
            return new GetEdgeContainerLogsResponse(this);
        } 

    } 

}
