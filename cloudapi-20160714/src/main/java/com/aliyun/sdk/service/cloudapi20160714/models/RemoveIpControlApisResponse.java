// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveIpControlApisResponse} extends {@link TeaModel}
 *
 * <p>RemoveIpControlApisResponse</p>
 */
public class RemoveIpControlApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveIpControlApisResponseBody body;

    private RemoveIpControlApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveIpControlApisResponse create() {
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
    public RemoveIpControlApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveIpControlApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveIpControlApisResponseBody body);

        @Override
        RemoveIpControlApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveIpControlApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveIpControlApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveIpControlApisResponse response) {
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
        public Builder body(RemoveIpControlApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveIpControlApisResponse build() {
            return new RemoveIpControlApisResponse(this);
        } 

    } 

}
