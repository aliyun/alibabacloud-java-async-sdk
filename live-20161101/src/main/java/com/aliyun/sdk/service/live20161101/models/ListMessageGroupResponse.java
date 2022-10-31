// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupResponse} extends {@link TeaModel}
 *
 * <p>ListMessageGroupResponse</p>
 */
public class ListMessageGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageGroupResponseBody body;

    private ListMessageGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageGroupResponse create() {
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
    public ListMessageGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageGroupResponseBody body);

        @Override
        ListMessageGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageGroupResponse response) {
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
        public Builder body(ListMessageGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageGroupResponse build() {
            return new ListMessageGroupResponse(this);
        } 

    } 

}
