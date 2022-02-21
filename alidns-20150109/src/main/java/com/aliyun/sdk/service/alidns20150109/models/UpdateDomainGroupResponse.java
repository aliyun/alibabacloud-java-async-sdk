// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateDomainGroupResponse</p>
 */
public class UpdateDomainGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDomainGroupResponseBody body;

    private UpdateDomainGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDomainGroupResponse create() {
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
    public UpdateDomainGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDomainGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDomainGroupResponseBody body);

        @Override
        UpdateDomainGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDomainGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDomainGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDomainGroupResponse response) {
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
        public Builder body(UpdateDomainGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDomainGroupResponse build() {
            return new UpdateDomainGroupResponse(this);
        } 

    } 

}
