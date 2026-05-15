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
 * {@link RateLimitRule} extends {@link TeaModel}
 *
 * <p>RateLimitRule</p>
 */
public class RateLimitRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("descriptorId")
    private String descriptorId;

    @com.aliyun.core.annotation.NameInMap("descriptorType")
    private String descriptorType;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("rateLimitRuleId")
    private String rateLimitRuleId;

    @com.aliyun.core.annotation.NameInMap("windows")
    private java.util.List<WindowLimit> windows;

    private RateLimitRule(Builder builder) {
        this.createdAt = builder.createdAt;
        this.descriptorId = builder.descriptorId;
        this.descriptorType = builder.descriptorType;
        this.enabled = builder.enabled;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.rateLimitRuleId = builder.rateLimitRuleId;
        this.windows = builder.windows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RateLimitRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return rateLimitRuleId
     */
    public String getRateLimitRuleId() {
        return this.rateLimitRuleId;
    }

    /**
     * @return windows
     */
    public java.util.List<WindowLimit> getWindows() {
        return this.windows;
    }

    public static final class Builder {
        private String createdAt; 
        private String descriptorId; 
        private String descriptorType; 
        private Boolean enabled; 
        private String lastUpdatedAt; 
        private String rateLimitRuleId; 
        private java.util.List<WindowLimit> windows; 

        private Builder() {
        } 

        private Builder(RateLimitRule model) {
            this.createdAt = model.createdAt;
            this.descriptorId = model.descriptorId;
            this.descriptorType = model.descriptorType;
            this.enabled = model.enabled;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.rateLimitRuleId = model.rateLimitRuleId;
            this.windows = model.windows;
        } 

        /**
         * <p>限流规则的创建时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>限流规则的描述符标识，用于关联具体的限流对象</p>
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
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        public Builder descriptorType(String descriptorType) {
            this.descriptorType = descriptorType;
            return this;
        }

        /**
         * <p>限流规则是否启用，true表示启用，false表示禁用</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>限流规则最后一次更新的时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T11:45:00Z</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>限流规则的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder rateLimitRuleId(String rateLimitRuleId) {
            this.rateLimitRuleId = rateLimitRuleId;
            return this;
        }

        /**
         * <p>限流时间窗口配置列表，支持多个窗口叠加限流</p>
         */
        public Builder windows(java.util.List<WindowLimit> windows) {
            this.windows = windows;
            return this;
        }

        public RateLimitRule build() {
            return new RateLimitRule(this);
        } 

    } 

}
