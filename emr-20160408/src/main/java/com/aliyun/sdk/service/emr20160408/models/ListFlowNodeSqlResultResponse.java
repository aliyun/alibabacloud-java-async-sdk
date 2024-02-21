// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowNodeSqlResultResponse} extends {@link TeaModel}
 *
 * <p>ListFlowNodeSqlResultResponse</p>
 */
public class ListFlowNodeSqlResultResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListFlowNodeSqlResultResponseBody body;

    private ListFlowNodeSqlResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListFlowNodeSqlResultResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public ListFlowNodeSqlResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowNodeSqlResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListFlowNodeSqlResultResponseBody body);

        @Override
        ListFlowNodeSqlResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowNodeSqlResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListFlowNodeSqlResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowNodeSqlResultResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(ListFlowNodeSqlResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowNodeSqlResultResponse build() {
            return new ListFlowNodeSqlResultResponse(this);
        } 

    } 

}
