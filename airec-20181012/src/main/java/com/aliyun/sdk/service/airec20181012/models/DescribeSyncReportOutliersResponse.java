// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSyncReportOutliersResponse} extends {@link TeaModel}
 *
 * <p>DescribeSyncReportOutliersResponse</p>
 */
public class DescribeSyncReportOutliersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSyncReportOutliersResponseBody body;

    private DescribeSyncReportOutliersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSyncReportOutliersResponse create() {
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
    public DescribeSyncReportOutliersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSyncReportOutliersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSyncReportOutliersResponseBody body);

        @Override
        DescribeSyncReportOutliersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSyncReportOutliersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSyncReportOutliersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSyncReportOutliersResponse response) {
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
        public Builder body(DescribeSyncReportOutliersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSyncReportOutliersResponse build() {
            return new DescribeSyncReportOutliersResponse(this);
        } 

    } 

}
