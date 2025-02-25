// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreatePrivateDNSResponse} extends {@link TeaModel}
 *
 * <p>CreatePrivateDNSResponse</p>
 */
public class CreatePrivateDNSResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePrivateDNSResponseBody body;

    private CreatePrivateDNSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreatePrivateDNSResponse create() {
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
    public CreatePrivateDNSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrivateDNSResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreatePrivateDNSResponseBody body);

        @Override
        CreatePrivateDNSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrivateDNSResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreatePrivateDNSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrivateDNSResponse response) {
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
        public Builder body(CreatePrivateDNSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrivateDNSResponse build() {
            return new CreatePrivateDNSResponse(this);
        } 

    } 

}
