// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachPluginResponse} extends {@link TeaModel}
 *
 * <p>AttachPluginResponse</p>
 */
public class AttachPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachPluginResponseBody body;

    private AttachPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachPluginResponse create() {
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
    public AttachPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachPluginResponseBody body);

        @Override
        AttachPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachPluginResponse response) {
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
        public Builder body(AttachPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachPluginResponse build() {
            return new AttachPluginResponse(this);
        } 

    } 

}
