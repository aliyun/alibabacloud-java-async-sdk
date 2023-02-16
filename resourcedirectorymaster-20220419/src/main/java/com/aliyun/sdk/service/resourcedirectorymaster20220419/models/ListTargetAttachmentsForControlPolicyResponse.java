// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTargetAttachmentsForControlPolicyResponse} extends {@link TeaModel}
 *
 * <p>ListTargetAttachmentsForControlPolicyResponse</p>
 */
public class ListTargetAttachmentsForControlPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTargetAttachmentsForControlPolicyResponseBody body;

    private ListTargetAttachmentsForControlPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTargetAttachmentsForControlPolicyResponse create() {
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
    public ListTargetAttachmentsForControlPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTargetAttachmentsForControlPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTargetAttachmentsForControlPolicyResponseBody body);

        @Override
        ListTargetAttachmentsForControlPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTargetAttachmentsForControlPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTargetAttachmentsForControlPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTargetAttachmentsForControlPolicyResponse response) {
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
        public Builder body(ListTargetAttachmentsForControlPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTargetAttachmentsForControlPolicyResponse build() {
            return new ListTargetAttachmentsForControlPolicyResponse(this);
        } 

    } 

}
