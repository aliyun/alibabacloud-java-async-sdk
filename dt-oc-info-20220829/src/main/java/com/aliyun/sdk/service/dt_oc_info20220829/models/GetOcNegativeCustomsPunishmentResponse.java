// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeCustomsPunishmentResponse} extends {@link TeaModel}
 *
 * <p>GetOcNegativeCustomsPunishmentResponse</p>
 */
public class GetOcNegativeCustomsPunishmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcNegativeCustomsPunishmentResponseBody body;

    private GetOcNegativeCustomsPunishmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcNegativeCustomsPunishmentResponse create() {
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
    public GetOcNegativeCustomsPunishmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcNegativeCustomsPunishmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcNegativeCustomsPunishmentResponseBody body);

        @Override
        GetOcNegativeCustomsPunishmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcNegativeCustomsPunishmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcNegativeCustomsPunishmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcNegativeCustomsPunishmentResponse response) {
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
        public Builder body(GetOcNegativeCustomsPunishmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcNegativeCustomsPunishmentResponse build() {
            return new GetOcNegativeCustomsPunishmentResponse(this);
        } 

    } 

}
