// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletionProtectionResponse} extends {@link TeaModel}
 *
 * <p>DeletionProtectionResponse</p>
 */
public class DeletionProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletionProtectionResponseBody body;

    private DeletionProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletionProtectionResponse create() {
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
    public DeletionProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletionProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletionProtectionResponseBody body);

        @Override
        DeletionProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletionProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletionProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletionProtectionResponse response) {
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
        public Builder body(DeletionProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletionProtectionResponse build() {
            return new DeletionProtectionResponse(this);
        } 

    } 

}
