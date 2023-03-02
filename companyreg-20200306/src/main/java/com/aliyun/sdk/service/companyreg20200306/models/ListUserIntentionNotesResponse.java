// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserIntentionNotesResponse} extends {@link TeaModel}
 *
 * <p>ListUserIntentionNotesResponse</p>
 */
public class ListUserIntentionNotesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserIntentionNotesResponseBody body;

    private ListUserIntentionNotesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserIntentionNotesResponse create() {
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
    public ListUserIntentionNotesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserIntentionNotesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserIntentionNotesResponseBody body);

        @Override
        ListUserIntentionNotesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserIntentionNotesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserIntentionNotesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserIntentionNotesResponse response) {
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
        public Builder body(ListUserIntentionNotesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserIntentionNotesResponse build() {
            return new ListUserIntentionNotesResponse(this);
        } 

    } 

}
