// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiPartyCollaborationChainResponse} extends {@link TeaModel}
 *
 * <p>ListMultiPartyCollaborationChainResponse</p>
 */
public class ListMultiPartyCollaborationChainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMultiPartyCollaborationChainResponseBody body;

    private ListMultiPartyCollaborationChainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMultiPartyCollaborationChainResponse create() {
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
    public ListMultiPartyCollaborationChainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMultiPartyCollaborationChainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMultiPartyCollaborationChainResponseBody body);

        @Override
        ListMultiPartyCollaborationChainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMultiPartyCollaborationChainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMultiPartyCollaborationChainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMultiPartyCollaborationChainResponse response) {
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
        public Builder body(ListMultiPartyCollaborationChainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMultiPartyCollaborationChainResponse build() {
            return new ListMultiPartyCollaborationChainResponse(this);
        } 

    } 

}
