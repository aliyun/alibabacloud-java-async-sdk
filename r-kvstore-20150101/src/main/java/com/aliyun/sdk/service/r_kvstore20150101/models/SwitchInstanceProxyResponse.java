// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchInstanceProxyResponse} extends {@link TeaModel}
 *
 * <p>SwitchInstanceProxyResponse</p>
 */
public class SwitchInstanceProxyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchInstanceProxyResponseBody body;

    private SwitchInstanceProxyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchInstanceProxyResponse create() {
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
    public SwitchInstanceProxyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchInstanceProxyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchInstanceProxyResponseBody body);

        @Override
        SwitchInstanceProxyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchInstanceProxyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchInstanceProxyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchInstanceProxyResponse response) {
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
        public Builder body(SwitchInstanceProxyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchInstanceProxyResponse build() {
            return new SwitchInstanceProxyResponse(this);
        } 

    } 

}
