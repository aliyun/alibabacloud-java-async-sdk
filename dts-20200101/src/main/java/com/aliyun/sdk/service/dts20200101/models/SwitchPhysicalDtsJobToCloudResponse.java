// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchPhysicalDtsJobToCloudResponse} extends {@link TeaModel}
 *
 * <p>SwitchPhysicalDtsJobToCloudResponse</p>
 */
public class SwitchPhysicalDtsJobToCloudResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchPhysicalDtsJobToCloudResponseBody body;

    private SwitchPhysicalDtsJobToCloudResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchPhysicalDtsJobToCloudResponse create() {
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
    public SwitchPhysicalDtsJobToCloudResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchPhysicalDtsJobToCloudResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchPhysicalDtsJobToCloudResponseBody body);

        @Override
        SwitchPhysicalDtsJobToCloudResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchPhysicalDtsJobToCloudResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchPhysicalDtsJobToCloudResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchPhysicalDtsJobToCloudResponse response) {
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
        public Builder body(SwitchPhysicalDtsJobToCloudResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchPhysicalDtsJobToCloudResponse build() {
            return new SwitchPhysicalDtsJobToCloudResponse(this);
        } 

    } 

}
