// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link UserBatchQuitGroupResponse} extends {@link TeaModel}
 *
 * <p>UserBatchQuitGroupResponse</p>
 */
public class UserBatchQuitGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UserBatchQuitGroupResponseBody body;

    private UserBatchQuitGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UserBatchQuitGroupResponse create() {
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
    public UserBatchQuitGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UserBatchQuitGroupResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UserBatchQuitGroupResponseBody body);

        @Override
        UserBatchQuitGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UserBatchQuitGroupResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UserBatchQuitGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UserBatchQuitGroupResponse response) {
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
        public Builder body(UserBatchQuitGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UserBatchQuitGroupResponse build() {
            return new UserBatchQuitGroupResponse(this);
        } 

    } 

}
