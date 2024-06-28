// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerPlaybookResponse} extends {@link TeaModel}
 *
 * <p>TriggerPlaybookResponse</p>
 */
public class TriggerPlaybookResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TriggerPlaybookResponseBody body;

    private TriggerPlaybookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TriggerPlaybookResponse create() {
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
    public TriggerPlaybookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TriggerPlaybookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TriggerPlaybookResponseBody body);

        @Override
        TriggerPlaybookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TriggerPlaybookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TriggerPlaybookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TriggerPlaybookResponse response) {
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
        public Builder body(TriggerPlaybookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TriggerPlaybookResponse build() {
            return new TriggerPlaybookResponse(this);
        } 

    } 

}
