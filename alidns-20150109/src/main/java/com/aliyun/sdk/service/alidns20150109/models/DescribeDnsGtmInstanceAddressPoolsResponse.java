// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmInstanceAddressPoolsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceAddressPoolsResponse</p>
 */
public class DescribeDnsGtmInstanceAddressPoolsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDnsGtmInstanceAddressPoolsResponseBody body;

    private DescribeDnsGtmInstanceAddressPoolsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDnsGtmInstanceAddressPoolsResponse create() {
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
    public DescribeDnsGtmInstanceAddressPoolsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDnsGtmInstanceAddressPoolsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDnsGtmInstanceAddressPoolsResponseBody body);

        @Override
        DescribeDnsGtmInstanceAddressPoolsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDnsGtmInstanceAddressPoolsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDnsGtmInstanceAddressPoolsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDnsGtmInstanceAddressPoolsResponse response) {
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
        public Builder body(DescribeDnsGtmInstanceAddressPoolsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDnsGtmInstanceAddressPoolsResponse build() {
            return new DescribeDnsGtmInstanceAddressPoolsResponse(this);
        } 

    } 

}
