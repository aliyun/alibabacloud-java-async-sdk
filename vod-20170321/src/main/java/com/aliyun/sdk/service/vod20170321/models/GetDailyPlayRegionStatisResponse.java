// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDailyPlayRegionStatisResponse} extends {@link TeaModel}
 *
 * <p>GetDailyPlayRegionStatisResponse</p>
 */
public class GetDailyPlayRegionStatisResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDailyPlayRegionStatisResponseBody body;

    private GetDailyPlayRegionStatisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDailyPlayRegionStatisResponse create() {
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
    public GetDailyPlayRegionStatisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDailyPlayRegionStatisResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDailyPlayRegionStatisResponseBody body);

        @Override
        GetDailyPlayRegionStatisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDailyPlayRegionStatisResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetDailyPlayRegionStatisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDailyPlayRegionStatisResponse response) {
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
        public Builder body(GetDailyPlayRegionStatisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDailyPlayRegionStatisResponse build() {
            return new GetDailyPlayRegionStatisResponse(this);
        } 

    } 

}
