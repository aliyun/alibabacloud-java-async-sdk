// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskSecondLevelMonitorResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskSecondLevelMonitorResponse</p>
 */
public class DescribeDiskSecondLevelMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiskSecondLevelMonitorResponseBody body;

    private DescribeDiskSecondLevelMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiskSecondLevelMonitorResponse create() {
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
    public DescribeDiskSecondLevelMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskSecondLevelMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiskSecondLevelMonitorResponseBody body);

        @Override
        DescribeDiskSecondLevelMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskSecondLevelMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiskSecondLevelMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskSecondLevelMonitorResponse response) {
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
        public Builder body(DescribeDiskSecondLevelMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskSecondLevelMonitorResponse build() {
            return new DescribeDiskSecondLevelMonitorResponse(this);
        } 

    } 

}
