// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeMultiZoneClusterResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeMultiZoneClusterResponseBody</p>
 */
public class UpgradeMultiZoneClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpgradingComponents")
    private String upgradingComponents;

    private UpgradeMultiZoneClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.upgradingComponents = builder.upgradingComponents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMultiZoneClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return upgradingComponents
     */
    public String getUpgradingComponents() {
        return this.upgradingComponents;
    }

    public static final class Builder {
        private String requestId; 
        private String upgradingComponents; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpgradingComponents.
         */
        public Builder upgradingComponents(String upgradingComponents) {
            this.upgradingComponents = upgradingComponents;
            return this;
        }

        public UpgradeMultiZoneClusterResponseBody build() {
            return new UpgradeMultiZoneClusterResponseBody(this);
        } 

    } 

}
