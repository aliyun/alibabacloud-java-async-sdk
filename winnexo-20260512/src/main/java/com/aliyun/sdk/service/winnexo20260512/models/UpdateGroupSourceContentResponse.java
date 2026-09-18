// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UpdateGroupSourceContentResponse} extends {@link TeaModel}
 *
 * <p>UpdateGroupSourceContentResponse</p>
 */
public class UpdateGroupSourceContentResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateGroupSourceContentResponseBody body;

    private UpdateGroupSourceContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateGroupSourceContentResponse create() {
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
    public UpdateGroupSourceContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGroupSourceContentResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateGroupSourceContentResponseBody body);

        @Override
        UpdateGroupSourceContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGroupSourceContentResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateGroupSourceContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGroupSourceContentResponse response) {
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
        public Builder body(UpdateGroupSourceContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGroupSourceContentResponse build() {
            return new UpdateGroupSourceContentResponse(this);
        } 

    } 

}
