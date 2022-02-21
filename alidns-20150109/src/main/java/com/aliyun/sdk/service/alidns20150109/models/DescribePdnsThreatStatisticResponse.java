// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsThreatStatisticResponse} extends {@link TeaModel}
 *
 * <p>DescribePdnsThreatStatisticResponse</p>
 */
public class DescribePdnsThreatStatisticResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePdnsThreatStatisticResponseBody body;

    private DescribePdnsThreatStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePdnsThreatStatisticResponse create() {
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
    public DescribePdnsThreatStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePdnsThreatStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePdnsThreatStatisticResponseBody body);

        @Override
        DescribePdnsThreatStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePdnsThreatStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePdnsThreatStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePdnsThreatStatisticResponse response) {
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
        public Builder body(DescribePdnsThreatStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePdnsThreatStatisticResponse build() {
            return new DescribePdnsThreatStatisticResponse(this);
        } 

    } 

}
