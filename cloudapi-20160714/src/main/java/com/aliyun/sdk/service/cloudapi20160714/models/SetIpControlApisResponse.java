// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIpControlApisResponse} extends {@link TeaModel}
 *
 * <p>SetIpControlApisResponse</p>
 */
public class SetIpControlApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetIpControlApisResponseBody body;

    private SetIpControlApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetIpControlApisResponse create() {
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
    public SetIpControlApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetIpControlApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetIpControlApisResponseBody body);

        @Override
        SetIpControlApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetIpControlApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetIpControlApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetIpControlApisResponse response) {
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
        public Builder body(SetIpControlApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetIpControlApisResponse build() {
            return new SetIpControlApisResponse(this);
        } 

    } 

}
