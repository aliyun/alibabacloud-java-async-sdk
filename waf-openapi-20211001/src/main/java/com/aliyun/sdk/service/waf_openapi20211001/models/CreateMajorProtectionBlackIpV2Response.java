// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateMajorProtectionBlackIpV2Response} extends {@link TeaModel}
 *
 * <p>CreateMajorProtectionBlackIpV2Response</p>
 */
public class CreateMajorProtectionBlackIpV2Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateMajorProtectionBlackIpV2ResponseBody body;

    private CreateMajorProtectionBlackIpV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateMajorProtectionBlackIpV2Response create() {
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
    public CreateMajorProtectionBlackIpV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMajorProtectionBlackIpV2Response, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateMajorProtectionBlackIpV2ResponseBody body);

        @Override
        CreateMajorProtectionBlackIpV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMajorProtectionBlackIpV2Response, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateMajorProtectionBlackIpV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMajorProtectionBlackIpV2Response response) {
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
        public Builder body(CreateMajorProtectionBlackIpV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMajorProtectionBlackIpV2Response build() {
            return new CreateMajorProtectionBlackIpV2Response(this);
        } 

    } 

}
