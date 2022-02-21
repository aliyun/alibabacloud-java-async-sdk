// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowCategoryResponse} extends {@link TeaModel}
 *
 * <p>ListFlowCategoryResponse</p>
 */
public class ListFlowCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowCategoryResponseBody body;

    private ListFlowCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowCategoryResponse create() {
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
    public ListFlowCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowCategoryResponseBody body);

        @Override
        ListFlowCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowCategoryResponse response) {
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
        public Builder body(ListFlowCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowCategoryResponse build() {
            return new ListFlowCategoryResponse(this);
        } 

    } 

}
