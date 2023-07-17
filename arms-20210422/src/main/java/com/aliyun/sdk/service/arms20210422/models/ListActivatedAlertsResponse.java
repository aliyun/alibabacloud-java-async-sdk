// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActivatedAlertsResponse} extends {@link TeaModel}
 *
 * <p>ListActivatedAlertsResponse</p>
 */
public class ListActivatedAlertsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListActivatedAlertsResponseBody body;

    private ListActivatedAlertsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListActivatedAlertsResponse create() {
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
    public ListActivatedAlertsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListActivatedAlertsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListActivatedAlertsResponseBody body);

        @Override
        ListActivatedAlertsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListActivatedAlertsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListActivatedAlertsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListActivatedAlertsResponse response) {
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
        public Builder body(ListActivatedAlertsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListActivatedAlertsResponse build() {
            return new ListActivatedAlertsResponse(this);
        } 

    } 

}
