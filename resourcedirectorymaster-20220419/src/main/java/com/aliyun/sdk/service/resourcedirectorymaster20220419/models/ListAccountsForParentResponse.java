// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountsForParentResponse} extends {@link TeaModel}
 *
 * <p>ListAccountsForParentResponse</p>
 */
public class ListAccountsForParentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAccountsForParentResponseBody body;

    private ListAccountsForParentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAccountsForParentResponse create() {
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
    public ListAccountsForParentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAccountsForParentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAccountsForParentResponseBody body);

        @Override
        ListAccountsForParentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAccountsForParentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAccountsForParentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAccountsForParentResponse response) {
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
        public Builder body(ListAccountsForParentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAccountsForParentResponse build() {
            return new ListAccountsForParentResponse(this);
        } 

    } 

}
