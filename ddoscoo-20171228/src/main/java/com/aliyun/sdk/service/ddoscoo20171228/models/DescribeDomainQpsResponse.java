// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainQpsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainQpsResponse</p>
 */
public class DescribeDomainQpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainQpsResponseBody body;

    private DescribeDomainQpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainQpsResponse create() {
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
    public DescribeDomainQpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainQpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainQpsResponseBody body);

        @Override
        DescribeDomainQpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainQpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainQpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainQpsResponse response) {
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
        public Builder body(DescribeDomainQpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainQpsResponse build() {
            return new DescribeDomainQpsResponse(this);
        } 

    } 

}
