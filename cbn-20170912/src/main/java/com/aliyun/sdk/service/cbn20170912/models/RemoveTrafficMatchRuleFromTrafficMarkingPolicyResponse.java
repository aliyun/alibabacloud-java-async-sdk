// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse} extends {@link TeaModel}
 *
 * <p>RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse</p>
 */
public class RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody body;

    private RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse create() {
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
    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody body);

        @Override
        RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse response) {
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
        public Builder body(RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse build() {
            return new RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse(this);
        } 

    } 

}
