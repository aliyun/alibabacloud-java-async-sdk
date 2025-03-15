// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyPendingMaintenanceActionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPendingMaintenanceActionResponseBody</p>
 */
public class ModifyPendingMaintenanceActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyPendingMaintenanceActionResponseBody(Builder builder) {
        this.ids = builder.ids;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPendingMaintenanceActionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ids; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyPendingMaintenanceActionResponseBody model) {
            this.ids = model.ids;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>93061E17-B56A-4324-BC95-D0FFD2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyPendingMaintenanceActionResponseBody build() {
            return new ModifyPendingMaintenanceActionResponseBody(this);
        } 

    } 

}
