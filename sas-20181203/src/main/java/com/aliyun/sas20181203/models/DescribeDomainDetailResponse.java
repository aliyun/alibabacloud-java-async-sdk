// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailResponse</p>
 */
public class DescribeDomainDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainDetailResponseBody body;

    private DescribeDomainDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainDetailResponse create() {
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
    public DescribeDomainDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainDetailResponseBody body);

        @Override
        DescribeDomainDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainDetailResponse response) {
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
        public Builder body(DescribeDomainDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainDetailResponse build() {
            return new DescribeDomainDetailResponse(this);
        } 

    } 

}
