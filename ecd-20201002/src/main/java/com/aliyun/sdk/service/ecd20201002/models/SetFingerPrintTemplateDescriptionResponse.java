// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetFingerPrintTemplateDescriptionResponse} extends {@link TeaModel}
 *
 * <p>SetFingerPrintTemplateDescriptionResponse</p>
 */
public class SetFingerPrintTemplateDescriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetFingerPrintTemplateDescriptionResponseBody body;

    private SetFingerPrintTemplateDescriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetFingerPrintTemplateDescriptionResponse create() {
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
    public SetFingerPrintTemplateDescriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetFingerPrintTemplateDescriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetFingerPrintTemplateDescriptionResponseBody body);

        @Override
        SetFingerPrintTemplateDescriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetFingerPrintTemplateDescriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetFingerPrintTemplateDescriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetFingerPrintTemplateDescriptionResponse response) {
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
        public Builder body(SetFingerPrintTemplateDescriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetFingerPrintTemplateDescriptionResponse build() {
            return new SetFingerPrintTemplateDescriptionResponse(this);
        } 

    } 

}
