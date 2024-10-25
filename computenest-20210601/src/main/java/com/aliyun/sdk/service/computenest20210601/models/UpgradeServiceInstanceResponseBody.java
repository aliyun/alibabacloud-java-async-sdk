// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeServiceInstanceResponseBody</p>
 */
public class UpgradeServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpgradeRequiredParameters")
    private java.util.List < String > upgradeRequiredParameters;

    private UpgradeServiceInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.upgradeRequiredParameters = builder.upgradeRequiredParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeServiceInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return upgradeRequiredParameters
     */
    public java.util.List < String > getUpgradeRequiredParameters() {
        return this.upgradeRequiredParameters;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > upgradeRequiredParameters; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpgradeRequiredParameters.
         */
        public Builder upgradeRequiredParameters(java.util.List < String > upgradeRequiredParameters) {
            this.upgradeRequiredParameters = upgradeRequiredParameters;
            return this;
        }

        public UpgradeServiceInstanceResponseBody build() {
            return new UpgradeServiceInstanceResponseBody(this);
        } 

    } 

}
