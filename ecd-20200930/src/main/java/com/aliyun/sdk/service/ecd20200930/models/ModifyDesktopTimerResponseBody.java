// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyDesktopTimerResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopTimerResponseBody</p>
 */
public class ModifyDesktopTimerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopIds")
    private java.util.List<String> desktopIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDesktopTimerResponseBody(Builder builder) {
        this.desktopIds = builder.desktopIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopTimerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopIds
     */
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> desktopIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyDesktopTimerResponseBody model) {
            this.desktopIds = model.desktopIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the cloud computers for which you successfully configure the scheduled task.</p>
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4638719F-3CAB-5704-BD54-55617BFF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDesktopTimerResponseBody build() {
            return new ModifyDesktopTimerResponseBody(this);
        } 

    } 

}
