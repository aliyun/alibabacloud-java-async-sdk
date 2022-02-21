// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReprotectDiskReplicaPairResponse} extends {@link TeaModel}
 *
 * <p>ReprotectDiskReplicaPairResponse</p>
 */
public class ReprotectDiskReplicaPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReprotectDiskReplicaPairResponseBody body;

    private ReprotectDiskReplicaPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReprotectDiskReplicaPairResponse create() {
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
    public ReprotectDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReprotectDiskReplicaPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReprotectDiskReplicaPairResponseBody body);

        @Override
        ReprotectDiskReplicaPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReprotectDiskReplicaPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReprotectDiskReplicaPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReprotectDiskReplicaPairResponse response) {
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
        public Builder body(ReprotectDiskReplicaPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReprotectDiskReplicaPairResponse build() {
            return new ReprotectDiskReplicaPairResponse(this);
        } 

    } 

}
