// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDetailGatewayStatusRecordValue} extends {@link TeaModel}
 *
 * <p>UpgradeDetailGatewayStatusRecordValue</p>
 */
public class UpgradeDetailGatewayStatusRecordValue extends TeaModel {
    @NameInMap("Status")
    private String status;

    @NameInMap("Message")
    private String message;

    @NameInMap("Version")
    private String version;

    private UpgradeDetailGatewayStatusRecordValue(Builder builder) {
        this.status = builder.status;
        this.message = builder.message;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDetailGatewayStatusRecordValue create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String status; 
        private String message; 
        private String version; 

        /**
         * The upgrade status of the ingress gateway. Valid values:
         * <p>
         * 
         * *   `upgrading`: The ingress gateway is being upgraded.
         * *   `pending`: The ingress gateway waits to be upgraded.
         * *   `finished`: The ingress gateway upgrade is complete.
         * *   `notStart`: The ingress gateway upgrade does not start.
         * *   `failed`: The ingress gateway upgrade fails.
         * *   `unknown`: The upgrade status of the ingress gateway is unknown.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Additional status information of the ingress gateway.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The version of the ingress gateway.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public UpgradeDetailGatewayStatusRecordValue build() {
            return new UpgradeDetailGatewayStatusRecordValue(this);
        } 

    } 

}
