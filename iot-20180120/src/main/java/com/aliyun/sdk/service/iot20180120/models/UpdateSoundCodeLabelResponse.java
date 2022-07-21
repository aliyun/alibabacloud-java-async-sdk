// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSoundCodeLabelResponse} extends {@link TeaModel}
 *
 * <p>UpdateSoundCodeLabelResponse</p>
 */
public class UpdateSoundCodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSoundCodeLabelResponseBody body;

    private UpdateSoundCodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSoundCodeLabelResponse create() {
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
    public UpdateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSoundCodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSoundCodeLabelResponseBody body);

        @Override
        UpdateSoundCodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSoundCodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSoundCodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSoundCodeLabelResponse response) {
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
        public Builder body(UpdateSoundCodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSoundCodeLabelResponse build() {
            return new UpdateSoundCodeLabelResponse(this);
        } 

    } 

}
