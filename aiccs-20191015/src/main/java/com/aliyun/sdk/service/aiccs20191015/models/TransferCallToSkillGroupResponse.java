// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferCallToSkillGroupResponse} extends {@link TeaModel}
 *
 * <p>TransferCallToSkillGroupResponse</p>
 */
public class TransferCallToSkillGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferCallToSkillGroupResponseBody body;

    private TransferCallToSkillGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferCallToSkillGroupResponse create() {
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
    public TransferCallToSkillGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferCallToSkillGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferCallToSkillGroupResponseBody body);

        @Override
        TransferCallToSkillGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferCallToSkillGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferCallToSkillGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferCallToSkillGroupResponse response) {
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
        public Builder body(TransferCallToSkillGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferCallToSkillGroupResponse build() {
            return new TransferCallToSkillGroupResponse(this);
        } 

    } 

}
