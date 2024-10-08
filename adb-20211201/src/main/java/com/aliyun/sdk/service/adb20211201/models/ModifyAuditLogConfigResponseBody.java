// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAuditLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAuditLogConfigResponseBody</p>
 */
public class ModifyAuditLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateSucceed")
    private Boolean updateSucceed;

    private ModifyAuditLogConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.updateSucceed = builder.updateSucceed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAuditLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateSucceed
     */
    public Boolean getUpdateSucceed() {
        return this.updateSucceed;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean updateSucceed; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the status of SQL audit is updated. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder updateSucceed(Boolean updateSucceed) {
            this.updateSucceed = updateSucceed;
            return this;
        }

        public ModifyAuditLogConfigResponseBody build() {
            return new ModifyAuditLogConfigResponseBody(this);
        } 

    } 

}
