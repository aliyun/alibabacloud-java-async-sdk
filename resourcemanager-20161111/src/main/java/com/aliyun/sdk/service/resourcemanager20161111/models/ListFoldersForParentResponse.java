// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFoldersForParentResponse} extends {@link TeaModel}
 *
 * <p>ListFoldersForParentResponse</p>
 */
public class ListFoldersForParentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFoldersForParentResponseBody body;

    private ListFoldersForParentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFoldersForParentResponse create() {
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
    public ListFoldersForParentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFoldersForParentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFoldersForParentResponseBody body);

        @Override
        ListFoldersForParentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFoldersForParentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFoldersForParentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFoldersForParentResponse response) {
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
        public Builder body(ListFoldersForParentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFoldersForParentResponse build() {
            return new ListFoldersForParentResponse(this);
        } 

    } 

}
