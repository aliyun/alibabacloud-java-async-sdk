// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportConversationDetailsResponse} extends {@link TeaModel}
 *
 * <p>ExportConversationDetailsResponse</p>
 */
public class ExportConversationDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportConversationDetailsResponseBody body;

    private ExportConversationDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportConversationDetailsResponse create() {
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
    public ExportConversationDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportConversationDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportConversationDetailsResponseBody body);

        @Override
        ExportConversationDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportConversationDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportConversationDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportConversationDetailsResponse response) {
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
        public Builder body(ExportConversationDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportConversationDetailsResponse build() {
            return new ExportConversationDetailsResponse(this);
        } 

    } 

}
