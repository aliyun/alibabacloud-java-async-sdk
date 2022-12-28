// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetClusterInterceptionConfigResponse} extends {@link TeaModel}
 *
 * <p>SetClusterInterceptionConfigResponse</p>
 */
public class SetClusterInterceptionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetClusterInterceptionConfigResponseBody body;

    private SetClusterInterceptionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetClusterInterceptionConfigResponse create() {
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
    public SetClusterInterceptionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetClusterInterceptionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetClusterInterceptionConfigResponseBody body);

        @Override
        SetClusterInterceptionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetClusterInterceptionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetClusterInterceptionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetClusterInterceptionConfigResponse response) {
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
        public Builder body(SetClusterInterceptionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetClusterInterceptionConfigResponse build() {
            return new SetClusterInterceptionConfigResponse(this);
        } 

    } 

}
