// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportFeaturesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSupportFeaturesResponse</p>
 */
public class DescribeSupportFeaturesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSupportFeaturesResponseBody body;

    private DescribeSupportFeaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSupportFeaturesResponse create() {
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
    public DescribeSupportFeaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSupportFeaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSupportFeaturesResponseBody body);

        @Override
        DescribeSupportFeaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSupportFeaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSupportFeaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSupportFeaturesResponse response) {
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
        public Builder body(DescribeSupportFeaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSupportFeaturesResponse build() {
            return new DescribeSupportFeaturesResponse(this);
        } 

    } 

}
