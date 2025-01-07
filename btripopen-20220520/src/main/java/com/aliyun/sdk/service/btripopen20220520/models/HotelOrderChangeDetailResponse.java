// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link HotelOrderChangeDetailResponse} extends {@link TeaModel}
 *
 * <p>HotelOrderChangeDetailResponse</p>
 */
public class HotelOrderChangeDetailResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private HotelOrderChangeDetailResponseBody body;

    private HotelOrderChangeDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static HotelOrderChangeDetailResponse create() {
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
    public HotelOrderChangeDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelOrderChangeDetailResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(HotelOrderChangeDetailResponseBody body);

        @Override
        HotelOrderChangeDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelOrderChangeDetailResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private HotelOrderChangeDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelOrderChangeDetailResponse response) {
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
        public Builder body(HotelOrderChangeDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelOrderChangeDetailResponse build() {
            return new HotelOrderChangeDetailResponse(this);
        } 

    } 

}
