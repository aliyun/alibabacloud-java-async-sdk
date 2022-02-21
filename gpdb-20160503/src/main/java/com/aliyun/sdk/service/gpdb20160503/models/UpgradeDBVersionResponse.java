// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBVersionResponse} extends {@link TeaModel}
 *
 * <p>UpgradeDBVersionResponse</p>
 */
public class UpgradeDBVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeDBVersionResponseBody body;

    private UpgradeDBVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeDBVersionResponse create() {
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
    public UpgradeDBVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeDBVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeDBVersionResponseBody body);

        @Override
        UpgradeDBVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeDBVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeDBVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeDBVersionResponse response) {
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
        public Builder body(UpgradeDBVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeDBVersionResponse build() {
            return new UpgradeDBVersionResponse(this);
        } 

    } 

}
