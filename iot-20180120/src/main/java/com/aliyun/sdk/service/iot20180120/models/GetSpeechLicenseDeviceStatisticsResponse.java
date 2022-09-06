// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpeechLicenseDeviceStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetSpeechLicenseDeviceStatisticsResponse</p>
 */
public class GetSpeechLicenseDeviceStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSpeechLicenseDeviceStatisticsResponseBody body;

    private GetSpeechLicenseDeviceStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSpeechLicenseDeviceStatisticsResponse create() {
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
     * @return body
     */
    public GetSpeechLicenseDeviceStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSpeechLicenseDeviceStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSpeechLicenseDeviceStatisticsResponseBody body);

        @Override
        GetSpeechLicenseDeviceStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSpeechLicenseDeviceStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSpeechLicenseDeviceStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSpeechLicenseDeviceStatisticsResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(GetSpeechLicenseDeviceStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSpeechLicenseDeviceStatisticsResponse build() {
            return new GetSpeechLicenseDeviceStatisticsResponse(this);
        } 

    } 

}
