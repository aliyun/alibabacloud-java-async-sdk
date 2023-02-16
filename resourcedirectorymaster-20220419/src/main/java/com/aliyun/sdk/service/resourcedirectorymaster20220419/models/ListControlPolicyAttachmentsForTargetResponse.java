// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListControlPolicyAttachmentsForTargetResponse} extends {@link TeaModel}
 *
 * <p>ListControlPolicyAttachmentsForTargetResponse</p>
 */
public class ListControlPolicyAttachmentsForTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListControlPolicyAttachmentsForTargetResponseBody body;

    private ListControlPolicyAttachmentsForTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListControlPolicyAttachmentsForTargetResponse create() {
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
    public ListControlPolicyAttachmentsForTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListControlPolicyAttachmentsForTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListControlPolicyAttachmentsForTargetResponseBody body);

        @Override
        ListControlPolicyAttachmentsForTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListControlPolicyAttachmentsForTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListControlPolicyAttachmentsForTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListControlPolicyAttachmentsForTargetResponse response) {
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
        public Builder body(ListControlPolicyAttachmentsForTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListControlPolicyAttachmentsForTargetResponse build() {
            return new ListControlPolicyAttachmentsForTargetResponse(this);
        } 

    } 

}
