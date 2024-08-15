// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetControlPolicyEnablementStatusResponse} extends {@link TeaModel}
 *
 * <p>GetControlPolicyEnablementStatusResponse</p>
 */
public class GetControlPolicyEnablementStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetControlPolicyEnablementStatusResponseBody body;

    private GetControlPolicyEnablementStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetControlPolicyEnablementStatusResponse create() {
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
    public GetControlPolicyEnablementStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetControlPolicyEnablementStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetControlPolicyEnablementStatusResponseBody body);

        @Override
        GetControlPolicyEnablementStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetControlPolicyEnablementStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetControlPolicyEnablementStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetControlPolicyEnablementStatusResponse response) {
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
        public Builder body(GetControlPolicyEnablementStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetControlPolicyEnablementStatusResponse build() {
            return new GetControlPolicyEnablementStatusResponse(this);
        } 

    } 

}
