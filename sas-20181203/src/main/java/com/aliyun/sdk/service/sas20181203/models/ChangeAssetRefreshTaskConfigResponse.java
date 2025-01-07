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
 * {@link ChangeAssetRefreshTaskConfigResponse} extends {@link TeaModel}
 *
 * <p>ChangeAssetRefreshTaskConfigResponse</p>
 */
public class ChangeAssetRefreshTaskConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChangeAssetRefreshTaskConfigResponseBody body;

    private ChangeAssetRefreshTaskConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChangeAssetRefreshTaskConfigResponse create() {
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
    public ChangeAssetRefreshTaskConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeAssetRefreshTaskConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChangeAssetRefreshTaskConfigResponseBody body);

        @Override
        ChangeAssetRefreshTaskConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeAssetRefreshTaskConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ChangeAssetRefreshTaskConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeAssetRefreshTaskConfigResponse response) {
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
        public Builder body(ChangeAssetRefreshTaskConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeAssetRefreshTaskConfigResponse build() {
            return new ChangeAssetRefreshTaskConfigResponse(this);
        } 

    } 

}
