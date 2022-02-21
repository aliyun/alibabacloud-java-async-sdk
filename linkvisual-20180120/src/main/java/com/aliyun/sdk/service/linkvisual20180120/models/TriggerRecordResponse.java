// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerRecordResponse} extends {@link TeaModel}
 *
 * <p>TriggerRecordResponse</p>
 */
public class TriggerRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TriggerRecordResponseBody body;

    private TriggerRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TriggerRecordResponse create() {
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
     * @return body
     */
    public TriggerRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TriggerRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TriggerRecordResponseBody body);

        @Override
        TriggerRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TriggerRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TriggerRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TriggerRecordResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(TriggerRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TriggerRecordResponse build() {
            return new TriggerRecordResponse(this);
        } 

    } 

}
