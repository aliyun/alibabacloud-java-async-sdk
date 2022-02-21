// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBatchResultDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeBatchResultDetailResponse</p>
 */
public class DescribeBatchResultDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBatchResultDetailResponseBody body;

    private DescribeBatchResultDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBatchResultDetailResponse create() {
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
    public DescribeBatchResultDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBatchResultDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBatchResultDetailResponseBody body);

        @Override
        DescribeBatchResultDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBatchResultDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBatchResultDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBatchResultDetailResponse response) {
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
        public Builder body(DescribeBatchResultDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBatchResultDetailResponse build() {
            return new DescribeBatchResultDetailResponse(this);
        } 

    } 

}
