// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link GetHotelSampleUtterancesResponse} extends {@link TeaModel}
 *
 * <p>GetHotelSampleUtterancesResponse</p>
 */
public class GetHotelSampleUtterancesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetHotelSampleUtterancesResponseBody body;

    private GetHotelSampleUtterancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetHotelSampleUtterancesResponse create() {
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
    public GetHotelSampleUtterancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelSampleUtterancesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetHotelSampleUtterancesResponseBody body);

        @Override
        GetHotelSampleUtterancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelSampleUtterancesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetHotelSampleUtterancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelSampleUtterancesResponse response) {
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
        public Builder body(GetHotelSampleUtterancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelSampleUtterancesResponse build() {
            return new GetHotelSampleUtterancesResponse(this);
        } 

    } 

}
