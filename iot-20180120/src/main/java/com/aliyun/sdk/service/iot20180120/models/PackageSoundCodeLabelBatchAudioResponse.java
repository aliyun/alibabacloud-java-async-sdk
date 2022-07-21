// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PackageSoundCodeLabelBatchAudioResponse} extends {@link TeaModel}
 *
 * <p>PackageSoundCodeLabelBatchAudioResponse</p>
 */
public class PackageSoundCodeLabelBatchAudioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PackageSoundCodeLabelBatchAudioResponseBody body;

    private PackageSoundCodeLabelBatchAudioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PackageSoundCodeLabelBatchAudioResponse create() {
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
    public PackageSoundCodeLabelBatchAudioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PackageSoundCodeLabelBatchAudioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PackageSoundCodeLabelBatchAudioResponseBody body);

        @Override
        PackageSoundCodeLabelBatchAudioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PackageSoundCodeLabelBatchAudioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PackageSoundCodeLabelBatchAudioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PackageSoundCodeLabelBatchAudioResponse response) {
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
        public Builder body(PackageSoundCodeLabelBatchAudioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PackageSoundCodeLabelBatchAudioResponse build() {
            return new PackageSoundCodeLabelBatchAudioResponse(this);
        } 

    } 

}
