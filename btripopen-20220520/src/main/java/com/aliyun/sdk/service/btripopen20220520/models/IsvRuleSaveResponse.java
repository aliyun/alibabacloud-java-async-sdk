// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsvRuleSaveResponse} extends {@link TeaModel}
 *
 * <p>IsvRuleSaveResponse</p>
 */
public class IsvRuleSaveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IsvRuleSaveResponseBody body;

    private IsvRuleSaveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IsvRuleSaveResponse create() {
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
    public IsvRuleSaveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IsvRuleSaveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IsvRuleSaveResponseBody body);

        @Override
        IsvRuleSaveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IsvRuleSaveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IsvRuleSaveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IsvRuleSaveResponse response) {
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
        public Builder body(IsvRuleSaveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IsvRuleSaveResponse build() {
            return new IsvRuleSaveResponse(this);
        } 

    } 

}
