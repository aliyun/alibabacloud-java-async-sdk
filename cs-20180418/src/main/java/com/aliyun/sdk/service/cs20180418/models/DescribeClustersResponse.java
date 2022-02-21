// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeClustersResponse</p>
 */
public class DescribeClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DescribeClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static DescribeClustersResponse create() {
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

    public interface Builder extends Response.Builder<DescribeClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DescribeClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClustersResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DescribeClustersResponse build() {
            return new DescribeClustersResponse(this);
        } 

    } 

}
