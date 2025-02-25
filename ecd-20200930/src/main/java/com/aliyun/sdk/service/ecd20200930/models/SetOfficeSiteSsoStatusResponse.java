// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link SetOfficeSiteSsoStatusResponse} extends {@link TeaModel}
 *
 * <p>SetOfficeSiteSsoStatusResponse</p>
 */
public class SetOfficeSiteSsoStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SetOfficeSiteSsoStatusResponseBody body;

    private SetOfficeSiteSsoStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetOfficeSiteSsoStatusResponse create() {
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
    public SetOfficeSiteSsoStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetOfficeSiteSsoStatusResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetOfficeSiteSsoStatusResponseBody body);

        @Override
        SetOfficeSiteSsoStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetOfficeSiteSsoStatusResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SetOfficeSiteSsoStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetOfficeSiteSsoStatusResponse response) {
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
        public Builder body(SetOfficeSiteSsoStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetOfficeSiteSsoStatusResponse build() {
            return new SetOfficeSiteSsoStatusResponse(this);
        } 

    } 

}
