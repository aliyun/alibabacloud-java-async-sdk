// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelinesResponse} extends {@link TeaModel}
 *
 * <p>ListPipelinesResponse</p>
 */
public class ListPipelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < Pipeline > body;

    private ListPipelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelinesResponse create() {
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
    public java.util.List < Pipeline > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < Pipeline > body);

        @Override
        ListPipelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < Pipeline > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelinesResponse response) {
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
        public Builder body(java.util.List < Pipeline > body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelinesResponse build() {
            return new ListPipelinesResponse(this);
        } 

    } 

}
