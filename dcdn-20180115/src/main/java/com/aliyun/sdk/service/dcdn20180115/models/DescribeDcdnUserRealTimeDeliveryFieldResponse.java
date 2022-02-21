// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserRealTimeDeliveryFieldResponse} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserRealTimeDeliveryFieldResponse</p>
 */
public class DescribeDcdnUserRealTimeDeliveryFieldResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDcdnUserRealTimeDeliveryFieldResponseBody body;

    private DescribeDcdnUserRealTimeDeliveryFieldResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDcdnUserRealTimeDeliveryFieldResponse create() {
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
    public DescribeDcdnUserRealTimeDeliveryFieldResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDcdnUserRealTimeDeliveryFieldResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDcdnUserRealTimeDeliveryFieldResponseBody body);

        @Override
        DescribeDcdnUserRealTimeDeliveryFieldResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDcdnUserRealTimeDeliveryFieldResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDcdnUserRealTimeDeliveryFieldResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDcdnUserRealTimeDeliveryFieldResponse response) {
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
        public Builder body(DescribeDcdnUserRealTimeDeliveryFieldResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDcdnUserRealTimeDeliveryFieldResponse build() {
            return new DescribeDcdnUserRealTimeDeliveryFieldResponse(this);
        } 

    } 

}
