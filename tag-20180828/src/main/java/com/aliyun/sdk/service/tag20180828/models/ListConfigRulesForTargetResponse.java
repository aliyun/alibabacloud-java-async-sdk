// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRulesForTargetResponse} extends {@link TeaModel}
 *
 * <p>ListConfigRulesForTargetResponse</p>
 */
public class ListConfigRulesForTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConfigRulesForTargetResponseBody body;

    private ListConfigRulesForTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConfigRulesForTargetResponse create() {
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
    public ListConfigRulesForTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigRulesForTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConfigRulesForTargetResponseBody body);

        @Override
        ListConfigRulesForTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigRulesForTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConfigRulesForTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigRulesForTargetResponse response) {
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
        public Builder body(ListConfigRulesForTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigRulesForTargetResponse build() {
            return new ListConfigRulesForTargetResponse(this);
        } 

    } 

}
