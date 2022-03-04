// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersV1Response} extends {@link TeaModel}
 *
 * <p>DescribeClustersV1Response</p>
 */
public class DescribeClustersV1Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClustersV1ResponseBody body;

    private DescribeClustersV1Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClustersV1Response create() {
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
    public DescribeClustersV1ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClustersV1Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClustersV1ResponseBody body);

        @Override
        DescribeClustersV1Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClustersV1Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClustersV1ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClustersV1Response response) {
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
        public Builder body(DescribeClustersV1ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClustersV1Response build() {
            return new DescribeClustersV1Response(this);
        } 

    } 

}
