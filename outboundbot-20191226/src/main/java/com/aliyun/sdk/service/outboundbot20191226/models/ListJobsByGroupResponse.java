// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsByGroupResponse} extends {@link TeaModel}
 *
 * <p>ListJobsByGroupResponse</p>
 */
public class ListJobsByGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJobsByGroupResponseBody body;

    private ListJobsByGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJobsByGroupResponse create() {
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
    public ListJobsByGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJobsByGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJobsByGroupResponseBody body);

        @Override
        ListJobsByGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJobsByGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJobsByGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJobsByGroupResponse response) {
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
        public Builder body(ListJobsByGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJobsByGroupResponse build() {
            return new ListJobsByGroupResponse(this);
        } 

    } 

}
