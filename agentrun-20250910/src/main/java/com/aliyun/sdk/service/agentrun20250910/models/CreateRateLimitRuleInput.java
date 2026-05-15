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
 * {@link CreateRateLimitRuleInput} extends {@link TeaModel}
 *
 * <p>CreateRateLimitRuleInput</p>
 */
public class CreateRateLimitRuleInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("descriptorId")
    private String descriptorId;

    @com.aliyun.core.annotation.NameInMap("descriptorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String descriptorType;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("windows")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<WindowLimit> windows;

    private CreateRateLimitRuleInput(Builder builder) {
        this.descriptorId = builder.descriptorId;
        this.descriptorType = builder.descriptorType;
        this.enabled = builder.enabled;
        this.windows = builder.windows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRateLimitRuleInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return descriptorId
     */
    public String getDescriptorId() {
        return this.descriptorId;
    }

    /**
     * @return descriptorType
     */
    public String getDescriptorType() {
        return this.descriptorType;
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
        private String descriptorId; 
        private String descriptorType; 
        private Boolean enabled; 
        private java.util.List<WindowLimit> windows; 

        private Builder() {
        } 

        private Builder(CreateRateLimitRuleInput model) {
            this.descriptorId = model.descriptorId;
            this.descriptorType = model.descriptorType;
            this.enabled = model.enabled;
            this.windows = model.windows;
        } 

        /**
         * <p>限流规则的描述符标识；非model维时必填，model维由服务端拼接</p>
         * 
         * <strong>example:</strong>
         * <p>model:gpt-4</p>
         */
        public Builder descriptorId(String descriptorId) {
            this.descriptorId = descriptorId;
            return this;
        }

        /**
         * <p>限流规则的描述符类型，如model、user等</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        public Builder descriptorType(String descriptorType) {
            this.descriptorType = descriptorType;
            return this;
        }

        /**
         * <p>是否启用该限流规则</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>限流时间窗口配置列表，至少需要一个窗口</p>
         * <p>This parameter is required.</p>
         */
        public Builder windows(java.util.List<WindowLimit> windows) {
            this.windows = windows;
            return this;
        }

        public CreateRateLimitRuleInput build() {
            return new CreateRateLimitRuleInput(this);
        } 

    } 

}
