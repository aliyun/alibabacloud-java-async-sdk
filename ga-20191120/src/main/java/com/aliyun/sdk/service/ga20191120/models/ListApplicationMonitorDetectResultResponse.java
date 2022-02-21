// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationMonitorDetectResultResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationMonitorDetectResultResponse</p>
 */
public class ListApplicationMonitorDetectResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationMonitorDetectResultResponseBody body;

    private ListApplicationMonitorDetectResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationMonitorDetectResultResponse create() {
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
    public ListApplicationMonitorDetectResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationMonitorDetectResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationMonitorDetectResultResponseBody body);

        @Override
        ListApplicationMonitorDetectResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationMonitorDetectResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationMonitorDetectResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationMonitorDetectResultResponse response) {
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
        public Builder body(ListApplicationMonitorDetectResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationMonitorDetectResultResponse build() {
            return new ListApplicationMonitorDetectResultResponse(this);
        } 

    } 

}
