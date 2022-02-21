// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSecondLevelMonitorResponse} extends {@link TeaModel}
 *
 * <p>CancelSecondLevelMonitorResponse</p>
 */
public class CancelSecondLevelMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelSecondLevelMonitorResponseBody body;

    private CancelSecondLevelMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelSecondLevelMonitorResponse create() {
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
    public CancelSecondLevelMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelSecondLevelMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelSecondLevelMonitorResponseBody body);

        @Override
        CancelSecondLevelMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelSecondLevelMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelSecondLevelMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelSecondLevelMonitorResponse response) {
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
        public Builder body(CancelSecondLevelMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelSecondLevelMonitorResponse build() {
            return new CancelSecondLevelMonitorResponse(this);
        } 

    } 

}
