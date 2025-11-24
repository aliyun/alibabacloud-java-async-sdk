// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeDetailGatewayStatusRecordValue} extends {@link TeaModel}
 *
 * <p>UpgradeDetailGatewayStatusRecordValue</p>
 */
public class UpgradeDetailGatewayStatusRecordValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Version")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpgradeDetailGatewayStatusRecordValue model) {
            this.status = model.status;
            this.message = model.message;
            this.version = model.version;
        } 

        /**
         * <p>The upgrade status of the ingress gateway. Valid values:</p>
         * <ul>
         * <li><code>upgrading</code>: The ingress gateway is being upgraded.</li>
         * <li><code>pending</code>: The ingress gateway waits to be upgraded.</li>
         * <li><code>finished</code>: The ingress gateway upgrade is complete.</li>
         * <li><code>notStart</code>: The ingress gateway upgrade does not start.</li>
         * <li><code>failed</code>: The ingress gateway upgrade fails.</li>
         * <li><code>unknown</code>: The upgrade status of the ingress gateway is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upgrading</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Additional status information of the ingress gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The version of the ingress gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1.9.7</p>
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
