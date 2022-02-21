// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoTriggerResponse} extends {@link TeaModel}
 *
 * <p>ListRepoTriggerResponse</p>
 */
public class ListRepoTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepoTriggerResponseBody body;

    private ListRepoTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepoTriggerResponse create() {
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
    public ListRepoTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepoTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepoTriggerResponseBody body);

        @Override
        ListRepoTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepoTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepoTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepoTriggerResponse response) {
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
        public Builder body(ListRepoTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepoTriggerResponse build() {
            return new ListRepoTriggerResponse(this);
        } 

    } 

}
