// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link ModifyMaintenanceActionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyMaintenanceActionResponseBody</p>
 */
public class ModifyMaintenanceActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyMaintenanceActionResponseBody(Builder builder) {
        this.ids = builder.ids;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMaintenanceActionResponseBody create() {
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

        private Builder(ModifyMaintenanceActionResponseBody model) {
            this.ids = model.ids;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The O&amp;M event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7856CBE7-5BD0-4EE1-AC62-749392******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyMaintenanceActionResponseBody build() {
            return new ModifyMaintenanceActionResponseBody(this);
        } 

    } 

}
