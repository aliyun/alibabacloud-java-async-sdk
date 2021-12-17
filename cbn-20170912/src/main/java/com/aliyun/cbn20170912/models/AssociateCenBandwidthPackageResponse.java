// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AssociateCenBandwidthPackageResponse} extends {@link TeaModel}
 *
 * <p>AssociateCenBandwidthPackageResponse</p>
 */
public class AssociateCenBandwidthPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateCenBandwidthPackageResponseBody body;


    private AssociateCenBandwidthPackageResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateCenBandwidthPackageResponse create() {
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
    public AssociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private AssociateCenBandwidthPackageResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(AssociateCenBandwidthPackageResponse response) {
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
        public Builder body(AssociateCenBandwidthPackageResponseBody body) {
            this.body = body;
            return this;
        }

        public AssociateCenBandwidthPackageResponse build() {
            return new AssociateCenBandwidthPackageResponse(this);
        } 

    } 

}
