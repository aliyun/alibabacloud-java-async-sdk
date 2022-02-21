// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainRecordResponse} extends {@link TeaModel}
 *
 * <p>UpdateDomainRecordResponse</p>
 */
public class UpdateDomainRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDomainRecordResponseBody body;

    private UpdateDomainRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDomainRecordResponse create() {
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
    public UpdateDomainRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDomainRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDomainRecordResponseBody body);

        @Override
        UpdateDomainRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDomainRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDomainRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDomainRecordResponse response) {
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
        public Builder body(UpdateDomainRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDomainRecordResponse build() {
            return new UpdateDomainRecordResponse(this);
        } 

    } 

}
