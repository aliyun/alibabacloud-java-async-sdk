// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceFoldersResponse} extends {@link TeaModel}
 *
 * <p>ListDataServiceFoldersResponse</p>
 */
public class ListDataServiceFoldersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataServiceFoldersResponseBody body;

    private ListDataServiceFoldersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataServiceFoldersResponse create() {
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
    public ListDataServiceFoldersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataServiceFoldersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataServiceFoldersResponseBody body);

        @Override
        ListDataServiceFoldersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataServiceFoldersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataServiceFoldersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataServiceFoldersResponse response) {
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
        public Builder body(ListDataServiceFoldersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataServiceFoldersResponse build() {
            return new ListDataServiceFoldersResponse(this);
        } 

    } 

}
