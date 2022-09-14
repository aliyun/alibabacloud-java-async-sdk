// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClientResponse} extends {@link TeaModel}
 *
 * <p>UpgradeClientResponse</p>
 */
public class UpgradeClientResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeClientResponseBody body;

    private UpgradeClientResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeClientResponse create() {
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
    public UpgradeClientResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeClientResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeClientResponseBody body);

        @Override
        UpgradeClientResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeClientResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeClientResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeClientResponse response) {
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
        public Builder body(UpgradeClientResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeClientResponse build() {
            return new UpgradeClientResponse(this);
        } 

    } 

}
