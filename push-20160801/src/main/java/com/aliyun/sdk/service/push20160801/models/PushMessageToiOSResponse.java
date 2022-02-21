// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMessageToiOSResponse} extends {@link TeaModel}
 *
 * <p>PushMessageToiOSResponse</p>
 */
public class PushMessageToiOSResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushMessageToiOSResponseBody body;

    private PushMessageToiOSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushMessageToiOSResponse create() {
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
    public PushMessageToiOSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushMessageToiOSResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushMessageToiOSResponseBody body);

        @Override
        PushMessageToiOSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushMessageToiOSResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushMessageToiOSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushMessageToiOSResponse response) {
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
        public Builder body(PushMessageToiOSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushMessageToiOSResponse build() {
            return new PushMessageToiOSResponse(this);
        } 

    } 

}
