// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAddressPoolAvailableConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmAddressPoolAvailableConfigResponse</p>
 */
public class DescribeDnsGtmAddressPoolAvailableConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDnsGtmAddressPoolAvailableConfigResponseBody body;

    private DescribeDnsGtmAddressPoolAvailableConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDnsGtmAddressPoolAvailableConfigResponse create() {
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
    public DescribeDnsGtmAddressPoolAvailableConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDnsGtmAddressPoolAvailableConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDnsGtmAddressPoolAvailableConfigResponseBody body);

        @Override
        DescribeDnsGtmAddressPoolAvailableConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDnsGtmAddressPoolAvailableConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDnsGtmAddressPoolAvailableConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDnsGtmAddressPoolAvailableConfigResponse response) {
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
        public Builder body(DescribeDnsGtmAddressPoolAvailableConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDnsGtmAddressPoolAvailableConfigResponse build() {
            return new DescribeDnsGtmAddressPoolAvailableConfigResponse(this);
        } 

    } 

}
