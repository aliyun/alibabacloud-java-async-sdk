// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventExportInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventExportInfoResponse</p>
 */
public class DescribeSuspEventExportInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSuspEventExportInfoResponseBody body;

    private DescribeSuspEventExportInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSuspEventExportInfoResponse create() {
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
    public DescribeSuspEventExportInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSuspEventExportInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSuspEventExportInfoResponseBody body);

        @Override
        DescribeSuspEventExportInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSuspEventExportInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSuspEventExportInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSuspEventExportInfoResponse response) {
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
        public Builder body(DescribeSuspEventExportInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSuspEventExportInfoResponse build() {
            return new DescribeSuspEventExportInfoResponse(this);
        } 

    } 

}
