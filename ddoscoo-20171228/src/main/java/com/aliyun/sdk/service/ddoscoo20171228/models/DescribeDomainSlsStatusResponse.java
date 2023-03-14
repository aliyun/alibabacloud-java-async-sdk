// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSlsStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainSlsStatusResponse</p>
 */
public class DescribeDomainSlsStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainSlsStatusResponseBody body;

    private DescribeDomainSlsStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainSlsStatusResponse create() {
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
    public DescribeDomainSlsStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainSlsStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainSlsStatusResponseBody body);

        @Override
        DescribeDomainSlsStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainSlsStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainSlsStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainSlsStatusResponse response) {
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
        public Builder body(DescribeDomainSlsStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainSlsStatusResponse build() {
            return new DescribeDomainSlsStatusResponse(this);
        } 

    } 

}
