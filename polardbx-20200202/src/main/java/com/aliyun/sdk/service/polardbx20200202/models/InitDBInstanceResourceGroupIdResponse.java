// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitDBInstanceResourceGroupIdResponse} extends {@link TeaModel}
 *
 * <p>InitDBInstanceResourceGroupIdResponse</p>
 */
public class InitDBInstanceResourceGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitDBInstanceResourceGroupIdResponseBody body;

    private InitDBInstanceResourceGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitDBInstanceResourceGroupIdResponse create() {
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
    public InitDBInstanceResourceGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitDBInstanceResourceGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitDBInstanceResourceGroupIdResponseBody body);

        @Override
        InitDBInstanceResourceGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitDBInstanceResourceGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitDBInstanceResourceGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitDBInstanceResourceGroupIdResponse response) {
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
        public Builder body(InitDBInstanceResourceGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitDBInstanceResourceGroupIdResponse build() {
            return new InitDBInstanceResourceGroupIdResponse(this);
        } 

    } 

}
