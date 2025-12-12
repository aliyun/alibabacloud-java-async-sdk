// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link UpdateLindormV2WhiteIpListResponse} extends {@link TeaModel}
 *
 * <p>UpdateLindormV2WhiteIpListResponse</p>
 */
public class UpdateLindormV2WhiteIpListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateLindormV2WhiteIpListResponseBody body;

    private UpdateLindormV2WhiteIpListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateLindormV2WhiteIpListResponse create() {
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
    public UpdateLindormV2WhiteIpListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLindormV2WhiteIpListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateLindormV2WhiteIpListResponseBody body);

        @Override
        UpdateLindormV2WhiteIpListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLindormV2WhiteIpListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateLindormV2WhiteIpListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLindormV2WhiteIpListResponse response) {
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
        public Builder body(UpdateLindormV2WhiteIpListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLindormV2WhiteIpListResponse build() {
            return new UpdateLindormV2WhiteIpListResponse(this);
        } 

    } 

}
