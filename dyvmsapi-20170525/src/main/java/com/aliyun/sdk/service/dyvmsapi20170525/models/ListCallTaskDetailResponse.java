// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>ListCallTaskDetailResponse</p>
 */
public class ListCallTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCallTaskDetailResponseBody body;

    private ListCallTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCallTaskDetailResponse create() {
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
    public ListCallTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCallTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCallTaskDetailResponseBody body);

        @Override
        ListCallTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCallTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCallTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCallTaskDetailResponse response) {
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
        public Builder body(ListCallTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCallTaskDetailResponse build() {
            return new ListCallTaskDetailResponse(this);
        } 

    } 

}
