// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachWhitelistTemplateToInstanceResponse} extends {@link TeaModel}
 *
 * <p>AttachWhitelistTemplateToInstanceResponse</p>
 */
public class AttachWhitelistTemplateToInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachWhitelistTemplateToInstanceResponseBody body;

    private AttachWhitelistTemplateToInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachWhitelistTemplateToInstanceResponse create() {
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
    public AttachWhitelistTemplateToInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachWhitelistTemplateToInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachWhitelistTemplateToInstanceResponseBody body);

        @Override
        AttachWhitelistTemplateToInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachWhitelistTemplateToInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachWhitelistTemplateToInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachWhitelistTemplateToInstanceResponse response) {
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
        public Builder body(AttachWhitelistTemplateToInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachWhitelistTemplateToInstanceResponse build() {
            return new AttachWhitelistTemplateToInstanceResponse(this);
        } 

    } 

}
