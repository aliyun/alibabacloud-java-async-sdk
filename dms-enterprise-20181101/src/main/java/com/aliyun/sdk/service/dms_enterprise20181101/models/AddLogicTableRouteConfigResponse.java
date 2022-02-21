// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLogicTableRouteConfigResponse} extends {@link TeaModel}
 *
 * <p>AddLogicTableRouteConfigResponse</p>
 */
public class AddLogicTableRouteConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLogicTableRouteConfigResponseBody body;

    private AddLogicTableRouteConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLogicTableRouteConfigResponse create() {
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
    public AddLogicTableRouteConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLogicTableRouteConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLogicTableRouteConfigResponseBody body);

        @Override
        AddLogicTableRouteConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLogicTableRouteConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLogicTableRouteConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLogicTableRouteConfigResponse response) {
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
        public Builder body(AddLogicTableRouteConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLogicTableRouteConfigResponse build() {
            return new AddLogicTableRouteConfigResponse(this);
        } 

    } 

}
