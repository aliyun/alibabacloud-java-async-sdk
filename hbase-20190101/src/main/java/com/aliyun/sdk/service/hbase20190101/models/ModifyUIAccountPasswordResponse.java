// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUIAccountPasswordResponse} extends {@link TeaModel}
 *
 * <p>ModifyUIAccountPasswordResponse</p>
 */
public class ModifyUIAccountPasswordResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyUIAccountPasswordResponseBody body;

    private ModifyUIAccountPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyUIAccountPasswordResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ModifyUIAccountPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUIAccountPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyUIAccountPasswordResponseBody body);

        @Override
        ModifyUIAccountPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUIAccountPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyUIAccountPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUIAccountPasswordResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ModifyUIAccountPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUIAccountPasswordResponse build() {
            return new ModifyUIAccountPasswordResponse(this);
        } 

    } 

}
