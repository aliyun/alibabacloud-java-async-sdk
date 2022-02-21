// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMonitorResponse} extends {@link TeaModel}
 *
 * <p>UpdateMonitorResponse</p>
 */
public class UpdateMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMonitorResponseBody body;

    private UpdateMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMonitorResponse create() {
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
    public UpdateMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMonitorResponseBody body);

        @Override
        UpdateMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMonitorResponse response) {
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
        public Builder body(UpdateMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMonitorResponse build() {
            return new UpdateMonitorResponse(this);
        } 

    } 

}
