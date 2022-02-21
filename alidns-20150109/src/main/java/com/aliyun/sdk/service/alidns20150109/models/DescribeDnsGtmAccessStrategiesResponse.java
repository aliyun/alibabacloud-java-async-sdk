// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAccessStrategiesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAccessStrategiesResponse</p>
 */
public class DescribeDnsGtmAccessStrategiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDnsGtmAccessStrategiesResponseBody body;

    private DescribeDnsGtmAccessStrategiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDnsGtmAccessStrategiesResponse create() {
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
    public DescribeDnsGtmAccessStrategiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDnsGtmAccessStrategiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDnsGtmAccessStrategiesResponseBody body);

        @Override
        DescribeDnsGtmAccessStrategiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDnsGtmAccessStrategiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDnsGtmAccessStrategiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDnsGtmAccessStrategiesResponse response) {
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
        public Builder body(DescribeDnsGtmAccessStrategiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDnsGtmAccessStrategiesResponse build() {
            return new DescribeDnsGtmAccessStrategiesResponse(this);
        } 

    } 

}
