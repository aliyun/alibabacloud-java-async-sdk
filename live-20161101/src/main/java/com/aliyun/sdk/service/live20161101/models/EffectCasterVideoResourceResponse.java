// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EffectCasterVideoResourceResponse} extends {@link TeaModel}
 *
 * <p>EffectCasterVideoResourceResponse</p>
 */
public class EffectCasterVideoResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EffectCasterVideoResourceResponseBody body;

    private EffectCasterVideoResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EffectCasterVideoResourceResponse create() {
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
    public EffectCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EffectCasterVideoResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EffectCasterVideoResourceResponseBody body);

        @Override
        EffectCasterVideoResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EffectCasterVideoResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EffectCasterVideoResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EffectCasterVideoResourceResponse response) {
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
        public Builder body(EffectCasterVideoResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EffectCasterVideoResourceResponse build() {
            return new EffectCasterVideoResourceResponse(this);
        } 

    } 

}
