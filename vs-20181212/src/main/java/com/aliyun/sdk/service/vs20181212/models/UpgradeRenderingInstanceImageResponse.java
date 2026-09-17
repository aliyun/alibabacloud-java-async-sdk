// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UpgradeRenderingInstanceImageResponse} extends {@link TeaModel}
 *
 * <p>UpgradeRenderingInstanceImageResponse</p>
 */
public class UpgradeRenderingInstanceImageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpgradeRenderingInstanceImageResponseBody body;

    private UpgradeRenderingInstanceImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpgradeRenderingInstanceImageResponse create() {
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
    public UpgradeRenderingInstanceImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeRenderingInstanceImageResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpgradeRenderingInstanceImageResponseBody body);

        @Override
        UpgradeRenderingInstanceImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeRenderingInstanceImageResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpgradeRenderingInstanceImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeRenderingInstanceImageResponse response) {
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
        public Builder body(UpgradeRenderingInstanceImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeRenderingInstanceImageResponse build() {
            return new UpgradeRenderingInstanceImageResponse(this);
        } 

    } 

}
