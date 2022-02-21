// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextStructureResponse} extends {@link TeaModel}
 *
 * <p>TextStructureResponse</p>
 */
public class TextStructureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private TextStructureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static TextStructureResponse create() {
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

    public interface Builder extends Response.Builder<TextStructureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        TextStructureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TextStructureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TextStructureResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public TextStructureResponse build() {
            return new TextStructureResponse(this);
        } 

    } 

}
