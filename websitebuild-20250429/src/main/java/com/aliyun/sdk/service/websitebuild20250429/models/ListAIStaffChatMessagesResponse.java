// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAIStaffChatMessagesResponse} extends {@link TeaModel}
 *
 * <p>ListAIStaffChatMessagesResponse</p>
 */
public class ListAIStaffChatMessagesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAIStaffChatMessagesResponseBody body;

    private ListAIStaffChatMessagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAIStaffChatMessagesResponse create() {
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
    public ListAIStaffChatMessagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAIStaffChatMessagesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAIStaffChatMessagesResponseBody body);

        @Override
        ListAIStaffChatMessagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAIStaffChatMessagesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListAIStaffChatMessagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAIStaffChatMessagesResponse response) {
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
        public Builder body(ListAIStaffChatMessagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAIStaffChatMessagesResponse build() {
            return new ListAIStaffChatMessagesResponse(this);
        } 

    } 

}
