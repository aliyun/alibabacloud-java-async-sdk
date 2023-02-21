// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeFoodDrugPunishmentResponse} extends {@link TeaModel}
 *
 * <p>GetOcNegativeFoodDrugPunishmentResponse</p>
 */
public class GetOcNegativeFoodDrugPunishmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcNegativeFoodDrugPunishmentResponseBody body;

    private GetOcNegativeFoodDrugPunishmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcNegativeFoodDrugPunishmentResponse create() {
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
    public GetOcNegativeFoodDrugPunishmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcNegativeFoodDrugPunishmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcNegativeFoodDrugPunishmentResponseBody body);

        @Override
        GetOcNegativeFoodDrugPunishmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcNegativeFoodDrugPunishmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcNegativeFoodDrugPunishmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcNegativeFoodDrugPunishmentResponse response) {
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
        public Builder body(GetOcNegativeFoodDrugPunishmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcNegativeFoodDrugPunishmentResponse build() {
            return new GetOcNegativeFoodDrugPunishmentResponse(this);
        } 

    } 

}
