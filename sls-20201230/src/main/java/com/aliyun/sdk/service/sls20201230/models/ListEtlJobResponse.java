// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListEtlJobResponse} extends {@link TeaModel}
 *
 * <p>ListEtlJobResponse</p>
 */
public class ListEtlJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEtlJobResponseBody body;

    private ListEtlJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEtlJobResponse create() {
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
    public ListEtlJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEtlJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEtlJobResponseBody body);

        @Override
        ListEtlJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEtlJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEtlJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEtlJobResponse response) {
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
        public Builder body(ListEtlJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEtlJobResponse build() {
            return new ListEtlJobResponse(this);
        } 

    } 

}
