// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPlansResponse} extends {@link TeaModel}
 *
 * <p>ListEscalationPlansResponse</p>
 */
public class ListEscalationPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEscalationPlansResponseBody body;

    private ListEscalationPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEscalationPlansResponse create() {
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
    public ListEscalationPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEscalationPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEscalationPlansResponseBody body);

        @Override
        ListEscalationPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEscalationPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEscalationPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEscalationPlansResponse response) {
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
        public Builder body(ListEscalationPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEscalationPlansResponse build() {
            return new ListEscalationPlansResponse(this);
        } 

    } 

}
