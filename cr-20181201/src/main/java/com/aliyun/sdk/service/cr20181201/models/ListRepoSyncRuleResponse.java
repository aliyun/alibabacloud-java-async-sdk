// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoSyncRuleResponse} extends {@link TeaModel}
 *
 * <p>ListRepoSyncRuleResponse</p>
 */
public class ListRepoSyncRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepoSyncRuleResponseBody body;

    private ListRepoSyncRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepoSyncRuleResponse create() {
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
    public ListRepoSyncRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepoSyncRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepoSyncRuleResponseBody body);

        @Override
        ListRepoSyncRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepoSyncRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepoSyncRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepoSyncRuleResponse response) {
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
        public Builder body(ListRepoSyncRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepoSyncRuleResponse build() {
            return new ListRepoSyncRuleResponse(this);
        } 

    } 

}
