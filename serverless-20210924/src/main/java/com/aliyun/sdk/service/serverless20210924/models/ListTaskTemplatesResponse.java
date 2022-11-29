// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListTaskTemplatesResponse</p>
 */
public class ListTaskTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < TaskTemplate > body;

    private ListTaskTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskTemplatesResponse create() {
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
    public java.util.List < TaskTemplate > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < TaskTemplate > body);

        @Override
        ListTaskTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < TaskTemplate > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskTemplatesResponse response) {
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
        public Builder body(java.util.List < TaskTemplate > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskTemplatesResponse build() {
            return new ListTaskTemplatesResponse(this);
        } 

    } 

}
