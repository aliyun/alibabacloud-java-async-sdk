// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTraficMatchRuleToTrafficMarkingPolicyResponse} extends {@link TeaModel}
 *
 * <p>AddTraficMatchRuleToTrafficMarkingPolicyResponse</p>
 */
public class AddTraficMatchRuleToTrafficMarkingPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddTraficMatchRuleToTrafficMarkingPolicyResponseBody body;

    private AddTraficMatchRuleToTrafficMarkingPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddTraficMatchRuleToTrafficMarkingPolicyResponse create() {
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
    public AddTraficMatchRuleToTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddTraficMatchRuleToTrafficMarkingPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddTraficMatchRuleToTrafficMarkingPolicyResponseBody body);

        @Override
        AddTraficMatchRuleToTrafficMarkingPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddTraficMatchRuleToTrafficMarkingPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddTraficMatchRuleToTrafficMarkingPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddTraficMatchRuleToTrafficMarkingPolicyResponse response) {
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
        public Builder body(AddTraficMatchRuleToTrafficMarkingPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddTraficMatchRuleToTrafficMarkingPolicyResponse build() {
            return new AddTraficMatchRuleToTrafficMarkingPolicyResponse(this);
        } 

    } 

}
