// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyServiceInstanceResourcesResponse} extends {@link TeaModel}
 *
 * <p>ModifyServiceInstanceResourcesResponse</p>
 */
public class ModifyServiceInstanceResourcesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyServiceInstanceResourcesResponseBody body;

    private ModifyServiceInstanceResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyServiceInstanceResourcesResponse create() {
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
    public ModifyServiceInstanceResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyServiceInstanceResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyServiceInstanceResourcesResponseBody body);

        @Override
        ModifyServiceInstanceResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyServiceInstanceResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyServiceInstanceResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyServiceInstanceResourcesResponse response) {
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
        public Builder body(ModifyServiceInstanceResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyServiceInstanceResourcesResponse build() {
            return new ModifyServiceInstanceResourcesResponse(this);
        } 

    } 

}
