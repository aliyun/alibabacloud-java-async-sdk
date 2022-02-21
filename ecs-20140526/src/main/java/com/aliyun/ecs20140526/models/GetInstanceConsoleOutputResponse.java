// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsoleOutputResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceConsoleOutputResponse</p>
 */
public class GetInstanceConsoleOutputResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceConsoleOutputResponseBody body;

    private GetInstanceConsoleOutputResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceConsoleOutputResponse create() {
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
    public GetInstanceConsoleOutputResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceConsoleOutputResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceConsoleOutputResponseBody body);

        @Override
        GetInstanceConsoleOutputResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceConsoleOutputResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceConsoleOutputResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceConsoleOutputResponse response) {
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
        public Builder body(GetInstanceConsoleOutputResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceConsoleOutputResponse build() {
            return new GetInstanceConsoleOutputResponse(this);
        } 

    } 

}
