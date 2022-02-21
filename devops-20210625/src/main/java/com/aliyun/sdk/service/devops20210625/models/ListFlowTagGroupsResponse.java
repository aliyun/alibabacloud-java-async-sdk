// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowTagGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListFlowTagGroupsResponse</p>
 */
public class ListFlowTagGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowTagGroupsResponseBody body;

    private ListFlowTagGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowTagGroupsResponse create() {
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
    public ListFlowTagGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowTagGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowTagGroupsResponseBody body);

        @Override
        ListFlowTagGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowTagGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowTagGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowTagGroupsResponse response) {
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
        public Builder body(ListFlowTagGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowTagGroupsResponse build() {
            return new ListFlowTagGroupsResponse(this);
        } 

    } 

}
