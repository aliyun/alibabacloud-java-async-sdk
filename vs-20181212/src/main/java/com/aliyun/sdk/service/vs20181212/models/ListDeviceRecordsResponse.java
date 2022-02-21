// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceRecordsResponse</p>
 */
public class ListDeviceRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeviceRecordsResponseBody body;

    private ListDeviceRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeviceRecordsResponse create() {
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
    public ListDeviceRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeviceRecordsResponseBody body);

        @Override
        ListDeviceRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeviceRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceRecordsResponse response) {
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
        public Builder body(ListDeviceRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceRecordsResponse build() {
            return new ListDeviceRecordsResponse(this);
        } 

    } 

}
