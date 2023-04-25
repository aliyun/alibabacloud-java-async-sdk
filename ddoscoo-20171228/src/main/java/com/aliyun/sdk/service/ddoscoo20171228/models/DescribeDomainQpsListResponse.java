// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainQpsListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainQpsListResponse</p>
 */
public class DescribeDomainQpsListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainQpsListResponseBody body;

    private DescribeDomainQpsListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainQpsListResponse create() {
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
    public DescribeDomainQpsListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainQpsListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainQpsListResponseBody body);

        @Override
        DescribeDomainQpsListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainQpsListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainQpsListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainQpsListResponse response) {
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
        public Builder body(DescribeDomainQpsListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainQpsListResponse build() {
            return new DescribeDomainQpsListResponse(this);
        } 

    } 

}
