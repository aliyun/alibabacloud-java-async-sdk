// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTATaskByJobResponse} extends {@link TeaModel}
 *
 * <p>ListOTATaskByJobResponse</p>
 */
public class ListOTATaskByJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOTATaskByJobResponseBody body;

    private ListOTATaskByJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOTATaskByJobResponse create() {
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
    public ListOTATaskByJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOTATaskByJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOTATaskByJobResponseBody body);

        @Override
        ListOTATaskByJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOTATaskByJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOTATaskByJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOTATaskByJobResponse response) {
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
        public Builder body(ListOTATaskByJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOTATaskByJobResponse build() {
            return new ListOTATaskByJobResponse(this);
        } 

    } 

}
