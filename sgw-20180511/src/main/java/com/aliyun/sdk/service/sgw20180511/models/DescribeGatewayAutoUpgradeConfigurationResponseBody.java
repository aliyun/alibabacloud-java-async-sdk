// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayAutoUpgradeConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayAutoUpgradeConfigurationResponseBody</p>
 */
public class DescribeGatewayAutoUpgradeConfigurationResponseBody extends TeaModel {
    @NameInMap("AutoUpgradeEndHour")
    private Integer autoUpgradeEndHour;

    @NameInMap("AutoUpgradeStartHour")
    private Integer autoUpgradeStartHour;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsAutoUpgrade")
    private Boolean isAutoUpgrade;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayAutoUpgradeConfigurationResponseBody(Builder builder) {
        this.autoUpgradeEndHour = builder.autoUpgradeEndHour;
        this.autoUpgradeStartHour = builder.autoUpgradeStartHour;
        this.code = builder.code;
        this.isAutoUpgrade = builder.isAutoUpgrade;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayAutoUpgradeConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoUpgradeEndHour
     */
    public Integer getAutoUpgradeEndHour() {
        return this.autoUpgradeEndHour;
    }

    /**
     * @return autoUpgradeStartHour
     */
    public Integer getAutoUpgradeStartHour() {
        return this.autoUpgradeStartHour;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isAutoUpgrade
     */
    public Boolean getIsAutoUpgrade() {
        return this.isAutoUpgrade;
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
        private Integer autoUpgradeEndHour; 
        private Integer autoUpgradeStartHour; 
        private String code; 
        private Boolean isAutoUpgrade; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AutoUpgradeEndHour.
         */
        public Builder autoUpgradeEndHour(Integer autoUpgradeEndHour) {
            this.autoUpgradeEndHour = autoUpgradeEndHour;
            return this;
        }

        /**
         * AutoUpgradeStartHour.
         */
        public Builder autoUpgradeStartHour(Integer autoUpgradeStartHour) {
            this.autoUpgradeStartHour = autoUpgradeStartHour;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsAutoUpgrade.
         */
        public Builder isAutoUpgrade(Boolean isAutoUpgrade) {
            this.isAutoUpgrade = isAutoUpgrade;
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

        public DescribeGatewayAutoUpgradeConfigurationResponseBody build() {
            return new DescribeGatewayAutoUpgradeConfigurationResponseBody(this);
        } 

    } 

}
