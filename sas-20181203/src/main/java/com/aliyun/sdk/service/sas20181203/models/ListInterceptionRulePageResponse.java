// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionRulePageResponse} extends {@link TeaModel}
 *
 * <p>ListInterceptionRulePageResponse</p>
 */
public class ListInterceptionRulePageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInterceptionRulePageResponseBody body;

    private ListInterceptionRulePageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInterceptionRulePageResponse create() {
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
    public ListInterceptionRulePageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInterceptionRulePageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInterceptionRulePageResponseBody body);

        @Override
        ListInterceptionRulePageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInterceptionRulePageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInterceptionRulePageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInterceptionRulePageResponse response) {
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
        public Builder body(ListInterceptionRulePageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInterceptionRulePageResponse build() {
            return new ListInterceptionRulePageResponse(this);
        } 

    } 

}
