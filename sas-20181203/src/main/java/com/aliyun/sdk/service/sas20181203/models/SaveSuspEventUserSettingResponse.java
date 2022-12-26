// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSuspEventUserSettingResponse} extends {@link TeaModel}
 *
 * <p>SaveSuspEventUserSettingResponse</p>
 */
public class SaveSuspEventUserSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSuspEventUserSettingResponseBody body;

    private SaveSuspEventUserSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSuspEventUserSettingResponse create() {
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
    public SaveSuspEventUserSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSuspEventUserSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSuspEventUserSettingResponseBody body);

        @Override
        SaveSuspEventUserSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSuspEventUserSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSuspEventUserSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSuspEventUserSettingResponse response) {
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
        public Builder body(SaveSuspEventUserSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSuspEventUserSettingResponse build() {
            return new SaveSuspEventUserSettingResponse(this);
        } 

    } 

}
