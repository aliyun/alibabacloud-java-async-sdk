// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeQualityPunishmentResponse} extends {@link TeaModel}
 *
 * <p>GetOcNegativeQualityPunishmentResponse</p>
 */
public class GetOcNegativeQualityPunishmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcNegativeQualityPunishmentResponseBody body;

    private GetOcNegativeQualityPunishmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcNegativeQualityPunishmentResponse create() {
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
    public GetOcNegativeQualityPunishmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcNegativeQualityPunishmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcNegativeQualityPunishmentResponseBody body);

        @Override
        GetOcNegativeQualityPunishmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcNegativeQualityPunishmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcNegativeQualityPunishmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcNegativeQualityPunishmentResponse response) {
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
        public Builder body(GetOcNegativeQualityPunishmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcNegativeQualityPunishmentResponse build() {
            return new GetOcNegativeQualityPunishmentResponse(this);
        } 

    } 

}
