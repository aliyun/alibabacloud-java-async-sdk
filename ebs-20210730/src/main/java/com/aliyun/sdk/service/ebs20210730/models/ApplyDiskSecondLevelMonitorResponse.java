// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyDiskSecondLevelMonitorResponse} extends {@link TeaModel}
 *
 * <p>ApplyDiskSecondLevelMonitorResponse</p>
 */
public class ApplyDiskSecondLevelMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyDiskSecondLevelMonitorResponseBody body;

    private ApplyDiskSecondLevelMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyDiskSecondLevelMonitorResponse create() {
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
    public ApplyDiskSecondLevelMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyDiskSecondLevelMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyDiskSecondLevelMonitorResponseBody body);

        @Override
        ApplyDiskSecondLevelMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyDiskSecondLevelMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyDiskSecondLevelMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyDiskSecondLevelMonitorResponse response) {
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
        public Builder body(ApplyDiskSecondLevelMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyDiskSecondLevelMonitorResponse build() {
            return new ApplyDiskSecondLevelMonitorResponse(this);
        } 

    } 

}
