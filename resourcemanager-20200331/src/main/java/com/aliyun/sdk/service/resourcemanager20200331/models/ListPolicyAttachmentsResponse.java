// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyAttachmentsResponse} extends {@link TeaModel}
 *
 * <p>ListPolicyAttachmentsResponse</p>
 */
public class ListPolicyAttachmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPolicyAttachmentsResponseBody body;

    private ListPolicyAttachmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPolicyAttachmentsResponse create() {
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
    public ListPolicyAttachmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPolicyAttachmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPolicyAttachmentsResponseBody body);

        @Override
        ListPolicyAttachmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPolicyAttachmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPolicyAttachmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPolicyAttachmentsResponse response) {
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
        public Builder body(ListPolicyAttachmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPolicyAttachmentsResponse build() {
            return new ListPolicyAttachmentsResponse(this);
        } 

    } 

}
