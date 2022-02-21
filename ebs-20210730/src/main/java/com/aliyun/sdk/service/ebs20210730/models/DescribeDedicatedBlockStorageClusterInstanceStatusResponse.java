// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedBlockStorageClusterInstanceStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedBlockStorageClusterInstanceStatusResponse</p>
 */
public class DescribeDedicatedBlockStorageClusterInstanceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody body;

    private DescribeDedicatedBlockStorageClusterInstanceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDedicatedBlockStorageClusterInstanceStatusResponse create() {
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
    public DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDedicatedBlockStorageClusterInstanceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody body);

        @Override
        DescribeDedicatedBlockStorageClusterInstanceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDedicatedBlockStorageClusterInstanceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDedicatedBlockStorageClusterInstanceStatusResponse response) {
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
        public Builder body(DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDedicatedBlockStorageClusterInstanceStatusResponse build() {
            return new DescribeDedicatedBlockStorageClusterInstanceStatusResponse(this);
        } 

    } 

}
