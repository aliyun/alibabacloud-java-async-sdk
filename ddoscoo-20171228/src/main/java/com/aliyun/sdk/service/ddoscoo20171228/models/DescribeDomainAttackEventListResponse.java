// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAttackEventListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainAttackEventListResponse</p>
 */
public class DescribeDomainAttackEventListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainAttackEventListResponseBody body;

    private DescribeDomainAttackEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainAttackEventListResponse create() {
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
    public DescribeDomainAttackEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainAttackEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainAttackEventListResponseBody body);

        @Override
        DescribeDomainAttackEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainAttackEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainAttackEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainAttackEventListResponse response) {
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
        public Builder body(DescribeDomainAttackEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainAttackEventListResponse build() {
            return new DescribeDomainAttackEventListResponse(this);
        } 

    } 

}
