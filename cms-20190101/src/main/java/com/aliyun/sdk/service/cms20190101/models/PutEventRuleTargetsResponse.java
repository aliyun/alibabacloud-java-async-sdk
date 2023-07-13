// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEventRuleTargetsResponse} extends {@link TeaModel}
 *
 * <p>PutEventRuleTargetsResponse</p>
 */
public class PutEventRuleTargetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutEventRuleTargetsResponseBody body;

    private PutEventRuleTargetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutEventRuleTargetsResponse create() {
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
    public PutEventRuleTargetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutEventRuleTargetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutEventRuleTargetsResponseBody body);

        @Override
        PutEventRuleTargetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutEventRuleTargetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutEventRuleTargetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutEventRuleTargetsResponse response) {
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
        public Builder body(PutEventRuleTargetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutEventRuleTargetsResponse build() {
            return new PutEventRuleTargetsResponse(this);
        } 

    } 

}
