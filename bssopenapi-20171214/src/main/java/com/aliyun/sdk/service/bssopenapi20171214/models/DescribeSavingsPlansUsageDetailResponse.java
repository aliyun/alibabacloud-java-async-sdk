// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansUsageDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansUsageDetailResponse</p>
 */
public class DescribeSavingsPlansUsageDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSavingsPlansUsageDetailResponseBody body;

    private DescribeSavingsPlansUsageDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSavingsPlansUsageDetailResponse create() {
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
    public DescribeSavingsPlansUsageDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSavingsPlansUsageDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSavingsPlansUsageDetailResponseBody body);

        @Override
        DescribeSavingsPlansUsageDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSavingsPlansUsageDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSavingsPlansUsageDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSavingsPlansUsageDetailResponse response) {
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
        public Builder body(DescribeSavingsPlansUsageDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSavingsPlansUsageDetailResponse build() {
            return new DescribeSavingsPlansUsageDetailResponse(this);
        } 

    } 

}
