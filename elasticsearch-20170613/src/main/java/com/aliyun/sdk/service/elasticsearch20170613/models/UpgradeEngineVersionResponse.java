// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeEngineVersionResponse} extends {@link TeaModel}
 *
 * <p>UpgradeEngineVersionResponse</p>
 */
public class UpgradeEngineVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeEngineVersionResponseBody body;

    private UpgradeEngineVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeEngineVersionResponse create() {
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
    public UpgradeEngineVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeEngineVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeEngineVersionResponseBody body);

        @Override
        UpgradeEngineVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeEngineVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeEngineVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeEngineVersionResponse response) {
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
        public Builder body(UpgradeEngineVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeEngineVersionResponse build() {
            return new UpgradeEngineVersionResponse(this);
        } 

    } 

}
