// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MassPushResponse} extends {@link TeaModel}
 *
 * <p>MassPushResponse</p>
 */
public class MassPushResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MassPushResponseBody body;

    private MassPushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MassPushResponse create() {
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
    public MassPushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MassPushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MassPushResponseBody body);

        @Override
        MassPushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MassPushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MassPushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MassPushResponse response) {
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
        public Builder body(MassPushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MassPushResponse build() {
            return new MassPushResponse(this);
        } 

    } 

}
