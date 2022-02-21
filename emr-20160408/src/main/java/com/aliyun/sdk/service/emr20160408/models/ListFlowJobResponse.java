// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowJobResponse} extends {@link TeaModel}
 *
 * <p>ListFlowJobResponse</p>
 */
public class ListFlowJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowJobResponseBody body;

    private ListFlowJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowJobResponse create() {
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
    public ListFlowJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowJobResponseBody body);

        @Override
        ListFlowJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowJobResponse response) {
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
        public Builder body(ListFlowJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowJobResponse build() {
            return new ListFlowJobResponse(this);
        } 

    } 

}
