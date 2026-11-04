// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBInstanceAutoUpgradeMinorVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceAutoUpgradeMinorVersionResponseBody</p>
 */
public class ModifyDBInstanceAutoUpgradeMinorVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceAutoUpgradeMinorVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceAutoUpgradeMinorVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyDBInstanceAutoUpgradeMinorVersionResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A31818D5-0550-4A81-8D13-B45948D7193F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBInstanceAutoUpgradeMinorVersionResponseBody build() {
            return new ModifyDBInstanceAutoUpgradeMinorVersionResponseBody(this);
        } 

    } 

}
