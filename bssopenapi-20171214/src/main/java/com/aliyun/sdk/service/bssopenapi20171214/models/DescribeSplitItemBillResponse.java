// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSplitItemBillResponse} extends {@link TeaModel}
 *
 * <p>DescribeSplitItemBillResponse</p>
 */
public class DescribeSplitItemBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSplitItemBillResponseBody body;

    private DescribeSplitItemBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSplitItemBillResponse create() {
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
    public DescribeSplitItemBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSplitItemBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSplitItemBillResponseBody body);

        @Override
        DescribeSplitItemBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSplitItemBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSplitItemBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSplitItemBillResponse response) {
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
        public Builder body(DescribeSplitItemBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSplitItemBillResponse build() {
            return new DescribeSplitItemBillResponse(this);
        } 

    } 

}
