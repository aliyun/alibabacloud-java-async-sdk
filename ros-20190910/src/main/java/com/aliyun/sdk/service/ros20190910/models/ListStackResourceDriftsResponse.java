// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackResourceDriftsResponse} extends {@link TeaModel}
 *
 * <p>ListStackResourceDriftsResponse</p>
 */
public class ListStackResourceDriftsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStackResourceDriftsResponseBody body;

    private ListStackResourceDriftsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStackResourceDriftsResponse create() {
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
    public ListStackResourceDriftsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStackResourceDriftsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStackResourceDriftsResponseBody body);

        @Override
        ListStackResourceDriftsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStackResourceDriftsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStackResourceDriftsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStackResourceDriftsResponse response) {
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
        public Builder body(ListStackResourceDriftsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStackResourceDriftsResponse build() {
            return new ListStackResourceDriftsResponse(this);
        } 

    } 

}
