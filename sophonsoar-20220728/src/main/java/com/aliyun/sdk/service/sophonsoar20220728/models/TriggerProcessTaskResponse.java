// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerProcessTaskResponse} extends {@link TeaModel}
 *
 * <p>TriggerProcessTaskResponse</p>
 */
public class TriggerProcessTaskResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private TriggerProcessTaskResponseBody body;

    private TriggerProcessTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TriggerProcessTaskResponse create() {
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
    public TriggerProcessTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TriggerProcessTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TriggerProcessTaskResponseBody body);

        @Override
        TriggerProcessTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TriggerProcessTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TriggerProcessTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TriggerProcessTaskResponse response) {
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
        public Builder body(TriggerProcessTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TriggerProcessTaskResponse build() {
            return new TriggerProcessTaskResponse(this);
        } 

    } 

}
