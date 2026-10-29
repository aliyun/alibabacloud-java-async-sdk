// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyVulTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVulTargetResponseBody</p>
 */
public class ModifyVulTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyVulTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulTargetResponseBody create() {
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

        private Builder(ModifyVulTargetResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>38597320-A990-5444-9A4C-7A1269610C2A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVulTargetResponseBody build() {
            return new ModifyVulTargetResponseBody(this);
        } 

    } 

}
