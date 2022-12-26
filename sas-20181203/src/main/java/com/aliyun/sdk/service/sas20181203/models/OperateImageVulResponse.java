// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateImageVulResponse} extends {@link TeaModel}
 *
 * <p>OperateImageVulResponse</p>
 */
public class OperateImageVulResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateImageVulResponseBody body;

    private OperateImageVulResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateImageVulResponse create() {
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
    public OperateImageVulResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateImageVulResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateImageVulResponseBody body);

        @Override
        OperateImageVulResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateImageVulResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateImageVulResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateImageVulResponse response) {
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
        public Builder body(OperateImageVulResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateImageVulResponse build() {
            return new OperateImageVulResponse(this);
        } 

    } 

}
