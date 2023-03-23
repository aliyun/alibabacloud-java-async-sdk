// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantTemplateAuthorityResponse} extends {@link TeaModel}
 *
 * <p>GrantTemplateAuthorityResponse</p>
 */
public class GrantTemplateAuthorityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantTemplateAuthorityResponseBody body;

    private GrantTemplateAuthorityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantTemplateAuthorityResponse create() {
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
    public GrantTemplateAuthorityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantTemplateAuthorityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantTemplateAuthorityResponseBody body);

        @Override
        GrantTemplateAuthorityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantTemplateAuthorityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantTemplateAuthorityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantTemplateAuthorityResponse response) {
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
        public Builder body(GrantTemplateAuthorityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantTemplateAuthorityResponse build() {
            return new GrantTemplateAuthorityResponse(this);
        } 

    } 

}
