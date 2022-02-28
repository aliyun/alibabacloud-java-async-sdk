// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListTemplateVersionsResponse</p>
 */
public class ListTemplateVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTemplateVersionsResponseBody body;

    private ListTemplateVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTemplateVersionsResponse create() {
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
    public ListTemplateVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTemplateVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTemplateVersionsResponseBody body);

        @Override
        ListTemplateVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTemplateVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTemplateVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTemplateVersionsResponse response) {
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
        public Builder body(ListTemplateVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTemplateVersionsResponse build() {
            return new ListTemplateVersionsResponse(this);
        } 

    } 

}
