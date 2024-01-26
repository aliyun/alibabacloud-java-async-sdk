// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOfficeSiteMfaEnabledResponse} extends {@link TeaModel}
 *
 * <p>ModifyOfficeSiteMfaEnabledResponse</p>
 */
public class ModifyOfficeSiteMfaEnabledResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ModifyOfficeSiteMfaEnabledResponseBody body;

    private ModifyOfficeSiteMfaEnabledResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyOfficeSiteMfaEnabledResponse create() {
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
    public ModifyOfficeSiteMfaEnabledResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyOfficeSiteMfaEnabledResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyOfficeSiteMfaEnabledResponseBody body);

        @Override
        ModifyOfficeSiteMfaEnabledResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyOfficeSiteMfaEnabledResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyOfficeSiteMfaEnabledResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyOfficeSiteMfaEnabledResponse response) {
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
        public Builder body(ModifyOfficeSiteMfaEnabledResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyOfficeSiteMfaEnabledResponse build() {
            return new ModifyOfficeSiteMfaEnabledResponse(this);
        } 

    } 

}
