// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlaEventListResponse} extends {@link TeaModel}
 *
 * <p>DescribeSlaEventListResponse</p>
 */
public class DescribeSlaEventListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSlaEventListResponseBody body;

    private DescribeSlaEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSlaEventListResponse create() {
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
    public DescribeSlaEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSlaEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSlaEventListResponseBody body);

        @Override
        DescribeSlaEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSlaEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSlaEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSlaEventListResponse response) {
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
        public Builder body(DescribeSlaEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSlaEventListResponse build() {
            return new DescribeSlaEventListResponse(this);
        } 

    } 

}
