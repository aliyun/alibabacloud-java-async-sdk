// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommonTicketFieldsResponse} extends {@link TeaModel}
 *
 * <p>ListCommonTicketFieldsResponse</p>
 */
public class ListCommonTicketFieldsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListCommonTicketFieldsResponseBody body;

    private ListCommonTicketFieldsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListCommonTicketFieldsResponse create() {
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
    public ListCommonTicketFieldsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCommonTicketFieldsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListCommonTicketFieldsResponseBody body);

        @Override
        ListCommonTicketFieldsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCommonTicketFieldsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListCommonTicketFieldsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCommonTicketFieldsResponse response) {
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
        public Builder body(ListCommonTicketFieldsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCommonTicketFieldsResponse build() {
            return new ListCommonTicketFieldsResponse(this);
        } 

    } 

}
