// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsServiceLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeDtsServiceLogResponse</p>
 */
public class DescribeDtsServiceLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDtsServiceLogResponseBody body;

    private DescribeDtsServiceLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDtsServiceLogResponse create() {
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
    public DescribeDtsServiceLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDtsServiceLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDtsServiceLogResponseBody body);

        @Override
        DescribeDtsServiceLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDtsServiceLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDtsServiceLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDtsServiceLogResponse response) {
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
        public Builder body(DescribeDtsServiceLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDtsServiceLogResponse build() {
            return new DescribeDtsServiceLogResponse(this);
        } 

    } 

}
