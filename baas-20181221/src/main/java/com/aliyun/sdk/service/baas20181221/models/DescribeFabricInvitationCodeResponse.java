// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricInvitationCodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeFabricInvitationCodeResponse</p>
 */
public class DescribeFabricInvitationCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFabricInvitationCodeResponseBody body;

    private DescribeFabricInvitationCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFabricInvitationCodeResponse create() {
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
    public DescribeFabricInvitationCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFabricInvitationCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFabricInvitationCodeResponseBody body);

        @Override
        DescribeFabricInvitationCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFabricInvitationCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFabricInvitationCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFabricInvitationCodeResponse response) {
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
        public Builder body(DescribeFabricInvitationCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFabricInvitationCodeResponse build() {
            return new DescribeFabricInvitationCodeResponse(this);
        } 

    } 

}
