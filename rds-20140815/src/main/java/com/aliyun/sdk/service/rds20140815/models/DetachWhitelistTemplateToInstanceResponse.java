// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachWhitelistTemplateToInstanceResponse} extends {@link TeaModel}
 *
 * <p>DetachWhitelistTemplateToInstanceResponse</p>
 */
public class DetachWhitelistTemplateToInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachWhitelistTemplateToInstanceResponseBody body;

    private DetachWhitelistTemplateToInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachWhitelistTemplateToInstanceResponse create() {
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
    public DetachWhitelistTemplateToInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachWhitelistTemplateToInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachWhitelistTemplateToInstanceResponseBody body);

        @Override
        DetachWhitelistTemplateToInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachWhitelistTemplateToInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachWhitelistTemplateToInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachWhitelistTemplateToInstanceResponse response) {
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
        public Builder body(DetachWhitelistTemplateToInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachWhitelistTemplateToInstanceResponse build() {
            return new DetachWhitelistTemplateToInstanceResponse(this);
        } 

    } 

}
