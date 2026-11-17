// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyAgentInstanceMemoryConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyAgentInstanceMemoryConfigResponse</p>
 */
public class ModifyAgentInstanceMemoryConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyAgentInstanceMemoryConfigResponseBody body;

    private ModifyAgentInstanceMemoryConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyAgentInstanceMemoryConfigResponse create() {
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
    public ModifyAgentInstanceMemoryConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAgentInstanceMemoryConfigResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyAgentInstanceMemoryConfigResponseBody body);

        @Override
        ModifyAgentInstanceMemoryConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAgentInstanceMemoryConfigResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyAgentInstanceMemoryConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAgentInstanceMemoryConfigResponse response) {
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
        public Builder body(ModifyAgentInstanceMemoryConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAgentInstanceMemoryConfigResponse build() {
            return new ModifyAgentInstanceMemoryConfigResponse(this);
        } 

    } 

}
