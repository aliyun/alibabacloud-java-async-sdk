// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationMonitorResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationMonitorResponse</p>
 */
public class ListApplicationMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationMonitorResponseBody body;

    private ListApplicationMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationMonitorResponse create() {
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
    public ListApplicationMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationMonitorResponseBody body);

        @Override
        ListApplicationMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationMonitorResponse response) {
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
        public Builder body(ListApplicationMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationMonitorResponse build() {
            return new ListApplicationMonitorResponse(this);
        } 

    } 

}
