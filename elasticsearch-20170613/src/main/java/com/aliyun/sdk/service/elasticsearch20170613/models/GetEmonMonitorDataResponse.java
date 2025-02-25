// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEmonMonitorDataResponse} extends {@link TeaModel}
 *
 * <p>GetEmonMonitorDataResponse</p>
 */
public class GetEmonMonitorDataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetEmonMonitorDataResponseBody body;

    private GetEmonMonitorDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetEmonMonitorDataResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
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
    public GetEmonMonitorDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEmonMonitorDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetEmonMonitorDataResponseBody body);

        @Override
        GetEmonMonitorDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEmonMonitorDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetEmonMonitorDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEmonMonitorDataResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(GetEmonMonitorDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEmonMonitorDataResponse build() {
            return new GetEmonMonitorDataResponse(this);
        } 

    } 

}
