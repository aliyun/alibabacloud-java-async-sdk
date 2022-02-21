// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenRouteMapsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCenRouteMapsResponse</p>
 */
public class DescribeCenRouteMapsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCenRouteMapsResponseBody body;

    private DescribeCenRouteMapsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCenRouteMapsResponse create() {
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
    public DescribeCenRouteMapsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCenRouteMapsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCenRouteMapsResponseBody body);

        @Override
        DescribeCenRouteMapsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCenRouteMapsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCenRouteMapsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCenRouteMapsResponse response) {
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
        public Builder body(DescribeCenRouteMapsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCenRouteMapsResponse build() {
            return new DescribeCenRouteMapsResponse(this);
        } 

    } 

}
