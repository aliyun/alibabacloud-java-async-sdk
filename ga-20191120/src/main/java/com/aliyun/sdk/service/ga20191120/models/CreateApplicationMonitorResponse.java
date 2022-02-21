// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationMonitorResponse} extends {@link TeaModel}
 *
 * <p>CreateApplicationMonitorResponse</p>
 */
public class CreateApplicationMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateApplicationMonitorResponseBody body;

    private CreateApplicationMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateApplicationMonitorResponse create() {
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
    public CreateApplicationMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateApplicationMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateApplicationMonitorResponseBody body);

        @Override
        CreateApplicationMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateApplicationMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateApplicationMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateApplicationMonitorResponse response) {
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
        public Builder body(CreateApplicationMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateApplicationMonitorResponse build() {
            return new CreateApplicationMonitorResponse(this);
        } 

    } 

}
