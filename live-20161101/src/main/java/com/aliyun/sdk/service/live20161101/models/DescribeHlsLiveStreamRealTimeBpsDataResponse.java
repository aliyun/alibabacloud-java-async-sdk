// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHlsLiveStreamRealTimeBpsDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeHlsLiveStreamRealTimeBpsDataResponse</p>
 */
public class DescribeHlsLiveStreamRealTimeBpsDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHlsLiveStreamRealTimeBpsDataResponseBody body;

    private DescribeHlsLiveStreamRealTimeBpsDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHlsLiveStreamRealTimeBpsDataResponse create() {
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
    public DescribeHlsLiveStreamRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHlsLiveStreamRealTimeBpsDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHlsLiveStreamRealTimeBpsDataResponseBody body);

        @Override
        DescribeHlsLiveStreamRealTimeBpsDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHlsLiveStreamRealTimeBpsDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHlsLiveStreamRealTimeBpsDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHlsLiveStreamRealTimeBpsDataResponse response) {
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
        public Builder body(DescribeHlsLiveStreamRealTimeBpsDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHlsLiveStreamRealTimeBpsDataResponse build() {
            return new DescribeHlsLiveStreamRealTimeBpsDataResponse(this);
        } 

    } 

}
