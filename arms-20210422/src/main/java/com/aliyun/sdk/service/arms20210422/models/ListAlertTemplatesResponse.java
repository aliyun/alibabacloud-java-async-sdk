// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListAlertTemplatesResponse</p>
 */
public class ListAlertTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlertTemplatesResponseBody body;

    private ListAlertTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlertTemplatesResponse create() {
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
    public ListAlertTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlertTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlertTemplatesResponseBody body);

        @Override
        ListAlertTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlertTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlertTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlertTemplatesResponse response) {
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
        public Builder body(ListAlertTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlertTemplatesResponse build() {
            return new ListAlertTemplatesResponse(this);
        } 

    } 

}
