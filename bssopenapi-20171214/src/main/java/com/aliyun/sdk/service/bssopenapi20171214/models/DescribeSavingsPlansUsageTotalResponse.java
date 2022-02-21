// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansUsageTotalResponse} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansUsageTotalResponse</p>
 */
public class DescribeSavingsPlansUsageTotalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSavingsPlansUsageTotalResponseBody body;

    private DescribeSavingsPlansUsageTotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSavingsPlansUsageTotalResponse create() {
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
    public DescribeSavingsPlansUsageTotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSavingsPlansUsageTotalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSavingsPlansUsageTotalResponseBody body);

        @Override
        DescribeSavingsPlansUsageTotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSavingsPlansUsageTotalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSavingsPlansUsageTotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSavingsPlansUsageTotalResponse response) {
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
        public Builder body(DescribeSavingsPlansUsageTotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSavingsPlansUsageTotalResponse build() {
            return new DescribeSavingsPlansUsageTotalResponse(this);
        } 

    } 

}
