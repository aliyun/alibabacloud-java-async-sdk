// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckGatewayEssdSupportResponseBody} extends {@link TeaModel}
 *
 * <p>CheckGatewayEssdSupportResponseBody</p>
 */
public class CheckGatewayEssdSupportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsServiceAffect")
    private Boolean isServiceAffect;

    @NameInMap("IsSupportEssd")
    private Boolean isSupportEssd;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CheckGatewayEssdSupportResponseBody(Builder builder) {
        this.code = builder.code;
        this.isServiceAffect = builder.isServiceAffect;
        this.isSupportEssd = builder.isSupportEssd;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckGatewayEssdSupportResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isServiceAffect
     */
    public Boolean getIsServiceAffect() {
        return this.isServiceAffect;
    }

    /**
     * @return isSupportEssd
     */
    public Boolean getIsSupportEssd() {
        return this.isSupportEssd;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Boolean isServiceAffect; 
        private Boolean isSupportEssd; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsServiceAffect.
         */
        public Builder isServiceAffect(Boolean isServiceAffect) {
            this.isServiceAffect = isServiceAffect;
            return this;
        }

        /**
         * IsSupportEssd.
         */
        public Builder isSupportEssd(Boolean isSupportEssd) {
            this.isSupportEssd = isSupportEssd;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckGatewayEssdSupportResponseBody build() {
            return new CheckGatewayEssdSupportResponseBody(this);
        } 

    } 

}
