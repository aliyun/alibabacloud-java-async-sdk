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
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("configMatcher")
    private String configMatcher;

    @com.aliyun.core.annotation.NameInMap("configName")
    private String configName;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("isGray")
    private Boolean isGray;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Long lastModifyTime;

    private GetAgentInstanceConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.configMatcher = builder.configMatcher;
        this.configName = builder.configName;
        this.createTime = builder.createTime;
        this.isGray = builder.isGray;
        this.lastModifyTime = builder.lastModifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configMatcher
     */
    public String getConfigMatcher() {
        return this.configMatcher;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return isGray
     */
    public Boolean getIsGray() {
        return this.isGray;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public static final class Builder {
        private String config; 
        private String configMatcher; 
        private String configName; 
        private Long createTime; 
        private Boolean isGray; 
        private Long lastModifyTime; 

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * configMatcher.
         */
        public Builder configMatcher(String configMatcher) {
            this.configMatcher = configMatcher;
            return this;
        }

        /**
         * configName.
         */
        public Builder configName(String configName) {
            this.configName = configName;
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
         * isGray.
         */
        public Builder isGray(Boolean isGray) {
            this.isGray = isGray;
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
