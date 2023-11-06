// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachConfigRuleToCompliancePackResponse} extends {@link TeaModel}
 *
 * <p>DetachConfigRuleToCompliancePackResponse</p>
 */
public class DetachConfigRuleToCompliancePackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DetachConfigRuleToCompliancePackResponseBody body;

    private DetachConfigRuleToCompliancePackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DetachConfigRuleToCompliancePackResponse create() {
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
    public DetachConfigRuleToCompliancePackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachConfigRuleToCompliancePackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DetachConfigRuleToCompliancePackResponseBody body);

        @Override
        DetachConfigRuleToCompliancePackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachConfigRuleToCompliancePackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DetachConfigRuleToCompliancePackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachConfigRuleToCompliancePackResponse response) {
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
        public Builder body(DetachConfigRuleToCompliancePackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachConfigRuleToCompliancePackResponse build() {
            return new DetachConfigRuleToCompliancePackResponse(this);
        } 

    } 

}
