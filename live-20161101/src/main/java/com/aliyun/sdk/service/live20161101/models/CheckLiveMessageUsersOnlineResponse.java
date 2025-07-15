// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CheckLiveMessageUsersOnlineResponse} extends {@link TeaModel}
 *
 * <p>CheckLiveMessageUsersOnlineResponse</p>
 */
public class CheckLiveMessageUsersOnlineResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CheckLiveMessageUsersOnlineResponseBody body;

    private CheckLiveMessageUsersOnlineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CheckLiveMessageUsersOnlineResponse create() {
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
    public CheckLiveMessageUsersOnlineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckLiveMessageUsersOnlineResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckLiveMessageUsersOnlineResponseBody body);

        @Override
        CheckLiveMessageUsersOnlineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckLiveMessageUsersOnlineResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CheckLiveMessageUsersOnlineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckLiveMessageUsersOnlineResponse response) {
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
        public Builder body(CheckLiveMessageUsersOnlineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckLiveMessageUsersOnlineResponse build() {
            return new CheckLiveMessageUsersOnlineResponse(this);
        } 

    } 

}
