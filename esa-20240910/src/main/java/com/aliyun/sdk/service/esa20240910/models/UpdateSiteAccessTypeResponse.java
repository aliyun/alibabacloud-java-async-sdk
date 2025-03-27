// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateSiteAccessTypeResponse} extends {@link TeaModel}
 *
 * <p>UpdateSiteAccessTypeResponse</p>
 */
public class UpdateSiteAccessTypeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateSiteAccessTypeResponseBody body;

    private UpdateSiteAccessTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateSiteAccessTypeResponse create() {
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
    public UpdateSiteAccessTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSiteAccessTypeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateSiteAccessTypeResponseBody body);

        @Override
        UpdateSiteAccessTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSiteAccessTypeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateSiteAccessTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSiteAccessTypeResponse response) {
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
        public Builder body(UpdateSiteAccessTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSiteAccessTypeResponse build() {
            return new UpdateSiteAccessTypeResponse(this);
        } 

    } 

}
