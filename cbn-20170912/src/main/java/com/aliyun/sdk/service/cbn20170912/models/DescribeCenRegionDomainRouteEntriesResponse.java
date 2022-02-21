// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    private DescribeCenRegionDomainRouteEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCenRegionDomainRouteEntriesResponse create() {
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
    public DescribeCenRegionDomainRouteEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCenRegionDomainRouteEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCenRegionDomainRouteEntriesResponseBody body);

        @Override
        DescribeCenRegionDomainRouteEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCenRegionDomainRouteEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCenRegionDomainRouteEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCenRegionDomainRouteEntriesResponse response) {
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
        public Builder body(DescribeCenRegionDomainRouteEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCenRegionDomainRouteEntriesResponse build() {
            return new DescribeCenRegionDomainRouteEntriesResponse(this);
        } 

    } 

}
