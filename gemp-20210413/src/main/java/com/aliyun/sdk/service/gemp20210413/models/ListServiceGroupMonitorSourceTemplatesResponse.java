// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupMonitorSourceTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListServiceGroupMonitorSourceTemplatesResponse</p>
 */
public class ListServiceGroupMonitorSourceTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceGroupMonitorSourceTemplatesResponseBody body;

    private ListServiceGroupMonitorSourceTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceGroupMonitorSourceTemplatesResponse create() {
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
    public ListServiceGroupMonitorSourceTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceGroupMonitorSourceTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceGroupMonitorSourceTemplatesResponseBody body);

        @Override
        ListServiceGroupMonitorSourceTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceGroupMonitorSourceTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceGroupMonitorSourceTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceGroupMonitorSourceTemplatesResponse response) {
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
        public Builder body(ListServiceGroupMonitorSourceTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceGroupMonitorSourceTemplatesResponse build() {
            return new ListServiceGroupMonitorSourceTemplatesResponse(this);
        } 

    } 

}
