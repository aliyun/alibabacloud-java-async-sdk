// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDialogResponse} extends {@link TeaModel}
 *
 * <p>ListDialogResponse</p>
 */
public class ListDialogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDialogResponseBody body;

    private ListDialogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDialogResponse create() {
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
    public ListDialogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDialogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDialogResponseBody body);

        @Override
        ListDialogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDialogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDialogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDialogResponse response) {
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
        public Builder body(ListDialogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDialogResponse build() {
            return new ListDialogResponse(this);
        } 

    } 

}
