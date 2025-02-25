// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link UpgradeMinorVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeMinorVersionResponseBody</p>
 */
public class UpgradeMinorVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpgradingComponents")
    private String upgradingComponents;

    private UpgradeMinorVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.upgradingComponents = builder.upgradingComponents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMinorVersionResponseBody create() {
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

        public UpgradeMinorVersionResponseBody build() {
            return new UpgradeMinorVersionResponseBody(this);
        } 

    } 

}
