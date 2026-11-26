// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLJobSettings} extends {@link TeaModel}
 *
 * <p>RLJobSettings</p>
 */
public class RLJobSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdvancedSettings")
    private java.util.Map<String, ?> advancedSettings;

    @com.aliyun.core.annotation.NameInMap("BusinessUserId")
    private String businessUserId;

    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.NameInMap("EnableRDMA")
    private Boolean enableRDMA;

    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, String> tags;

    private RLJobSettings(Builder builder) {
        this.advancedSettings = builder.advancedSettings;
        this.businessUserId = builder.businessUserId;
        this.caller = builder.caller;
        this.enableRDMA = builder.enableRDMA;
        this.pipelineId = builder.pipelineId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobSettings create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedSettings
     */
    public java.util.Map<String, ?> getAdvancedSettings() {
        return this.advancedSettings;
    }

    /**
     * @return businessUserId
     */
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return enableRDMA
     */
    public Boolean getEnableRDMA() {
        return this.enableRDMA;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.Map<String, ?> advancedSettings; 
        private String businessUserId; 
        private String caller; 
        private Boolean enableRDMA; 
        private String pipelineId; 
        private java.util.Map<String, String> tags; 

        private Builder() {
        } 

        private Builder(RLJobSettings model) {
            this.advancedSettings = model.advancedSettings;
            this.businessUserId = model.businessUserId;
            this.caller = model.caller;
            this.enableRDMA = model.enableRDMA;
            this.pipelineId = model.pipelineId;
            this.tags = model.tags;
        } 

        /**
         * <p>沿用 DLC 的高级设置键值约定；运行时值须为字符串且键不能为空，具体选项是否生效取决于运行环境支持。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EnableDinD&quot;:&quot;true&quot;}</p>
         */
        public Builder advancedSettings(java.util.Map<String, ?> advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * <p>作业关联用户 ID，沿用 DLC 的受信调用方规则。</p>
         * 
         * <strong>example:</strong>
         * <p>166924</p>
         */
        public Builder businessUserId(String businessUserId) {
            this.businessUserId = businessUserId;
            return this;
        }

        /**
         * <p>调用方标识，与 DLC Settings.Caller 一致。</p>
         * 
         * <strong>example:</strong>
         * <p>pai-cli</p>
         */
        public Builder caller(String caller) {
            this.caller = caller;
            return this;
        }

        /**
         * <p>沿用 DLC 的 RDMA 配置，是否生效取决于配额和运行环境。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRDMA(Boolean enableRDMA) {
            this.enableRDMA = enableRDMA;
            return this;
        }

        /**
         * <p>工作流 ID，与 DLC Settings.PipelineId 一致。</p>
         * 
         * <strong>example:</strong>
         * <p>pid-123456</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>DLC 作业标签，场景使用 rls.scene。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rls.scene&quot;:&quot;code-rl&quot;}</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        public RLJobSettings build() {
            return new RLJobSettings(this);
        } 

    } 

}
