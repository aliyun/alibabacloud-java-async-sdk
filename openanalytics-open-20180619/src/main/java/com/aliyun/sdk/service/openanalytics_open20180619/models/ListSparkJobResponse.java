// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkJobResponse} extends {@link TeaModel}
 *
 * <p>ListSparkJobResponse</p>
 */
public class ListSparkJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSparkJobResponseBody body;

    private ListSparkJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSparkJobResponse create() {
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
    public ListSparkJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSparkJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSparkJobResponseBody body);

        @Override
        ListSparkJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSparkJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSparkJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSparkJobResponse response) {
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
        public Builder body(ListSparkJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSparkJobResponse build() {
            return new ListSparkJobResponse(this);
        } 

    } 

}
