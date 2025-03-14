// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetSensitiveDefineRuleConfigResponse} extends {@link TeaModel}
 *
 * <p>GetSensitiveDefineRuleConfigResponse</p>
 */
public class GetSensitiveDefineRuleConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetSensitiveDefineRuleConfigResponseBody body;

    private GetSensitiveDefineRuleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSensitiveDefineRuleConfigResponse create() {
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
    public GetSensitiveDefineRuleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSensitiveDefineRuleConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSensitiveDefineRuleConfigResponseBody body);

        @Override
        GetSensitiveDefineRuleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSensitiveDefineRuleConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetSensitiveDefineRuleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSensitiveDefineRuleConfigResponse response) {
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
        public Builder body(GetSensitiveDefineRuleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSensitiveDefineRuleConfigResponse build() {
            return new GetSensitiveDefineRuleConfigResponse(this);
        } 

    } 

}
