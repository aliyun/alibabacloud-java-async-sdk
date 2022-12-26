// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateCommonTargetConfigResponse} extends {@link TeaModel}
 *
 * <p>OperateCommonTargetConfigResponse</p>
 */
public class OperateCommonTargetConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateCommonTargetConfigResponseBody body;

    private OperateCommonTargetConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateCommonTargetConfigResponse create() {
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
    public OperateCommonTargetConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateCommonTargetConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateCommonTargetConfigResponseBody body);

        @Override
        OperateCommonTargetConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateCommonTargetConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateCommonTargetConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateCommonTargetConfigResponse response) {
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
        public Builder body(OperateCommonTargetConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateCommonTargetConfigResponse build() {
            return new OperateCommonTargetConfigResponse(this);
        } 

    } 

}
