// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVoiceAppraiseResponse} extends {@link TeaModel}
 *
 * <p>ListVoiceAppraiseResponse</p>
 */
public class ListVoiceAppraiseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVoiceAppraiseResponseBody body;

    private ListVoiceAppraiseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVoiceAppraiseResponse create() {
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
    public ListVoiceAppraiseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVoiceAppraiseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVoiceAppraiseResponseBody body);

        @Override
        ListVoiceAppraiseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVoiceAppraiseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVoiceAppraiseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVoiceAppraiseResponse response) {
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
        public Builder body(ListVoiceAppraiseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVoiceAppraiseResponse build() {
            return new ListVoiceAppraiseResponse(this);
        } 

    } 

}
