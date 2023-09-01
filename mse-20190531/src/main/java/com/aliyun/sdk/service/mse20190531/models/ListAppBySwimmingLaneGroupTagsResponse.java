// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppBySwimmingLaneGroupTagsResponse} extends {@link TeaModel}
 *
 * <p>ListAppBySwimmingLaneGroupTagsResponse</p>
 */
public class ListAppBySwimmingLaneGroupTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppBySwimmingLaneGroupTagsResponseBody body;

    private ListAppBySwimmingLaneGroupTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppBySwimmingLaneGroupTagsResponse create() {
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
    public ListAppBySwimmingLaneGroupTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppBySwimmingLaneGroupTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppBySwimmingLaneGroupTagsResponseBody body);

        @Override
        ListAppBySwimmingLaneGroupTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppBySwimmingLaneGroupTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppBySwimmingLaneGroupTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppBySwimmingLaneGroupTagsResponse response) {
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
        public Builder body(ListAppBySwimmingLaneGroupTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppBySwimmingLaneGroupTagsResponse build() {
            return new ListAppBySwimmingLaneGroupTagsResponse(this);
        } 

    } 

}
