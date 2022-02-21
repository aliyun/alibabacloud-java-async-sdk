// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthLimitationResponse} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthLimitationResponse</p>
 */
public class DescribeBandwidthLimitationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBandwidthLimitationResponseBody body;

    private DescribeBandwidthLimitationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBandwidthLimitationResponse create() {
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
    public DescribeBandwidthLimitationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBandwidthLimitationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBandwidthLimitationResponseBody body);

        @Override
        DescribeBandwidthLimitationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBandwidthLimitationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBandwidthLimitationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBandwidthLimitationResponse response) {
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
        public Builder body(DescribeBandwidthLimitationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBandwidthLimitationResponse build() {
            return new DescribeBandwidthLimitationResponse(this);
        } 

    } 

}
