// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAdvancedSettingResponse} extends {@link TeaModel}
 *
 * <p>UpdateAdvancedSettingResponse</p>
 */
public class UpdateAdvancedSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAdvancedSettingResponseBody body;

    private UpdateAdvancedSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAdvancedSettingResponse create() {
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
    public UpdateAdvancedSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAdvancedSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAdvancedSettingResponseBody body);

        @Override
        UpdateAdvancedSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAdvancedSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAdvancedSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAdvancedSettingResponse response) {
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
        public Builder body(UpdateAdvancedSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAdvancedSettingResponse build() {
            return new UpdateAdvancedSettingResponse(this);
        } 

    } 

}
