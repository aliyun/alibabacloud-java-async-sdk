// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetAutomaticFrequencyControlConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SetAutomaticFrequencyControlConfigResponseBody</p>
 */
public class SetAutomaticFrequencyControlConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetAutomaticFrequencyControlConfigResponseBody(Builder builder) {
        this.actionType = builder.actionType;
        this.enable = builder.enable;
        this.level = builder.level;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAutomaticFrequencyControlConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String actionType; 
        private String enable; 
        private String level; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetAutomaticFrequencyControlConfigResponseBody model) {
            this.actionType = model.actionType;
            this.enable = model.enable;
            this.level = model.level;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The action taken on requests that trigger the control. Valid values:</p>
         * <ul>
         * <li><p><strong>observe</strong>: Requests are monitored.</p>
         * </li>
         * <li><p><strong>deny</strong>: Requests are blocked.</p>
         * </li>
         * <li><p><strong>js</strong>: JS challenges are issued.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>js</p>
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>Indicates whether automatic frequency control is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The protection level. Valid values:</p>
         * <ul>
         * <li><p><strong>loose</strong>: Loose protection.</p>
         * </li>
         * <li><p><strong>normal</strong>: Normal protection.</p>
         * </li>
         * <li><p><strong>strict</strong>: Strict protection.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetAutomaticFrequencyControlConfigResponseBody build() {
            return new SetAutomaticFrequencyControlConfigResponseBody(this);
        } 

    } 

}
