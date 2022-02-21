// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplySecondLevelMonitorResponse} extends {@link TeaModel}
 *
 * <p>ApplySecondLevelMonitorResponse</p>
 */
public class ApplySecondLevelMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplySecondLevelMonitorResponseBody body;

    private ApplySecondLevelMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplySecondLevelMonitorResponse create() {
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
    public ApplySecondLevelMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplySecondLevelMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplySecondLevelMonitorResponseBody body);

        @Override
        ApplySecondLevelMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplySecondLevelMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplySecondLevelMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplySecondLevelMonitorResponse response) {
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
        public Builder body(ApplySecondLevelMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplySecondLevelMonitorResponse build() {
            return new ApplySecondLevelMonitorResponse(this);
        } 

    } 

}
