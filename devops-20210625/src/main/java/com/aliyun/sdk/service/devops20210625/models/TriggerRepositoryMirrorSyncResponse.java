// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerRepositoryMirrorSyncResponse} extends {@link TeaModel}
 *
 * <p>TriggerRepositoryMirrorSyncResponse</p>
 */
public class TriggerRepositoryMirrorSyncResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TriggerRepositoryMirrorSyncResponseBody body;

    private TriggerRepositoryMirrorSyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TriggerRepositoryMirrorSyncResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public TriggerRepositoryMirrorSyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TriggerRepositoryMirrorSyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(TriggerRepositoryMirrorSyncResponseBody body);

        @Override
        TriggerRepositoryMirrorSyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TriggerRepositoryMirrorSyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private TriggerRepositoryMirrorSyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TriggerRepositoryMirrorSyncResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(TriggerRepositoryMirrorSyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TriggerRepositoryMirrorSyncResponse build() {
            return new TriggerRepositoryMirrorSyncResponse(this);
        } 

    } 

}
