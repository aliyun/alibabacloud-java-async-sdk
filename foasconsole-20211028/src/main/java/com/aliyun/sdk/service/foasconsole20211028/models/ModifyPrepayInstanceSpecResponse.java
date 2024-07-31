// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrepayInstanceSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyPrepayInstanceSpecResponse</p>
 */
public class ModifyPrepayInstanceSpecResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyPrepayInstanceSpecResponseBody body;

    private ModifyPrepayInstanceSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyPrepayInstanceSpecResponse create() {
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
    public ModifyPrepayInstanceSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPrepayInstanceSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyPrepayInstanceSpecResponseBody body);

        @Override
        ModifyPrepayInstanceSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPrepayInstanceSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyPrepayInstanceSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPrepayInstanceSpecResponse response) {
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
        public Builder body(ModifyPrepayInstanceSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPrepayInstanceSpecResponse build() {
            return new ModifyPrepayInstanceSpecResponse(this);
        } 

    } 

}
