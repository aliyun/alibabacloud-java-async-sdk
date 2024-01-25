// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolicyV2Response} extends {@link TeaModel}
 *
 * <p>UpdatePolicyV2Response</p>
 */
public class UpdatePolicyV2Response extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdatePolicyV2ResponseBody body;

    private UpdatePolicyV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdatePolicyV2Response create() {
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
    public UpdatePolicyV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePolicyV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdatePolicyV2ResponseBody body);

        @Override
        UpdatePolicyV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePolicyV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdatePolicyV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePolicyV2Response response) {
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
        public Builder body(UpdatePolicyV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePolicyV2Response build() {
            return new UpdatePolicyV2Response(this);
        } 

    } 

}
