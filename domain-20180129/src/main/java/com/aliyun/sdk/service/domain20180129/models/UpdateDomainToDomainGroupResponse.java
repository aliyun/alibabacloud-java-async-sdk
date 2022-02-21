// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainToDomainGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateDomainToDomainGroupResponse</p>
 */
public class UpdateDomainToDomainGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDomainToDomainGroupResponseBody body;

    private UpdateDomainToDomainGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDomainToDomainGroupResponse create() {
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
    public UpdateDomainToDomainGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDomainToDomainGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDomainToDomainGroupResponseBody body);

        @Override
        UpdateDomainToDomainGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDomainToDomainGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDomainToDomainGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDomainToDomainGroupResponse response) {
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
        public Builder body(UpdateDomainToDomainGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDomainToDomainGroupResponse build() {
            return new UpdateDomainToDomainGroupResponse(this);
        } 

    } 

}
