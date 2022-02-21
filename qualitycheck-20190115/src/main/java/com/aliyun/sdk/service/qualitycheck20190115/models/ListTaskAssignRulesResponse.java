// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskAssignRulesResponse} extends {@link TeaModel}
 *
 * <p>ListTaskAssignRulesResponse</p>
 */
public class ListTaskAssignRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskAssignRulesResponseBody body;

    private ListTaskAssignRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskAssignRulesResponse create() {
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
    public ListTaskAssignRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskAssignRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaskAssignRulesResponseBody body);

        @Override
        ListTaskAssignRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskAssignRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaskAssignRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskAssignRulesResponse response) {
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
        public Builder body(ListTaskAssignRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskAssignRulesResponse build() {
            return new ListTaskAssignRulesResponse(this);
        } 

    } 

}
