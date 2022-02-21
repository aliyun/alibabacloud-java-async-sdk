// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMonitorResponse} extends {@link TeaModel}
 *
 * <p>AddMonitorResponse</p>
 */
public class AddMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMonitorResponseBody body;

    private AddMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMonitorResponse create() {
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
    public AddMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMonitorResponseBody body);

        @Override
        AddMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMonitorResponse response) {
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
        public Builder body(AddMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMonitorResponse build() {
            return new AddMonitorResponse(this);
        } 

    } 

}
