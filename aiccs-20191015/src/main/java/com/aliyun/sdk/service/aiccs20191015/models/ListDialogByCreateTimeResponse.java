// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDialogByCreateTimeResponse} extends {@link TeaModel}
 *
 * <p>ListDialogByCreateTimeResponse</p>
 */
public class ListDialogByCreateTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDialogByCreateTimeResponseBody body;

    private ListDialogByCreateTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDialogByCreateTimeResponse create() {
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
    public ListDialogByCreateTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDialogByCreateTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDialogByCreateTimeResponseBody body);

        @Override
        ListDialogByCreateTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDialogByCreateTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDialogByCreateTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDialogByCreateTimeResponse response) {
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
        public Builder body(ListDialogByCreateTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDialogByCreateTimeResponse build() {
            return new ListDialogByCreateTimeResponse(this);
        } 

    } 

}
