// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceDLinkResponse} extends {@link TeaModel}
 *
 * <p>UpdateResourceDLinkResponse</p>
 */
public class UpdateResourceDLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateResourceDLinkResponseBody body;

    private UpdateResourceDLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateResourceDLinkResponse create() {
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
    public UpdateResourceDLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateResourceDLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateResourceDLinkResponseBody body);

        @Override
        UpdateResourceDLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateResourceDLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateResourceDLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateResourceDLinkResponse response) {
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
        public Builder body(UpdateResourceDLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateResourceDLinkResponse build() {
            return new UpdateResourceDLinkResponse(this);
        } 

    } 

}
