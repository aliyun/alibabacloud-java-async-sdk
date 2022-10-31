// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamMetricDetailDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamMetricDetailDataResponse</p>
 */
public class DescribeLiveStreamMetricDetailDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveStreamMetricDetailDataResponseBody body;

    private DescribeLiveStreamMetricDetailDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveStreamMetricDetailDataResponse create() {
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
    public DescribeLiveStreamMetricDetailDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveStreamMetricDetailDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveStreamMetricDetailDataResponseBody body);

        @Override
        DescribeLiveStreamMetricDetailDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveStreamMetricDetailDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveStreamMetricDetailDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveStreamMetricDetailDataResponse response) {
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
        public Builder body(DescribeLiveStreamMetricDetailDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveStreamMetricDetailDataResponse build() {
            return new DescribeLiveStreamMetricDetailDataResponse(this);
        } 

    } 

}
