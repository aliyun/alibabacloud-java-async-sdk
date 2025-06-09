// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetAgentInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentInstanceConfigResponseBody</p>
 */
public class GetAgentInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("configType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("grayConfigs")
    private java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Long lastModifyTime;

    private GetAgentInstanceConfigResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.config = builder.config;
        this.configType = builder.configType;
        this.createTime = builder.createTime;
        this.grayConfigs = builder.grayConfigs;
        this.lastModifyTime = builder.lastModifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentInstanceConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return grayConfigs
     */
    public java.util.List<AgentInstanceConfigGrayConfigs> getGrayConfigs() {
        return this.grayConfigs;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public static final class Builder {
        private java.util.Map<String, String> attributes; 
        private String config; 
        private String configType; 
        private Long createTime; 
        private java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs; 
        private Long lastModifyTime; 

        private Builder() {
        } 

        private Builder(GetAgentInstanceConfigResponseBody model) {
            this.attributes = model.attributes;
            this.config = model.config;
            this.configType = model.configType;
            this.createTime = model.createTime;
            this.grayConfigs = model.grayConfigs;
            this.lastModifyTime = model.lastModifyTime;
        } 

        /**
         * attributes.
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * configType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * grayConfigs.
         */
        public Builder grayConfigs(java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs) {
            this.grayConfigs = grayConfigs;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        public GetAgentInstanceConfigResponseBody build() {
            return new GetAgentInstanceConfigResponseBody(this);
        } 

    } 

}
