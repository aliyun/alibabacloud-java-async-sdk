// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAccessModeResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainAccessModeResponse</p>
 */
public class DescribeDomainAccessModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainAccessModeResponseBody body;

    private DescribeDomainAccessModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainAccessModeResponse create() {
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
    public DescribeDomainAccessModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainAccessModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainAccessModeResponseBody body);

        @Override
        DescribeDomainAccessModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainAccessModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainAccessModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainAccessModeResponse response) {
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
        public Builder body(DescribeDomainAccessModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainAccessModeResponse build() {
            return new DescribeDomainAccessModeResponse(this);
        } 

    } 

}
