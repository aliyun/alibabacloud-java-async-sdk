// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHybridMonitorTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateHybridMonitorTaskResponse</p>
 */
public class CreateHybridMonitorTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHybridMonitorTaskResponseBody body;

    private CreateHybridMonitorTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHybridMonitorTaskResponse create() {
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
    public CreateHybridMonitorTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHybridMonitorTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHybridMonitorTaskResponseBody body);

        @Override
        CreateHybridMonitorTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHybridMonitorTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHybridMonitorTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHybridMonitorTaskResponse response) {
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
        public Builder body(CreateHybridMonitorTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHybridMonitorTaskResponse build() {
            return new CreateHybridMonitorTaskResponse(this);
        } 

    } 

}
