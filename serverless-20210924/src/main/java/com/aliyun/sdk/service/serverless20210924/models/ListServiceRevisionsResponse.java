// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceRevisionsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceRevisionsResponse</p>
 */
public class ListServiceRevisionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < ServiceRevision > body;

    private ListServiceRevisionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceRevisionsResponse create() {
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
    public java.util.List < ServiceRevision > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceRevisionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < ServiceRevision > body);

        @Override
        ListServiceRevisionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceRevisionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < ServiceRevision > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceRevisionsResponse response) {
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
        public Builder body(java.util.List < ServiceRevision > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceRevisionsResponse build() {
            return new ListServiceRevisionsResponse(this);
        } 

    } 

}
