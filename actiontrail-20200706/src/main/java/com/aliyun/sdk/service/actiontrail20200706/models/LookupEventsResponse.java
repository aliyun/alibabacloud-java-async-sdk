// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LookupEventsResponse} extends {@link TeaModel}
 *
 * <p>LookupEventsResponse</p>
 */
public class LookupEventsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private LookupEventsResponseBody body;

    private LookupEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static LookupEventsResponse create() {
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
    public LookupEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LookupEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(LookupEventsResponseBody body);

        @Override
        LookupEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LookupEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private LookupEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LookupEventsResponse response) {
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
        public Builder body(LookupEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LookupEventsResponse build() {
            return new LookupEventsResponse(this);
        } 

    } 

}
