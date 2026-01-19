// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link EnableResourceServerCustomSubjectResponse} extends {@link TeaModel}
 *
 * <p>EnableResourceServerCustomSubjectResponse</p>
 */
public class EnableResourceServerCustomSubjectResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private EnableResourceServerCustomSubjectResponseBody body;

    private EnableResourceServerCustomSubjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnableResourceServerCustomSubjectResponse create() {
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
    public EnableResourceServerCustomSubjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableResourceServerCustomSubjectResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnableResourceServerCustomSubjectResponseBody body);

        @Override
        EnableResourceServerCustomSubjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableResourceServerCustomSubjectResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private EnableResourceServerCustomSubjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableResourceServerCustomSubjectResponse response) {
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
        public Builder body(EnableResourceServerCustomSubjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableResourceServerCustomSubjectResponse build() {
            return new EnableResourceServerCustomSubjectResponse(this);
        } 

    } 

}
