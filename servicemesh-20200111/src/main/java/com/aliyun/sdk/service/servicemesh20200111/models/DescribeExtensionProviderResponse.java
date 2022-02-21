// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExtensionProviderResponse} extends {@link TeaModel}
 *
 * <p>DescribeExtensionProviderResponse</p>
 */
public class DescribeExtensionProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExtensionProviderResponseBody body;

    private DescribeExtensionProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExtensionProviderResponse create() {
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
    public DescribeExtensionProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExtensionProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExtensionProviderResponseBody body);

        @Override
        DescribeExtensionProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExtensionProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExtensionProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExtensionProviderResponse response) {
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
        public Builder body(DescribeExtensionProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExtensionProviderResponse build() {
            return new DescribeExtensionProviderResponse(this);
        } 

    } 

}
