// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommonGroupResponse} extends {@link TeaModel}
 *
 * <p>ListCommonGroupResponse</p>
 */
public class ListCommonGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCommonGroupResponseBody body;

    private ListCommonGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCommonGroupResponse create() {
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
    public ListCommonGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCommonGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCommonGroupResponseBody body);

        @Override
        ListCommonGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCommonGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCommonGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCommonGroupResponse response) {
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
        public Builder body(ListCommonGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCommonGroupResponse build() {
            return new ListCommonGroupResponse(this);
        } 

    } 

}
