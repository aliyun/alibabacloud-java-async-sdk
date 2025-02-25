// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInvocationResultsResponse} extends {@link TeaModel}
 *
 * <p>ListInvocationResultsResponse</p>
 */
public class ListInvocationResultsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListInvocationResultsResponseBody body;

    private ListInvocationResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListInvocationResultsResponse create() {
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
    public ListInvocationResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInvocationResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListInvocationResultsResponseBody body);

        @Override
        ListInvocationResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInvocationResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListInvocationResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInvocationResultsResponse response) {
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
        public Builder body(ListInvocationResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInvocationResultsResponse build() {
            return new ListInvocationResultsResponse(this);
        } 

    } 

}
