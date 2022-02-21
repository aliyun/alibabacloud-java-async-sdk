// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchHiTSDBInstancePublicNetResponse} extends {@link TeaModel}
 *
 * <p>SwitchHiTSDBInstancePublicNetResponse</p>
 */
public class SwitchHiTSDBInstancePublicNetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchHiTSDBInstancePublicNetResponseBody body;

    private SwitchHiTSDBInstancePublicNetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchHiTSDBInstancePublicNetResponse create() {
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
    public SwitchHiTSDBInstancePublicNetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchHiTSDBInstancePublicNetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchHiTSDBInstancePublicNetResponseBody body);

        @Override
        SwitchHiTSDBInstancePublicNetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchHiTSDBInstancePublicNetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchHiTSDBInstancePublicNetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchHiTSDBInstancePublicNetResponse response) {
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
        public Builder body(SwitchHiTSDBInstancePublicNetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchHiTSDBInstancePublicNetResponse build() {
            return new SwitchHiTSDBInstancePublicNetResponse(this);
        } 

    } 

}
