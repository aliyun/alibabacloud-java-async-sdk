// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePluginResponse} extends {@link TeaModel}
 *
 * <p>CreatePluginResponse</p>
 */
public class CreatePluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePluginResponseBody body;

    private CreatePluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePluginResponse create() {
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
    public CreatePluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePluginResponseBody body);

        @Override
        CreatePluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePluginResponse response) {
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
        public Builder body(CreatePluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePluginResponse build() {
            return new CreatePluginResponse(this);
        } 

    } 

}
