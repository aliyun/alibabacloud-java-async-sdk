// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHiTSDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateHiTSDBInstanceResponse</p>
 */
public class CreateHiTSDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHiTSDBInstanceResponseBody body;

    private CreateHiTSDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHiTSDBInstanceResponse create() {
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
    public CreateHiTSDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHiTSDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHiTSDBInstanceResponseBody body);

        @Override
        CreateHiTSDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHiTSDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHiTSDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHiTSDBInstanceResponse response) {
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
        public Builder body(CreateHiTSDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHiTSDBInstanceResponse build() {
            return new CreateHiTSDBInstanceResponse(this);
        } 

    } 

}
