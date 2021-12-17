// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCenRegionDomainRouteEntriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCenRegionDomainRouteEntriesResponse</p>
 */
public class DescribeCenRegionDomainRouteEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCenRegionDomainRouteEntriesResponseBody body;


    private DescribeCenRegionDomainRouteEntriesResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenRegionDomainRouteEntriesResponse create() {
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
    public DescribeCenRegionDomainRouteEntriesResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCenRegionDomainRouteEntriesResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCenRegionDomainRouteEntriesResponse response) {
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
        public Builder body(DescribeCenRegionDomainRouteEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeCenRegionDomainRouteEntriesResponse build() {
            return new DescribeCenRegionDomainRouteEntriesResponse(this);
        } 

    } 

}
