// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsThreatLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribePdnsThreatLogsResponse</p>
 */
public class DescribePdnsThreatLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePdnsThreatLogsResponseBody body;

    private DescribePdnsThreatLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePdnsThreatLogsResponse create() {
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
    public DescribePdnsThreatLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePdnsThreatLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePdnsThreatLogsResponseBody body);

        @Override
        DescribePdnsThreatLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePdnsThreatLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePdnsThreatLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePdnsThreatLogsResponse response) {
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
        public Builder body(DescribePdnsThreatLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePdnsThreatLogsResponse build() {
            return new DescribePdnsThreatLogsResponse(this);
        } 

    } 

}
