// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedServicesResponse} extends {@link TeaModel}
 *
 * <p>DescribeManagedServicesResponse</p>
 */
public class DescribeManagedServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeManagedServicesResponseBody body;

    private DescribeManagedServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeManagedServicesResponse create() {
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
    public DescribeManagedServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeManagedServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeManagedServicesResponseBody body);

        @Override
        DescribeManagedServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeManagedServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeManagedServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeManagedServicesResponse response) {
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
        public Builder body(DescribeManagedServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeManagedServicesResponse build() {
            return new DescribeManagedServicesResponse(this);
        } 

    } 

}
