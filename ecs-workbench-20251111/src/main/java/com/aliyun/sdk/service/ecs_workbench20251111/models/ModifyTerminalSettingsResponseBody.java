// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20251111.models;

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
 * {@link ModifyTerminalSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTerminalSettingsResponseBody</p>
 */
public class ModifyTerminalSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyTerminalSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTerminalSettingsResponseBody create() {
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

        private Builder(ModifyTerminalSettingsResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>47348885-C929-489A-93D7-B2E99D50D77B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyTerminalSettingsResponseBody build() {
            return new ModifyTerminalSettingsResponseBody(this);
        } 

    } 

}
