// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeDomainGroupResponse} extends {@link TeaModel}
 *
 * <p>ChangeDomainGroupResponse</p>
 */
public class ChangeDomainGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeDomainGroupResponseBody body;

    private ChangeDomainGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeDomainGroupResponse create() {
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
    public ChangeDomainGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeDomainGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeDomainGroupResponseBody body);

        @Override
        ChangeDomainGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeDomainGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeDomainGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeDomainGroupResponse response) {
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
        public Builder body(ChangeDomainGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeDomainGroupResponse build() {
            return new ChangeDomainGroupResponse(this);
        } 

    } 

}
