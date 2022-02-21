// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansCoverageDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansCoverageDetailResponse</p>
 */
public class DescribeSavingsPlansCoverageDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSavingsPlansCoverageDetailResponseBody body;

    private DescribeSavingsPlansCoverageDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSavingsPlansCoverageDetailResponse create() {
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
    public DescribeSavingsPlansCoverageDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSavingsPlansCoverageDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSavingsPlansCoverageDetailResponseBody body);

        @Override
        DescribeSavingsPlansCoverageDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSavingsPlansCoverageDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSavingsPlansCoverageDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSavingsPlansCoverageDetailResponse response) {
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
        public Builder body(DescribeSavingsPlansCoverageDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSavingsPlansCoverageDetailResponse build() {
            return new DescribeSavingsPlansCoverageDetailResponse(this);
        } 

    } 

}
