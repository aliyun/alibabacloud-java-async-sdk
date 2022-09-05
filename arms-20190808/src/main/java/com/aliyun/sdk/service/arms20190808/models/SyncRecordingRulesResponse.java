// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncRecordingRulesResponse} extends {@link TeaModel}
 *
 * <p>SyncRecordingRulesResponse</p>
 */
public class SyncRecordingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncRecordingRulesResponseBody body;

    private SyncRecordingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncRecordingRulesResponse create() {
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
    public SyncRecordingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncRecordingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncRecordingRulesResponseBody body);

        @Override
        SyncRecordingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncRecordingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncRecordingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncRecordingRulesResponse response) {
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
        public Builder body(SyncRecordingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncRecordingRulesResponse build() {
            return new SyncRecordingRulesResponse(this);
        } 

    } 

}
