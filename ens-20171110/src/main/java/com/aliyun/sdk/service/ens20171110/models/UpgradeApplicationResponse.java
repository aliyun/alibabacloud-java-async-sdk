// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeApplicationResponse} extends {@link TeaModel}
 *
 * <p>UpgradeApplicationResponse</p>
 */
public class UpgradeApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeApplicationResponseBody body;

    private UpgradeApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeApplicationResponse create() {
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
    public UpgradeApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeApplicationResponseBody body);

        @Override
        UpgradeApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeApplicationResponse response) {
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
        public Builder body(UpgradeApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeApplicationResponse build() {
            return new UpgradeApplicationResponse(this);
        } 

    } 

}
