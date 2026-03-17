// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link GrantSagInstanceToVbrResponse} extends {@link TeaModel}
 *
 * <p>GrantSagInstanceToVbrResponse</p>
 */
public class GrantSagInstanceToVbrResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GrantSagInstanceToVbrResponseBody body;

    private GrantSagInstanceToVbrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GrantSagInstanceToVbrResponse create() {
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
    public GrantSagInstanceToVbrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantSagInstanceToVbrResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GrantSagInstanceToVbrResponseBody body);

        @Override
        GrantSagInstanceToVbrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantSagInstanceToVbrResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GrantSagInstanceToVbrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantSagInstanceToVbrResponse response) {
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
        public Builder body(GrantSagInstanceToVbrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantSagInstanceToVbrResponse build() {
            return new GrantSagInstanceToVbrResponse(this);
        } 

    } 

}
