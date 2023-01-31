// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveEffectiveDaysResponse} extends {@link TeaModel}
 *
 * <p>SaveEffectiveDaysResponse</p>
 */
public class SaveEffectiveDaysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveEffectiveDaysResponseBody body;

    private SaveEffectiveDaysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveEffectiveDaysResponse create() {
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
    public SaveEffectiveDaysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveEffectiveDaysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveEffectiveDaysResponseBody body);

        @Override
        SaveEffectiveDaysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveEffectiveDaysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveEffectiveDaysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveEffectiveDaysResponse response) {
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
        public Builder body(SaveEffectiveDaysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveEffectiveDaysResponse build() {
            return new SaveEffectiveDaysResponse(this);
        } 

    } 

}
