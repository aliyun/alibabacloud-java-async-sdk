// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DisplayAIAuditSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DisplayAIAuditSwitchResponseBody</p>
 */
public class DisplayAIAuditSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsDisplay")
    private Boolean isDisplay;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisplayAIAuditSwitchResponseBody(Builder builder) {
        this.isDisplay = builder.isDisplay;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisplayAIAuditSwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDisplay
     */
    public Boolean getIsDisplay() {
        return this.isDisplay;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isDisplay; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DisplayAIAuditSwitchResponseBody model) {
            this.isDisplay = model.isDisplay;
            this.requestId = model.requestId;
        } 

        /**
         * IsDisplay.
         */
        public Builder isDisplay(Boolean isDisplay) {
            this.isDisplay = isDisplay;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisplayAIAuditSwitchResponseBody build() {
            return new DisplayAIAuditSwitchResponseBody(this);
        } 

    } 

}
