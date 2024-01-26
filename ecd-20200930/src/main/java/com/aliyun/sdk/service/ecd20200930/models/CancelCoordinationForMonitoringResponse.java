// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCoordinationForMonitoringResponse} extends {@link TeaModel}
 *
 * <p>CancelCoordinationForMonitoringResponse</p>
 */
public class CancelCoordinationForMonitoringResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CancelCoordinationForMonitoringResponseBody body;

    private CancelCoordinationForMonitoringResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelCoordinationForMonitoringResponse create() {
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
    public CancelCoordinationForMonitoringResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelCoordinationForMonitoringResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CancelCoordinationForMonitoringResponseBody body);

        @Override
        CancelCoordinationForMonitoringResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelCoordinationForMonitoringResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CancelCoordinationForMonitoringResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelCoordinationForMonitoringResponse response) {
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
        public Builder body(CancelCoordinationForMonitoringResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelCoordinationForMonitoringResponse build() {
            return new CancelCoordinationForMonitoringResponse(this);
        } 

    } 

}
