// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyBeebotIntentUserSayResponse} extends {@link TeaModel}
 *
 * <p>ModifyBeebotIntentUserSayResponse</p>
 */
public class ModifyBeebotIntentUserSayResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyBeebotIntentUserSayResponseBody body;

    private ModifyBeebotIntentUserSayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyBeebotIntentUserSayResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public ModifyBeebotIntentUserSayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBeebotIntentUserSayResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyBeebotIntentUserSayResponseBody body);

        @Override
        ModifyBeebotIntentUserSayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBeebotIntentUserSayResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyBeebotIntentUserSayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBeebotIntentUserSayResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(ModifyBeebotIntentUserSayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBeebotIntentUserSayResponse build() {
            return new ModifyBeebotIntentUserSayResponse(this);
        } 

    } 

}
