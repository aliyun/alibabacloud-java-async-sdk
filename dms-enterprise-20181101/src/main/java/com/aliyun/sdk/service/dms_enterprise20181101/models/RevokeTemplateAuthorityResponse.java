// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeTemplateAuthorityResponse} extends {@link TeaModel}
 *
 * <p>RevokeTemplateAuthorityResponse</p>
 */
public class RevokeTemplateAuthorityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeTemplateAuthorityResponseBody body;

    private RevokeTemplateAuthorityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeTemplateAuthorityResponse create() {
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
    public RevokeTemplateAuthorityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeTemplateAuthorityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeTemplateAuthorityResponseBody body);

        @Override
        RevokeTemplateAuthorityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeTemplateAuthorityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeTemplateAuthorityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeTemplateAuthorityResponse response) {
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
        public Builder body(RevokeTemplateAuthorityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeTemplateAuthorityResponse build() {
            return new RevokeTemplateAuthorityResponse(this);
        } 

    } 

}
