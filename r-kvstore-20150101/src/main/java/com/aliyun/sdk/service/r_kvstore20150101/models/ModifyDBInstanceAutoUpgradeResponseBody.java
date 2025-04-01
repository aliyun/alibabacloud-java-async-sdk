// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link ModifyDBInstanceAutoUpgradeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceAutoUpgradeResponseBody</p>
 */
public class ModifyDBInstanceAutoUpgradeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceAutoUpgradeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceAutoUpgradeResponseBody create() {
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

        private Builder(ModifyDBInstanceAutoUpgradeResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2FF6158E-3394-4A90-B634-79C49184****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBInstanceAutoUpgradeResponseBody build() {
            return new ModifyDBInstanceAutoUpgradeResponseBody(this);
        } 

    } 

}
