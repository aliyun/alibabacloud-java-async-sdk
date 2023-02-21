// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeAdminPunishmentResponse} extends {@link TeaModel}
 *
 * <p>GetOcNegativeAdminPunishmentResponse</p>
 */
public class GetOcNegativeAdminPunishmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcNegativeAdminPunishmentResponseBody body;

    private GetOcNegativeAdminPunishmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcNegativeAdminPunishmentResponse create() {
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
    public GetOcNegativeAdminPunishmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcNegativeAdminPunishmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcNegativeAdminPunishmentResponseBody body);

        @Override
        GetOcNegativeAdminPunishmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcNegativeAdminPunishmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcNegativeAdminPunishmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcNegativeAdminPunishmentResponse response) {
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
        public Builder body(GetOcNegativeAdminPunishmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcNegativeAdminPunishmentResponse build() {
            return new GetOcNegativeAdminPunishmentResponse(this);
        } 

    } 

}
