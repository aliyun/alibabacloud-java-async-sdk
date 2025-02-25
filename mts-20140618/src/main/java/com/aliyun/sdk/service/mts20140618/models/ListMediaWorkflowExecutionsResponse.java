// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMediaWorkflowExecutionsResponse} extends {@link TeaModel}
 *
 * <p>ListMediaWorkflowExecutionsResponse</p>
 */
public class ListMediaWorkflowExecutionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListMediaWorkflowExecutionsResponseBody body;

    private ListMediaWorkflowExecutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListMediaWorkflowExecutionsResponse create() {
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
    public ListMediaWorkflowExecutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMediaWorkflowExecutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListMediaWorkflowExecutionsResponseBody body);

        @Override
        ListMediaWorkflowExecutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMediaWorkflowExecutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListMediaWorkflowExecutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMediaWorkflowExecutionsResponse response) {
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
        public Builder body(ListMediaWorkflowExecutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMediaWorkflowExecutionsResponse build() {
            return new ListMediaWorkflowExecutionsResponse(this);
        } 

    } 

}
