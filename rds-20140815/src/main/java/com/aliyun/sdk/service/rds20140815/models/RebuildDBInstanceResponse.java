// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>RebuildDBInstanceResponse</p>
 */
public class RebuildDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebuildDBInstanceResponseBody body;

    private RebuildDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebuildDBInstanceResponse create() {
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
    public RebuildDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebuildDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebuildDBInstanceResponseBody body);

        @Override
        RebuildDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebuildDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebuildDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebuildDBInstanceResponse response) {
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
        public Builder body(RebuildDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebuildDBInstanceResponse build() {
            return new RebuildDBInstanceResponse(this);
        } 

    } 

}
