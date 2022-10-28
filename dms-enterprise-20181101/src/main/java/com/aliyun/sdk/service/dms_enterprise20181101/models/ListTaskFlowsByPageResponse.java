// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowsByPageResponse} extends {@link TeaModel}
 *
 * <p>ListTaskFlowsByPageResponse</p>
 */
public class ListTaskFlowsByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskFlowsByPageResponseBody body;

    private ListTaskFlowsByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskFlowsByPageResponse create() {
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
    public ListTaskFlowsByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskFlowsByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaskFlowsByPageResponseBody body);

        @Override
        ListTaskFlowsByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskFlowsByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaskFlowsByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskFlowsByPageResponse response) {
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
        public Builder body(ListTaskFlowsByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskFlowsByPageResponse build() {
            return new ListTaskFlowsByPageResponse(this);
        } 

    } 

}
