// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMemberKeyByKMSResponse} extends {@link TeaModel}
 *
 * <p>UpdateMemberKeyByKMSResponse</p>
 */
public class UpdateMemberKeyByKMSResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMemberKeyByKMSResponseBody body;

    private UpdateMemberKeyByKMSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMemberKeyByKMSResponse create() {
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
    public UpdateMemberKeyByKMSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMemberKeyByKMSResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMemberKeyByKMSResponseBody body);

        @Override
        UpdateMemberKeyByKMSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMemberKeyByKMSResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMemberKeyByKMSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMemberKeyByKMSResponse response) {
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
        public Builder body(UpdateMemberKeyByKMSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMemberKeyByKMSResponse build() {
            return new UpdateMemberKeyByKMSResponse(this);
        } 

    } 

}
