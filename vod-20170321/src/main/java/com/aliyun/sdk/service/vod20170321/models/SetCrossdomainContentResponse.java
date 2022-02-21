// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCrossdomainContentResponse} extends {@link TeaModel}
 *
 * <p>SetCrossdomainContentResponse</p>
 */
public class SetCrossdomainContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCrossdomainContentResponseBody body;

    private SetCrossdomainContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCrossdomainContentResponse create() {
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
    public SetCrossdomainContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCrossdomainContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCrossdomainContentResponseBody body);

        @Override
        SetCrossdomainContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCrossdomainContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCrossdomainContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCrossdomainContentResponse response) {
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
        public Builder body(SetCrossdomainContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCrossdomainContentResponse build() {
            return new SetCrossdomainContentResponse(this);
        } 

    } 

}
