// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCnameResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainCnameResponse</p>
 */
public class DescribeDomainCnameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainCnameResponseBody body;

    private DescribeDomainCnameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainCnameResponse create() {
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
    public DescribeDomainCnameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainCnameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainCnameResponseBody body);

        @Override
        DescribeDomainCnameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainCnameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainCnameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainCnameResponse response) {
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
        public Builder body(DescribeDomainCnameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainCnameResponse build() {
            return new DescribeDomainCnameResponse(this);
        } 

    } 

}
