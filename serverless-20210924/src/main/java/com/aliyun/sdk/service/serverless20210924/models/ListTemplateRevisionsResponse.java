// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateRevisionsResponse} extends {@link TeaModel}
 *
 * <p>ListTemplateRevisionsResponse</p>
 */
public class ListTemplateRevisionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < TemplateRevision > body;

    private ListTemplateRevisionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTemplateRevisionsResponse create() {
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
    public java.util.List < TemplateRevision > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTemplateRevisionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < TemplateRevision > body);

        @Override
        ListTemplateRevisionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTemplateRevisionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < TemplateRevision > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTemplateRevisionsResponse response) {
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
        public Builder body(java.util.List < TemplateRevision > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTemplateRevisionsResponse build() {
            return new ListTemplateRevisionsResponse(this);
        } 

    } 

}
