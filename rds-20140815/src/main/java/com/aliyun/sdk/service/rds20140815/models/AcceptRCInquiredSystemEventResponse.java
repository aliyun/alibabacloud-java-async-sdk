// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link AcceptRCInquiredSystemEventResponse} extends {@link TeaModel}
 *
 * <p>AcceptRCInquiredSystemEventResponse</p>
 */
public class AcceptRCInquiredSystemEventResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AcceptRCInquiredSystemEventResponseBody body;

    private AcceptRCInquiredSystemEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AcceptRCInquiredSystemEventResponse create() {
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
    public AcceptRCInquiredSystemEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptRCInquiredSystemEventResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AcceptRCInquiredSystemEventResponseBody body);

        @Override
        AcceptRCInquiredSystemEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptRCInquiredSystemEventResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AcceptRCInquiredSystemEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptRCInquiredSystemEventResponse response) {
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
        public Builder body(AcceptRCInquiredSystemEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptRCInquiredSystemEventResponse build() {
            return new AcceptRCInquiredSystemEventResponse(this);
        } 

    } 

}
