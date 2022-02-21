// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobResponse} extends {@link TeaModel}
 *
 * <p>ListJobResponse</p>
 */
public class ListJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJobResponseBody body;

    private ListJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJobResponse create() {
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
    public ListJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJobResponseBody body);

        @Override
        ListJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJobResponse response) {
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
        public Builder body(ListJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJobResponse build() {
            return new ListJobResponse(this);
        } 

    } 

}
