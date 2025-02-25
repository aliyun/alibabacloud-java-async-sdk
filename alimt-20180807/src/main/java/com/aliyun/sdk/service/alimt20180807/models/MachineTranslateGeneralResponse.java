// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20180807.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MachineTranslateGeneralResponse} extends {@link TeaModel}
 *
 * <p>MachineTranslateGeneralResponse</p>
 */
public class MachineTranslateGeneralResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private MachineTranslateGeneralResponseBody body;

    private MachineTranslateGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static MachineTranslateGeneralResponse create() {
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
    public MachineTranslateGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MachineTranslateGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(MachineTranslateGeneralResponseBody body);

        @Override
        MachineTranslateGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MachineTranslateGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private MachineTranslateGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MachineTranslateGeneralResponse response) {
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
        public Builder body(MachineTranslateGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MachineTranslateGeneralResponse build() {
            return new MachineTranslateGeneralResponse(this);
        } 

    } 

}
