// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainNamesOfVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainNamesOfVersionResponse</p>
 */
public class DescribeDomainNamesOfVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainNamesOfVersionResponseBody body;

    private DescribeDomainNamesOfVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainNamesOfVersionResponse create() {
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
    public DescribeDomainNamesOfVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainNamesOfVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainNamesOfVersionResponseBody body);

        @Override
        DescribeDomainNamesOfVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainNamesOfVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainNamesOfVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainNamesOfVersionResponse response) {
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
        public Builder body(DescribeDomainNamesOfVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainNamesOfVersionResponse build() {
            return new DescribeDomainNamesOfVersionResponse(this);
        } 

    } 

}
