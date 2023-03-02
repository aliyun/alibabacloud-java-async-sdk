// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserIntentionsResponse} extends {@link TeaModel}
 *
 * <p>ListUserIntentionsResponse</p>
 */
public class ListUserIntentionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserIntentionsResponseBody body;

    private ListUserIntentionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserIntentionsResponse create() {
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
    public ListUserIntentionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserIntentionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserIntentionsResponseBody body);

        @Override
        ListUserIntentionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserIntentionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserIntentionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserIntentionsResponse response) {
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
        public Builder body(ListUserIntentionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserIntentionsResponse build() {
            return new ListUserIntentionsResponse(this);
        } 

    } 

}
