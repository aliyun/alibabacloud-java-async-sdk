// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEffectiveDaysResponse} extends {@link TeaModel}
 *
 * <p>GetEffectiveDaysResponse</p>
 */
public class GetEffectiveDaysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEffectiveDaysResponseBody body;

    private GetEffectiveDaysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEffectiveDaysResponse create() {
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
    public GetEffectiveDaysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEffectiveDaysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEffectiveDaysResponseBody body);

        @Override
        GetEffectiveDaysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEffectiveDaysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEffectiveDaysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEffectiveDaysResponse response) {
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
        public Builder body(GetEffectiveDaysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEffectiveDaysResponse build() {
            return new GetEffectiveDaysResponse(this);
        } 

    } 

}
