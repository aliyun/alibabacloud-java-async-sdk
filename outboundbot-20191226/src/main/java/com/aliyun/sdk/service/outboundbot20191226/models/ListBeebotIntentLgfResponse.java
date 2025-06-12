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
 * {@link ListBeebotIntentLgfResponse} extends {@link TeaModel}
 *
 * <p>ListBeebotIntentLgfResponse</p>
 */
public class ListBeebotIntentLgfResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListBeebotIntentLgfResponseBody body;

    private ListBeebotIntentLgfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListBeebotIntentLgfResponse create() {
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
    public ListBeebotIntentLgfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBeebotIntentLgfResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListBeebotIntentLgfResponseBody body);

        @Override
        ListBeebotIntentLgfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBeebotIntentLgfResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListBeebotIntentLgfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBeebotIntentLgfResponse response) {
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
        public Builder body(ListBeebotIntentLgfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBeebotIntentLgfResponse build() {
            return new ListBeebotIntentLgfResponse(this);
        } 

    } 

}
