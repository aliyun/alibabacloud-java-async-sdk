// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFbIssueLabelsByLCResponse} extends {@link TeaModel}
 *
 * <p>ListFbIssueLabelsByLCResponse</p>
 */
public class ListFbIssueLabelsByLCResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListFbIssueLabelsByLCResponseBody body;

    private ListFbIssueLabelsByLCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListFbIssueLabelsByLCResponse create() {
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
    public ListFbIssueLabelsByLCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFbIssueLabelsByLCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListFbIssueLabelsByLCResponseBody body);

        @Override
        ListFbIssueLabelsByLCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFbIssueLabelsByLCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListFbIssueLabelsByLCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFbIssueLabelsByLCResponse response) {
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
        public Builder body(ListFbIssueLabelsByLCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFbIssueLabelsByLCResponse build() {
            return new ListFbIssueLabelsByLCResponse(this);
        } 

    } 

}
