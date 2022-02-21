// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSmartGroupResponse} extends {@link TeaModel}
 *
 * <p>ListSmartGroupResponse</p>
 */
public class ListSmartGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSmartGroupResponseBody body;

    private ListSmartGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSmartGroupResponse create() {
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
    public ListSmartGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSmartGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSmartGroupResponseBody body);

        @Override
        ListSmartGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSmartGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSmartGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSmartGroupResponse response) {
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
        public Builder body(ListSmartGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSmartGroupResponse build() {
            return new ListSmartGroupResponse(this);
        } 

    } 

}
