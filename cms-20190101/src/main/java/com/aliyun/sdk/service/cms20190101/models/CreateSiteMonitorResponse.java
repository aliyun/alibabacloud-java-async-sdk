// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSiteMonitorResponse} extends {@link TeaModel}
 *
 * <p>CreateSiteMonitorResponse</p>
 */
public class CreateSiteMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSiteMonitorResponseBody body;

    private CreateSiteMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSiteMonitorResponse create() {
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
    public CreateSiteMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSiteMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSiteMonitorResponseBody body);

        @Override
        CreateSiteMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSiteMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSiteMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSiteMonitorResponse response) {
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
        public Builder body(CreateSiteMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSiteMonitorResponse build() {
            return new CreateSiteMonitorResponse(this);
        } 

    } 

}
