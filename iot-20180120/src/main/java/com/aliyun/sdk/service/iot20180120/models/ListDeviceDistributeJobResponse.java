// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceDistributeJobResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceDistributeJobResponse</p>
 */
public class ListDeviceDistributeJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeviceDistributeJobResponseBody body;

    private ListDeviceDistributeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeviceDistributeJobResponse create() {
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
    public ListDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceDistributeJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeviceDistributeJobResponseBody body);

        @Override
        ListDeviceDistributeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceDistributeJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeviceDistributeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceDistributeJobResponse response) {
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
        public Builder body(ListDeviceDistributeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceDistributeJobResponse build() {
            return new ListDeviceDistributeJobResponse(this);
        } 

    } 

}
