// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleTargetAllResponse} extends {@link TeaModel}
 *
 * <p>ListRuleTargetAllResponse</p>
 */
public class ListRuleTargetAllResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRuleTargetAllResponseBody body;

    private ListRuleTargetAllResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRuleTargetAllResponse create() {
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
    public ListRuleTargetAllResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRuleTargetAllResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRuleTargetAllResponseBody body);

        @Override
        ListRuleTargetAllResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRuleTargetAllResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRuleTargetAllResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRuleTargetAllResponse response) {
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
        public Builder body(ListRuleTargetAllResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRuleTargetAllResponse build() {
            return new ListRuleTargetAllResponse(this);
        } 

    } 

}
