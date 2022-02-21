// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnRealTimeDeliveryFieldResponse} extends {@link TeaModel}
 *
 * <p>DescribeDcdnRealTimeDeliveryFieldResponse</p>
 */
public class DescribeDcdnRealTimeDeliveryFieldResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDcdnRealTimeDeliveryFieldResponseBody body;

    private DescribeDcdnRealTimeDeliveryFieldResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDcdnRealTimeDeliveryFieldResponse create() {
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
    public DescribeDcdnRealTimeDeliveryFieldResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDcdnRealTimeDeliveryFieldResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDcdnRealTimeDeliveryFieldResponseBody body);

        @Override
        DescribeDcdnRealTimeDeliveryFieldResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDcdnRealTimeDeliveryFieldResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDcdnRealTimeDeliveryFieldResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDcdnRealTimeDeliveryFieldResponse response) {
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
        public Builder body(DescribeDcdnRealTimeDeliveryFieldResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDcdnRealTimeDeliveryFieldResponse build() {
            return new DescribeDcdnRealTimeDeliveryFieldResponse(this);
        } 

    } 

}
