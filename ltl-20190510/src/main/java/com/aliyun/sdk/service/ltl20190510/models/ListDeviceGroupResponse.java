// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>ListDeviceGroupResponse</p>
 */
public class ListDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeviceGroupResponseBody body;

    private ListDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeviceGroupResponse create() {
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
    public ListDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeviceGroupResponseBody body);

        @Override
        ListDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeviceGroupResponse response) {
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
        public Builder body(ListDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeviceGroupResponse build() {
            return new ListDeviceGroupResponse(this);
        } 

    } 

}
