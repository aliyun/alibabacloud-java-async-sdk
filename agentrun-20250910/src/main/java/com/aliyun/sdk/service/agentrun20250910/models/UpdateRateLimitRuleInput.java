// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateRateLimitRuleInput} extends {@link TeaModel}
 *
 * <p>UpdateRateLimitRuleInput</p>
 */
public class UpdateRateLimitRuleInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("windows")
    private java.util.List<WindowLimit> windows;

    private UpdateRateLimitRuleInput(Builder builder) {
        this.enabled = builder.enabled;
        this.windows = builder.windows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRateLimitRuleInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return windows
     */
    public java.util.List<WindowLimit> getWindows() {
        return this.windows;
    }

    public static final class Builder {
        private Boolean enabled; 
        private java.util.List<WindowLimit> windows; 

        private Builder() {
        } 

        private Builder(UpdateRateLimitRuleInput model) {
            this.enabled = model.enabled;
            this.windows = model.windows;
        } 

        /**
         * <p>是否启用该限流规则</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>限流时间窗口配置列表，提供时将整组覆盖</p>
         */
        public Builder windows(java.util.List<WindowLimit> windows) {
            this.windows = windows;
            return this;
        }

        public UpdateRateLimitRuleInput build() {
            return new UpdateRateLimitRuleInput(this);
        } 

    } 

}
