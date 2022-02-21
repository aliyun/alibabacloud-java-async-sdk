// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    private ListCenInterRegionTrafficQosPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCenInterRegionTrafficQosPoliciesResponse create() {
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
    public ListCenInterRegionTrafficQosPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCenInterRegionTrafficQosPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCenInterRegionTrafficQosPoliciesResponseBody body);

        @Override
        ListCenInterRegionTrafficQosPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCenInterRegionTrafficQosPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCenInterRegionTrafficQosPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCenInterRegionTrafficQosPoliciesResponse response) {
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
        public Builder body(ListCenInterRegionTrafficQosPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCenInterRegionTrafficQosPoliciesResponse build() {
            return new ListCenInterRegionTrafficQosPoliciesResponse(this);
        } 

    } 

}
