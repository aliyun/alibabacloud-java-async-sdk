// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KWEResponse} extends {@link TeaModel}
 *
 * <p>KWEResponse</p>
 */
public class KWEResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private KWEResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static KWEResponse create() {
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

    public interface Builder extends Response.Builder<KWEResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        KWEResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KWEResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KWEResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public KWEResponse build() {
            return new KWEResponse(this);
        } 

    } 

}
