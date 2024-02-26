// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNameResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceNameResponse</p>
 */
public class ModifyInstanceNameResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyInstanceNameResponseBody body;

    private ModifyInstanceNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyInstanceNameResponse create() {
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
    public ModifyInstanceNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstanceNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyInstanceNameResponseBody body);

        @Override
        ModifyInstanceNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstanceNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyInstanceNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstanceNameResponse response) {
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
        public Builder body(ModifyInstanceNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceNameResponse build() {
            return new ModifyInstanceNameResponse(this);
        } 

    } 

}
