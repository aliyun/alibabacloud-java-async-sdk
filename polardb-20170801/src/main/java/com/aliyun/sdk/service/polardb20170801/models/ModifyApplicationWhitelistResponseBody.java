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
 * {@link ModifyApplicationWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyApplicationWhitelistResponseBody</p>
 */
public class ModifyApplicationWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ComponentId")
    private String componentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyApplicationWhitelistResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.componentId = builder.componentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationWhitelistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private String componentId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyApplicationWhitelistResponseBody model) {
            this.applicationId = model.applicationId;
            this.componentId = model.componentId;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ComponentId.
         */
        public Builder componentId(String componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyApplicationWhitelistResponseBody build() {
            return new ModifyApplicationWhitelistResponseBody(this);
        } 

    } 

}
