// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportedZonesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSupportedZonesResponse</p>
 */
public class DescribeSupportedZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSupportedZonesResponseBody body;

    private DescribeSupportedZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSupportedZonesResponse create() {
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
    public DescribeSupportedZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSupportedZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSupportedZonesResponseBody body);

        @Override
        DescribeSupportedZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSupportedZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSupportedZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSupportedZonesResponse response) {
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
        public Builder body(DescribeSupportedZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSupportedZonesResponse build() {
            return new DescribeSupportedZonesResponse(this);
        } 

    } 

}
