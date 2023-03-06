// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTrafficMatchRuleToTrafficMarkingPolicyResponse} extends {@link TeaModel}
 *
 * <p>AddTrafficMatchRuleToTrafficMarkingPolicyResponse</p>
 */
public class AddTrafficMatchRuleToTrafficMarkingPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody body;

    private AddTrafficMatchRuleToTrafficMarkingPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddTrafficMatchRuleToTrafficMarkingPolicyResponse create() {
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
    public AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddTrafficMatchRuleToTrafficMarkingPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody body);

        @Override
        AddTrafficMatchRuleToTrafficMarkingPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddTrafficMatchRuleToTrafficMarkingPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddTrafficMatchRuleToTrafficMarkingPolicyResponse response) {
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
        public Builder body(AddTrafficMatchRuleToTrafficMarkingPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddTrafficMatchRuleToTrafficMarkingPolicyResponse build() {
            return new AddTrafficMatchRuleToTrafficMarkingPolicyResponse(this);
        } 

    } 

}
