// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTopicAttributesResponse} extends {@link TeaModel}
 *
 * <p>SetTopicAttributesResponse</p>
 */
public class SetTopicAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetTopicAttributesResponseBody body;

    private SetTopicAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetTopicAttributesResponse create() {
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
    public SetTopicAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetTopicAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetTopicAttributesResponseBody body);

        @Override
        SetTopicAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetTopicAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetTopicAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetTopicAttributesResponse response) {
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
        public Builder body(SetTopicAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetTopicAttributesResponse build() {
            return new SetTopicAttributesResponse(this);
        } 

    } 

}
