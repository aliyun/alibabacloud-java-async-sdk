// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EffectCasterUrgentResponse} extends {@link TeaModel}
 *
 * <p>EffectCasterUrgentResponse</p>
 */
public class EffectCasterUrgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EffectCasterUrgentResponseBody body;

    private EffectCasterUrgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EffectCasterUrgentResponse create() {
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
    public EffectCasterUrgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EffectCasterUrgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EffectCasterUrgentResponseBody body);

        @Override
        EffectCasterUrgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EffectCasterUrgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EffectCasterUrgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EffectCasterUrgentResponse response) {
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
        public Builder body(EffectCasterUrgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EffectCasterUrgentResponse build() {
            return new EffectCasterUrgentResponse(this);
        } 

    } 

}
