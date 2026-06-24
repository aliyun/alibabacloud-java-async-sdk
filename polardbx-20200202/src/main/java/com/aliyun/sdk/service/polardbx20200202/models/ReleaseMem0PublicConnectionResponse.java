// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ReleaseMem0PublicConnectionResponse} extends {@link TeaModel}
 *
 * <p>ReleaseMem0PublicConnectionResponse</p>
 */
public class ReleaseMem0PublicConnectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReleaseMem0PublicConnectionResponseBody body;

    private ReleaseMem0PublicConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReleaseMem0PublicConnectionResponse create() {
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
    public ReleaseMem0PublicConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseMem0PublicConnectionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReleaseMem0PublicConnectionResponseBody body);

        @Override
        ReleaseMem0PublicConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseMem0PublicConnectionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ReleaseMem0PublicConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseMem0PublicConnectionResponse response) {
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
        public Builder body(ReleaseMem0PublicConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseMem0PublicConnectionResponse build() {
            return new ReleaseMem0PublicConnectionResponse(this);
        } 

    } 

}
