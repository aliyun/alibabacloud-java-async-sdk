// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGroupAuthorizationRuleAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateGroupAuthorizationRuleAttributeResponse</p>
 */
public class UpdateGroupAuthorizationRuleAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGroupAuthorizationRuleAttributeResponseBody body;

    private UpdateGroupAuthorizationRuleAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGroupAuthorizationRuleAttributeResponse create() {
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
    public UpdateGroupAuthorizationRuleAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGroupAuthorizationRuleAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGroupAuthorizationRuleAttributeResponseBody body);

        @Override
        UpdateGroupAuthorizationRuleAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGroupAuthorizationRuleAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGroupAuthorizationRuleAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGroupAuthorizationRuleAttributeResponse response) {
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
        public Builder body(UpdateGroupAuthorizationRuleAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGroupAuthorizationRuleAttributeResponse build() {
            return new UpdateGroupAuthorizationRuleAttributeResponse(this);
        } 

    } 

}
