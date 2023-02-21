// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeEnvironmentPunishmentResponse} extends {@link TeaModel}
 *
 * <p>GetOcNegativeEnvironmentPunishmentResponse</p>
 */
public class GetOcNegativeEnvironmentPunishmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcNegativeEnvironmentPunishmentResponseBody body;

    private GetOcNegativeEnvironmentPunishmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcNegativeEnvironmentPunishmentResponse create() {
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
    public GetOcNegativeEnvironmentPunishmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcNegativeEnvironmentPunishmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcNegativeEnvironmentPunishmentResponseBody body);

        @Override
        GetOcNegativeEnvironmentPunishmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcNegativeEnvironmentPunishmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcNegativeEnvironmentPunishmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcNegativeEnvironmentPunishmentResponse response) {
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
        public Builder body(GetOcNegativeEnvironmentPunishmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcNegativeEnvironmentPunishmentResponse build() {
            return new GetOcNegativeEnvironmentPunishmentResponse(this);
        } 

    } 

}
