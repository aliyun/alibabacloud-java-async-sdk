// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCustomQAV2Response} extends {@link TeaModel}
 *
 * <p>AddCustomQAV2Response</p>
 */
public class AddCustomQAV2Response extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AddCustomQAV2ResponseBody body;

    private AddCustomQAV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddCustomQAV2Response create() {
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
    public AddCustomQAV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCustomQAV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddCustomQAV2ResponseBody body);

        @Override
        AddCustomQAV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCustomQAV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddCustomQAV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCustomQAV2Response response) {
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
        public Builder body(AddCustomQAV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCustomQAV2Response build() {
            return new AddCustomQAV2Response(this);
        } 

    } 

}
