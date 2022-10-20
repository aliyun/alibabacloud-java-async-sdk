// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleToSchemeResponse} extends {@link TeaModel}
 *
 * <p>UpdateRuleToSchemeResponse</p>
 */
public class UpdateRuleToSchemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRuleToSchemeResponseBody body;

    private UpdateRuleToSchemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRuleToSchemeResponse create() {
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
    public UpdateRuleToSchemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRuleToSchemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRuleToSchemeResponseBody body);

        @Override
        UpdateRuleToSchemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRuleToSchemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRuleToSchemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRuleToSchemeResponse response) {
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
        public Builder body(UpdateRuleToSchemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRuleToSchemeResponse build() {
            return new UpdateRuleToSchemeResponse(this);
        } 

    } 

}
