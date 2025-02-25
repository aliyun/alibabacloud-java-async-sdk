// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateAllInOneGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>ActivateAllInOneGatewayResponseBody</p>
 */
public class ActivateAllInOneGatewayResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GatewayId")
    private String gatewayId;

    @NameInMap("LicenseContent")
    private String licenseContent;

    @NameInMap("Message")
    private String message;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ActivateAllInOneGatewayResponseBody(Builder builder) {
        this.code = builder.code;
        this.gatewayId = builder.gatewayId;
        this.licenseContent = builder.licenseContent;
        this.message = builder.message;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateAllInOneGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return licenseContent
     */
    public String getLicenseContent() {
        return this.licenseContent;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String gatewayId; 
        private String licenseContent; 
        private String message; 
        private String regionId; 
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
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * LicenseContent.
         */
        public Builder licenseContent(String licenseContent) {
            this.licenseContent = licenseContent;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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

        public ActivateAllInOneGatewayResponseBody build() {
            return new ActivateAllInOneGatewayResponseBody(this);
        } 

    } 

}
