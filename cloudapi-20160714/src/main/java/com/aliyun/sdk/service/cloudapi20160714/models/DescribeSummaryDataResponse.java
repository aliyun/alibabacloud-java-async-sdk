// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSummaryDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeSummaryDataResponse</p>
 */
public class DescribeSummaryDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSummaryDataResponseBody body;

    private DescribeSummaryDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSummaryDataResponse create() {
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
    public DescribeSummaryDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSummaryDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSummaryDataResponseBody body);

        @Override
        DescribeSummaryDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSummaryDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSummaryDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSummaryDataResponse response) {
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
        public Builder body(DescribeSummaryDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSummaryDataResponse build() {
            return new DescribeSummaryDataResponse(this);
        } 

    } 

}
