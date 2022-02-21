// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClickToDialResponse} extends {@link TeaModel}
 *
 * <p>ClickToDialResponse</p>
 */
public class ClickToDialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClickToDialResponseBody body;

    private ClickToDialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ClickToDialResponse create() {
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
    public ClickToDialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClickToDialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ClickToDialResponseBody body);

        @Override
        ClickToDialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClickToDialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ClickToDialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClickToDialResponse response) {
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
        public Builder body(ClickToDialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClickToDialResponse build() {
            return new ClickToDialResponse(this);
        } 

    } 

}
