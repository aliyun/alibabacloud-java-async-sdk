// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceMonitorResponse} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceMonitorResponse</p>
 */
public class DescribeDrdsInstanceMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDrdsInstanceMonitorResponseBody body;

    private DescribeDrdsInstanceMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDrdsInstanceMonitorResponse create() {
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
    public DescribeDrdsInstanceMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDrdsInstanceMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDrdsInstanceMonitorResponseBody body);

        @Override
        DescribeDrdsInstanceMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDrdsInstanceMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDrdsInstanceMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDrdsInstanceMonitorResponse response) {
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
        public Builder body(DescribeDrdsInstanceMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDrdsInstanceMonitorResponse build() {
            return new DescribeDrdsInstanceMonitorResponse(this);
        } 

    } 

}
