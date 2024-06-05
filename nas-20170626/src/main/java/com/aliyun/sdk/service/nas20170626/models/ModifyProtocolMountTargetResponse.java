// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyProtocolMountTargetResponse} extends {@link TeaModel}
 *
 * <p>ModifyProtocolMountTargetResponse</p>
 */
public class ModifyProtocolMountTargetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyProtocolMountTargetResponseBody body;

    private ModifyProtocolMountTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyProtocolMountTargetResponse create() {
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
    public ModifyProtocolMountTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyProtocolMountTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyProtocolMountTargetResponseBody body);

        @Override
        ModifyProtocolMountTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyProtocolMountTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyProtocolMountTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyProtocolMountTargetResponse response) {
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
        public Builder body(ModifyProtocolMountTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyProtocolMountTargetResponse build() {
            return new ModifyProtocolMountTargetResponse(this);
        } 

    } 

}
