// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHybridMonitorSLSGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateHybridMonitorSLSGroupResponse</p>
 */
public class CreateHybridMonitorSLSGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHybridMonitorSLSGroupResponseBody body;

    private CreateHybridMonitorSLSGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHybridMonitorSLSGroupResponse create() {
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
    public CreateHybridMonitorSLSGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHybridMonitorSLSGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHybridMonitorSLSGroupResponseBody body);

        @Override
        CreateHybridMonitorSLSGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHybridMonitorSLSGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHybridMonitorSLSGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHybridMonitorSLSGroupResponse response) {
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
        public Builder body(CreateHybridMonitorSLSGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHybridMonitorSLSGroupResponse build() {
            return new CreateHybridMonitorSLSGroupResponse(this);
        } 

    } 

}
