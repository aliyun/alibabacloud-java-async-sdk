// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalDatabaseResponse} extends {@link TeaModel}
 *
 * <p>GetPhysicalDatabaseResponse</p>
 */
public class GetPhysicalDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPhysicalDatabaseResponseBody body;

    private GetPhysicalDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPhysicalDatabaseResponse create() {
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
    public GetPhysicalDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPhysicalDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPhysicalDatabaseResponseBody body);

        @Override
        GetPhysicalDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPhysicalDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPhysicalDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPhysicalDatabaseResponse response) {
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
        public Builder body(GetPhysicalDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPhysicalDatabaseResponse build() {
            return new GetPhysicalDatabaseResponse(this);
        } 

    } 

}
