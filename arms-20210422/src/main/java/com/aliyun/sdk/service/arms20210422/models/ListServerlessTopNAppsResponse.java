// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerlessTopNAppsResponse} extends {@link TeaModel}
 *
 * <p>ListServerlessTopNAppsResponse</p>
 */
public class ListServerlessTopNAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServerlessTopNAppsResponseBody body;

    private ListServerlessTopNAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServerlessTopNAppsResponse create() {
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
    public ListServerlessTopNAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServerlessTopNAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServerlessTopNAppsResponseBody body);

        @Override
        ListServerlessTopNAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServerlessTopNAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServerlessTopNAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServerlessTopNAppsResponse response) {
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
        public Builder body(ListServerlessTopNAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServerlessTopNAppsResponse build() {
            return new ListServerlessTopNAppsResponse(this);
        } 

    } 

}
