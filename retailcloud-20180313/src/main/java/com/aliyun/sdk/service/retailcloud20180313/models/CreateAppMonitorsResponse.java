// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppMonitorsResponse} extends {@link TeaModel}
 *
 * <p>CreateAppMonitorsResponse</p>
 */
public class CreateAppMonitorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAppMonitorsResponseBody body;

    private CreateAppMonitorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAppMonitorsResponse create() {
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
    public CreateAppMonitorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAppMonitorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAppMonitorsResponseBody body);

        @Override
        CreateAppMonitorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAppMonitorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAppMonitorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAppMonitorsResponse response) {
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
        public Builder body(CreateAppMonitorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAppMonitorsResponse build() {
            return new CreateAppMonitorsResponse(this);
        } 

    } 

}
