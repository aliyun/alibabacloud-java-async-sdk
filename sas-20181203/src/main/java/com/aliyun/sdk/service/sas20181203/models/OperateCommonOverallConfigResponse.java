// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateCommonOverallConfigResponse} extends {@link TeaModel}
 *
 * <p>OperateCommonOverallConfigResponse</p>
 */
public class OperateCommonOverallConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateCommonOverallConfigResponseBody body;

    private OperateCommonOverallConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateCommonOverallConfigResponse create() {
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
    public OperateCommonOverallConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateCommonOverallConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateCommonOverallConfigResponseBody body);

        @Override
        OperateCommonOverallConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateCommonOverallConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateCommonOverallConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateCommonOverallConfigResponse response) {
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
        public Builder body(OperateCommonOverallConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateCommonOverallConfigResponse build() {
            return new OperateCommonOverallConfigResponse(this);
        } 

    } 

}
