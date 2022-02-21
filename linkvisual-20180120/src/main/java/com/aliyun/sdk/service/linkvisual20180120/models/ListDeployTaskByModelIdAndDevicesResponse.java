// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployTaskByModelIdAndDevicesResponse} extends {@link TeaModel}
 *
 * <p>ListDeployTaskByModelIdAndDevicesResponse</p>
 */
public class ListDeployTaskByModelIdAndDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeployTaskByModelIdAndDevicesResponseBody body;

    private ListDeployTaskByModelIdAndDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeployTaskByModelIdAndDevicesResponse create() {
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
    public ListDeployTaskByModelIdAndDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeployTaskByModelIdAndDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeployTaskByModelIdAndDevicesResponseBody body);

        @Override
        ListDeployTaskByModelIdAndDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeployTaskByModelIdAndDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeployTaskByModelIdAndDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeployTaskByModelIdAndDevicesResponse response) {
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
        public Builder body(ListDeployTaskByModelIdAndDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeployTaskByModelIdAndDevicesResponse build() {
            return new ListDeployTaskByModelIdAndDevicesResponse(this);
        } 

    } 

}
