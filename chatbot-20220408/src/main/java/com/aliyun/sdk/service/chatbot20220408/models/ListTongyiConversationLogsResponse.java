// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTongyiConversationLogsResponse} extends {@link TeaModel}
 *
 * <p>ListTongyiConversationLogsResponse</p>
 */
public class ListTongyiConversationLogsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListTongyiConversationLogsResponseBody body;

    private ListTongyiConversationLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTongyiConversationLogsResponse create() {
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
    public ListTongyiConversationLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTongyiConversationLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTongyiConversationLogsResponseBody body);

        @Override
        ListTongyiConversationLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTongyiConversationLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTongyiConversationLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTongyiConversationLogsResponse response) {
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
        public Builder body(ListTongyiConversationLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTongyiConversationLogsResponse build() {
            return new ListTongyiConversationLogsResponse(this);
        } 

    } 

}
