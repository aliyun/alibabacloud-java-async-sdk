// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetRuntimeChannelQrCodeDetailResponse} extends {@link TeaModel}
 *
 * <p>GetRuntimeChannelQrCodeDetailResponse</p>
 */
public class GetRuntimeChannelQrCodeDetailResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetRuntimeChannelQrCodeDetailResponseBody body;

    private GetRuntimeChannelQrCodeDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetRuntimeChannelQrCodeDetailResponse create() {
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
    public GetRuntimeChannelQrCodeDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRuntimeChannelQrCodeDetailResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetRuntimeChannelQrCodeDetailResponseBody body);

        @Override
        GetRuntimeChannelQrCodeDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRuntimeChannelQrCodeDetailResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetRuntimeChannelQrCodeDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRuntimeChannelQrCodeDetailResponse response) {
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
        public Builder body(GetRuntimeChannelQrCodeDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRuntimeChannelQrCodeDetailResponse build() {
            return new GetRuntimeChannelQrCodeDetailResponse(this);
        } 

    } 

}
