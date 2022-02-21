// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceMajorVersionPrecheckResponse} extends {@link TeaModel}
 *
 * <p>UpgradeDBInstanceMajorVersionPrecheckResponse</p>
 */
public class UpgradeDBInstanceMajorVersionPrecheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeDBInstanceMajorVersionPrecheckResponseBody body;

    private UpgradeDBInstanceMajorVersionPrecheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeDBInstanceMajorVersionPrecheckResponse create() {
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
    public UpgradeDBInstanceMajorVersionPrecheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeDBInstanceMajorVersionPrecheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeDBInstanceMajorVersionPrecheckResponseBody body);

        @Override
        UpgradeDBInstanceMajorVersionPrecheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeDBInstanceMajorVersionPrecheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeDBInstanceMajorVersionPrecheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeDBInstanceMajorVersionPrecheckResponse response) {
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
        public Builder body(UpgradeDBInstanceMajorVersionPrecheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeDBInstanceMajorVersionPrecheckResponse build() {
            return new UpgradeDBInstanceMajorVersionPrecheckResponse(this);
        } 

    } 

}
