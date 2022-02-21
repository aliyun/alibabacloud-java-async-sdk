// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceMajorVersionResponse} extends {@link TeaModel}
 *
 * <p>UpgradeDBInstanceMajorVersionResponse</p>
 */
public class UpgradeDBInstanceMajorVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeDBInstanceMajorVersionResponseBody body;

    private UpgradeDBInstanceMajorVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeDBInstanceMajorVersionResponse create() {
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
    public UpgradeDBInstanceMajorVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeDBInstanceMajorVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeDBInstanceMajorVersionResponseBody body);

        @Override
        UpgradeDBInstanceMajorVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeDBInstanceMajorVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeDBInstanceMajorVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeDBInstanceMajorVersionResponse response) {
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
        public Builder body(UpgradeDBInstanceMajorVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeDBInstanceMajorVersionResponse build() {
            return new UpgradeDBInstanceMajorVersionResponse(this);
        } 

    } 

}
