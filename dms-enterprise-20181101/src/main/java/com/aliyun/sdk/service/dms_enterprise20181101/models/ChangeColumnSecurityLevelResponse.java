// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ChangeColumnSecurityLevelResponse} extends {@link TeaModel}
 *
 * <p>ChangeColumnSecurityLevelResponse</p>
 */
public class ChangeColumnSecurityLevelResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChangeColumnSecurityLevelResponseBody body;

    private ChangeColumnSecurityLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChangeColumnSecurityLevelResponse create() {
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
    public ChangeColumnSecurityLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeColumnSecurityLevelResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChangeColumnSecurityLevelResponseBody body);

        @Override
        ChangeColumnSecurityLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeColumnSecurityLevelResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ChangeColumnSecurityLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeColumnSecurityLevelResponse response) {
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
        public Builder body(ChangeColumnSecurityLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeColumnSecurityLevelResponse build() {
            return new ChangeColumnSecurityLevelResponse(this);
        } 

    } 

}
