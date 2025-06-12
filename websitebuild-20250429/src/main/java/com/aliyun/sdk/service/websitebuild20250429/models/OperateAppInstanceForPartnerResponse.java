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
 * {@link OperateAppInstanceForPartnerResponse} extends {@link TeaModel}
 *
 * <p>OperateAppInstanceForPartnerResponse</p>
 */
public class OperateAppInstanceForPartnerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OperateAppInstanceForPartnerResponseBody body;

    private OperateAppInstanceForPartnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OperateAppInstanceForPartnerResponse create() {
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
    public OperateAppInstanceForPartnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateAppInstanceForPartnerResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OperateAppInstanceForPartnerResponseBody body);

        @Override
        OperateAppInstanceForPartnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateAppInstanceForPartnerResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OperateAppInstanceForPartnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateAppInstanceForPartnerResponse response) {
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
        public Builder body(OperateAppInstanceForPartnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateAppInstanceForPartnerResponse build() {
            return new OperateAppInstanceForPartnerResponse(this);
        } 

    } 

}
