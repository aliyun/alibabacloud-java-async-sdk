// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse} extends {@link TeaModel}
 *
 * <p>RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse</p>
 */
public class RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody body;

    private RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse create() {
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
    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody body);

        @Override
        RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse response) {
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
        public Builder body(RemoveTraficMatchRuleFromTrafficMarkingPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse build() {
            return new RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse(this);
        } 

    } 

}
