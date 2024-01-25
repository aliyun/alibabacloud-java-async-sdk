// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcApproxPeakRateResponse} extends {@link TeaModel}
 *
 * <p>DescribeMeterRtcApproxPeakRateResponse</p>
 */
public class DescribeMeterRtcApproxPeakRateResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeMeterRtcApproxPeakRateResponseBody body;

    private DescribeMeterRtcApproxPeakRateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeMeterRtcApproxPeakRateResponse create() {
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
    public DescribeMeterRtcApproxPeakRateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMeterRtcApproxPeakRateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeMeterRtcApproxPeakRateResponseBody body);

        @Override
        DescribeMeterRtcApproxPeakRateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMeterRtcApproxPeakRateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeMeterRtcApproxPeakRateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMeterRtcApproxPeakRateResponse response) {
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
        public Builder body(DescribeMeterRtcApproxPeakRateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMeterRtcApproxPeakRateResponse build() {
            return new DescribeMeterRtcApproxPeakRateResponse(this);
        } 

    } 

}
