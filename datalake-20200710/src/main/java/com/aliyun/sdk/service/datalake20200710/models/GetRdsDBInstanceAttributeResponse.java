// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRdsDBInstanceAttributeResponse} extends {@link TeaModel}
 *
 * <p>GetRdsDBInstanceAttributeResponse</p>
 */
public class GetRdsDBInstanceAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRdsDBInstanceAttributeResponseBody body;

    private GetRdsDBInstanceAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRdsDBInstanceAttributeResponse create() {
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
    public GetRdsDBInstanceAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRdsDBInstanceAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRdsDBInstanceAttributeResponseBody body);

        @Override
        GetRdsDBInstanceAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRdsDBInstanceAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRdsDBInstanceAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRdsDBInstanceAttributeResponse response) {
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
        public Builder body(GetRdsDBInstanceAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRdsDBInstanceAttributeResponse build() {
            return new GetRdsDBInstanceAttributeResponse(this);
        } 

    } 

}
