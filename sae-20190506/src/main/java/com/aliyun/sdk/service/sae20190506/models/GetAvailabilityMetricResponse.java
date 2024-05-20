// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailabilityMetricResponse} extends {@link TeaModel}
 *
 * <p>GetAvailabilityMetricResponse</p>
 */
public class GetAvailabilityMetricResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAvailabilityMetricResponseBody body;

    private GetAvailabilityMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAvailabilityMetricResponse create() {
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
    public GetAvailabilityMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAvailabilityMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAvailabilityMetricResponseBody body);

        @Override
        GetAvailabilityMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAvailabilityMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAvailabilityMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAvailabilityMetricResponse response) {
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
        public Builder body(GetAvailabilityMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAvailabilityMetricResponse build() {
            return new GetAvailabilityMetricResponse(this);
        } 

    } 

}
