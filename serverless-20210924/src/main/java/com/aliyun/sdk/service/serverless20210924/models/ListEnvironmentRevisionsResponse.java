// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentRevisionsResponse} extends {@link TeaModel}
 *
 * <p>ListEnvironmentRevisionsResponse</p>
 */
public class ListEnvironmentRevisionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < EnvironmentRevision > body;

    private ListEnvironmentRevisionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEnvironmentRevisionsResponse create() {
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
    public java.util.List < EnvironmentRevision > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEnvironmentRevisionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < EnvironmentRevision > body);

        @Override
        ListEnvironmentRevisionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEnvironmentRevisionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < EnvironmentRevision > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEnvironmentRevisionsResponse response) {
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
        public Builder body(java.util.List < EnvironmentRevision > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEnvironmentRevisionsResponse build() {
            return new ListEnvironmentRevisionsResponse(this);
        } 

    } 

}
