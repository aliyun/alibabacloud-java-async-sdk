// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link UpdateFormationCrawlerScheduleStateResponse} extends {@link TeaModel}
 *
 * <p>UpdateFormationCrawlerScheduleStateResponse</p>
 */
public class UpdateFormationCrawlerScheduleStateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateFormationCrawlerScheduleStateResponseBody body;

    private UpdateFormationCrawlerScheduleStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateFormationCrawlerScheduleStateResponse create() {
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
    public UpdateFormationCrawlerScheduleStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFormationCrawlerScheduleStateResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateFormationCrawlerScheduleStateResponseBody body);

        @Override
        UpdateFormationCrawlerScheduleStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFormationCrawlerScheduleStateResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private UpdateFormationCrawlerScheduleStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFormationCrawlerScheduleStateResponse response) {
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
        public Builder body(UpdateFormationCrawlerScheduleStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFormationCrawlerScheduleStateResponse build() {
            return new UpdateFormationCrawlerScheduleStateResponse(this);
        } 

    } 

}
