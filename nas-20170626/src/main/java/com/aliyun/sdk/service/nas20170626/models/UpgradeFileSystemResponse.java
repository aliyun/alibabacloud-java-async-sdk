// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeFileSystemResponse} extends {@link TeaModel}
 *
 * <p>UpgradeFileSystemResponse</p>
 */
public class UpgradeFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeFileSystemResponseBody body;

    private UpgradeFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeFileSystemResponse create() {
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
    public UpgradeFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeFileSystemResponseBody body);

        @Override
        UpgradeFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeFileSystemResponse response) {
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
        public Builder body(UpgradeFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeFileSystemResponse build() {
            return new UpgradeFileSystemResponse(this);
        } 

    } 

}
