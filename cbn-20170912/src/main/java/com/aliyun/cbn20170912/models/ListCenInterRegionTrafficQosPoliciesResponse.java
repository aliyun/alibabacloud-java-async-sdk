// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListCenInterRegionTrafficQosPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListCenInterRegionTrafficQosPoliciesResponse</p>
 */
public class ListCenInterRegionTrafficQosPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCenInterRegionTrafficQosPoliciesResponseBody body;


    private ListCenInterRegionTrafficQosPoliciesResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCenInterRegionTrafficQosPoliciesResponse create() {
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
    public ListCenInterRegionTrafficQosPoliciesResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListCenInterRegionTrafficQosPoliciesResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListCenInterRegionTrafficQosPoliciesResponse response) {
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
        public Builder body(ListCenInterRegionTrafficQosPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        public ListCenInterRegionTrafficQosPoliciesResponse build() {
            return new ListCenInterRegionTrafficQosPoliciesResponse(this);
        } 

    } 

}
