// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainRecordRemarkResponse} extends {@link TeaModel}
 *
 * <p>UpdateDomainRecordRemarkResponse</p>
 */
public class UpdateDomainRecordRemarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDomainRecordRemarkResponseBody body;

    private UpdateDomainRecordRemarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDomainRecordRemarkResponse create() {
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
    public UpdateDomainRecordRemarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDomainRecordRemarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDomainRecordRemarkResponseBody body);

        @Override
        UpdateDomainRecordRemarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDomainRecordRemarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDomainRecordRemarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDomainRecordRemarkResponse response) {
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
        public Builder body(UpdateDomainRecordRemarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDomainRecordRemarkResponse build() {
            return new UpdateDomainRecordRemarkResponse(this);
        } 

    } 

}
