// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationObjectModifyStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationObjectModifyStatusResponse</p>
 */
public class DescribeSynchronizationObjectModifyStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSynchronizationObjectModifyStatusResponseBody body;

    private DescribeSynchronizationObjectModifyStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSynchronizationObjectModifyStatusResponse create() {
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
    public DescribeSynchronizationObjectModifyStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSynchronizationObjectModifyStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSynchronizationObjectModifyStatusResponseBody body);

        @Override
        DescribeSynchronizationObjectModifyStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSynchronizationObjectModifyStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSynchronizationObjectModifyStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSynchronizationObjectModifyStatusResponse response) {
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
        public Builder body(DescribeSynchronizationObjectModifyStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSynchronizationObjectModifyStatusResponse build() {
            return new DescribeSynchronizationObjectModifyStatusResponse(this);
        } 

    } 

}
