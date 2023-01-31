// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptPublishHistoriesResponse} extends {@link TeaModel}
 *
 * <p>ListScriptPublishHistoriesResponse</p>
 */
public class ListScriptPublishHistoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScriptPublishHistoriesResponseBody body;

    private ListScriptPublishHistoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScriptPublishHistoriesResponse create() {
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
    public ListScriptPublishHistoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScriptPublishHistoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScriptPublishHistoriesResponseBody body);

        @Override
        ListScriptPublishHistoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScriptPublishHistoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScriptPublishHistoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScriptPublishHistoriesResponse response) {
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
        public Builder body(ListScriptPublishHistoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScriptPublishHistoriesResponse build() {
            return new ListScriptPublishHistoriesResponse(this);
        } 

    } 

}
