// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpgradeInstanceResponse</p>
 */
public class UpgradeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeInstanceResponseBody body;

    private UpgradeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeInstanceResponse create() {
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
    public UpgradeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeInstanceResponseBody body);

        @Override
        UpgradeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeInstanceResponse response) {
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
        public Builder body(UpgradeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeInstanceResponse build() {
            return new UpgradeInstanceResponse(this);
        } 

    } 

}
