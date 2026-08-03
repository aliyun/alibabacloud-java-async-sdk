// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link GlobalHotelSearchHotelListResponse} extends {@link TeaModel}
 *
 * <p>GlobalHotelSearchHotelListResponse</p>
 */
public class GlobalHotelSearchHotelListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GlobalHotelSearchHotelListResponseBody body;

    private GlobalHotelSearchHotelListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GlobalHotelSearchHotelListResponse create() {
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
    public GlobalHotelSearchHotelListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GlobalHotelSearchHotelListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GlobalHotelSearchHotelListResponseBody body);

        @Override
        GlobalHotelSearchHotelListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GlobalHotelSearchHotelListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GlobalHotelSearchHotelListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GlobalHotelSearchHotelListResponse response) {
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
        public Builder body(GlobalHotelSearchHotelListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GlobalHotelSearchHotelListResponse build() {
            return new GlobalHotelSearchHotelListResponse(this);
        } 

    } 

}
