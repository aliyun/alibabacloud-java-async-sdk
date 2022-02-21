// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostDisksResponse} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostDisksResponse</p>
 */
public class DescribeDedicatedHostDisksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDedicatedHostDisksResponseBody body;

    private DescribeDedicatedHostDisksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDedicatedHostDisksResponse create() {
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
    public DescribeDedicatedHostDisksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDedicatedHostDisksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDedicatedHostDisksResponseBody body);

        @Override
        DescribeDedicatedHostDisksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDedicatedHostDisksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDedicatedHostDisksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDedicatedHostDisksResponse response) {
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
        public Builder body(DescribeDedicatedHostDisksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDedicatedHostDisksResponse build() {
            return new DescribeDedicatedHostDisksResponse(this);
        } 

    } 

}
