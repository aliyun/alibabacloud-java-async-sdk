// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link BizTraceConfig} extends {@link TeaModel}
 *
 * <p>BizTraceConfig</p>
 */
public class BizTraceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("advancedConfig")
    private String advancedConfig;

    @com.aliyun.core.annotation.NameInMap("bizTraceCode")
    private String bizTraceCode;

    @com.aliyun.core.annotation.NameInMap("bizTraceId")
    private String bizTraceId;

    @com.aliyun.core.annotation.NameInMap("bizTraceName")
    private String bizTraceName;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ruleConfig")
    private String ruleConfig;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private BizTraceConfig(Builder builder) {
        this.advancedConfig = builder.advancedConfig;
        this.bizTraceCode = builder.bizTraceCode;
        this.bizTraceId = builder.bizTraceId;
        this.bizTraceName = builder.bizTraceName;
        this.createTime = builder.createTime;
        this.regionId = builder.regionId;
        this.ruleConfig = builder.ruleConfig;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BizTraceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedConfig
     */
    public String getAdvancedConfig() {
        return this.advancedConfig;
    }

    /**
     * @return bizTraceCode
     */
    public String getBizTraceCode() {
        return this.bizTraceCode;
    }

    /**
     * @return bizTraceId
     */
    public String getBizTraceId() {
        return this.bizTraceId;
    }

    /**
     * @return bizTraceName
     */
    public String getBizTraceName() {
        return this.bizTraceName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String advancedConfig; 
        private String bizTraceCode; 
        private String bizTraceId; 
        private String bizTraceName; 
        private String createTime; 
        private String regionId; 
        private String ruleConfig; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(BizTraceConfig model) {
            this.advancedConfig = model.advancedConfig;
            this.bizTraceCode = model.bizTraceCode;
            this.bizTraceId = model.bizTraceId;
            this.bizTraceName = model.bizTraceName;
            this.createTime = model.createTime;
            this.regionId = model.regionId;
            this.ruleConfig = model.ruleConfig;
            this.workspace = model.workspace;
        } 

        /**
         * advancedConfig.
         */
        public Builder advancedConfig(String advancedConfig) {
            this.advancedConfig = advancedConfig;
            return this;
        }

        /**
         * bizTraceCode.
         */
        public Builder bizTraceCode(String bizTraceCode) {
            this.bizTraceCode = bizTraceCode;
            return this;
        }

        /**
         * bizTraceId.
         */
        public Builder bizTraceId(String bizTraceId) {
            this.bizTraceId = bizTraceId;
            return this;
        }

        /**
         * bizTraceName.
         */
        public Builder bizTraceName(String bizTraceName) {
            this.bizTraceName = bizTraceName;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * ruleConfig.
         */
        public Builder ruleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public BizTraceConfig build() {
            return new BizTraceConfig(this);
        } 

    } 

}
