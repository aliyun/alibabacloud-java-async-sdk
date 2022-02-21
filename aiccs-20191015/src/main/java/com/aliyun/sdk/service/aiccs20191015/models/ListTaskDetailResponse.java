// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>ListTaskDetailResponse</p>
 */
public class ListTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskDetailResponseBody body;

    private ListTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskDetailResponse create() {
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
    public ListTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaskDetailResponseBody body);

        @Override
        ListTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskDetailResponse response) {
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
        public Builder body(ListTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskDetailResponse build() {
            return new ListTaskDetailResponse(this);
        } 

    } 

}
