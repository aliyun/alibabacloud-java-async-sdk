// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksResponse} extends {@link TeaModel}
 *
 * <p>ListTasksResponse</p>
 */
public class ListTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < Task > body;

    private ListTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTasksResponse create() {
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
    public java.util.List < Task > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < Task > body);

        @Override
        ListTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < Task > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTasksResponse response) {
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
        public Builder body(java.util.List < Task > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTasksResponse build() {
            return new ListTasksResponse(this);
        } 

    } 

}
