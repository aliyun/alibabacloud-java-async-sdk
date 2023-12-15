// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceIdsByAliyunUidV2Response} extends {@link TeaModel}
 *
 * <p>GetInstanceIdsByAliyunUidV2Response</p>
 */
public class GetInstanceIdsByAliyunUidV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceIdsByAliyunUidV2ResponseBody body;

    private GetInstanceIdsByAliyunUidV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetInstanceIdsByAliyunUidV2Response create() {
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
    public GetInstanceIdsByAliyunUidV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceIdsByAliyunUidV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetInstanceIdsByAliyunUidV2ResponseBody body);

        @Override
        GetInstanceIdsByAliyunUidV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceIdsByAliyunUidV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetInstanceIdsByAliyunUidV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceIdsByAliyunUidV2Response response) {
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
        public Builder body(GetInstanceIdsByAliyunUidV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceIdsByAliyunUidV2Response build() {
            return new GetInstanceIdsByAliyunUidV2Response(this);
        } 

    } 

}
