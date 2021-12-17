// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UnassociateCenBandwidthPackageResponse} extends {@link TeaModel}
 *
 * <p>UnassociateCenBandwidthPackageResponse</p>
 */
public class UnassociateCenBandwidthPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassociateCenBandwidthPackageResponseBody body;


    private UnassociateCenBandwidthPackageResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateCenBandwidthPackageResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public UnassociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private UnassociateCenBandwidthPackageResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateCenBandwidthPackageResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(UnassociateCenBandwidthPackageResponseBody body) {
            this.body = body;
            return this;
        }

        public UnassociateCenBandwidthPackageResponse build() {
            return new UnassociateCenBandwidthPackageResponse(this);
        } 

    } 

}
