// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechLicenseDeviceListResponse} extends {@link TeaModel}
 *
 * <p>QuerySpeechLicenseDeviceListResponse</p>
 */
public class QuerySpeechLicenseDeviceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpeechLicenseDeviceListResponseBody body;

    private QuerySpeechLicenseDeviceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpeechLicenseDeviceListResponse create() {
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
    public QuerySpeechLicenseDeviceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpeechLicenseDeviceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpeechLicenseDeviceListResponseBody body);

        @Override
        QuerySpeechLicenseDeviceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpeechLicenseDeviceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpeechLicenseDeviceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpeechLicenseDeviceListResponse response) {
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
        public Builder body(QuerySpeechLicenseDeviceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpeechLicenseDeviceListResponse build() {
            return new QuerySpeechLicenseDeviceListResponse(this);
        } 

    } 

}
