// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingGroupV2Response} extends {@link TeaModel}
 *
 * <p>CreateScalingGroupV2Response</p>
 */
public class CreateScalingGroupV2Response extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateScalingGroupV2ResponseBody body;

    private CreateScalingGroupV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateScalingGroupV2Response create() {
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
    public CreateScalingGroupV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScalingGroupV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateScalingGroupV2ResponseBody body);

        @Override
        CreateScalingGroupV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScalingGroupV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateScalingGroupV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScalingGroupV2Response response) {
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
        public Builder body(CreateScalingGroupV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScalingGroupV2Response build() {
            return new CreateScalingGroupV2Response(this);
        } 

    } 

}
