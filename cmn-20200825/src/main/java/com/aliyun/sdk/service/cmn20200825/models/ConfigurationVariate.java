// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigurationVariate} extends {@link TeaModel}
 *
 * <p>ConfigurationVariate</p>
 */
public class ConfigurationVariate extends TeaModel {
    @NameInMap("Comment")
    private String comment;

    @NameInMap("ConfigurationVariateId")
    private String configurationVariateId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("FormatFunction")
    private String formatFunction;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("VariateName")
    private String variateName;

    private ConfigurationVariate(Builder builder) {
        this.comment = builder.comment;
        this.configurationVariateId = builder.configurationVariateId;
        this.createTime = builder.createTime;
        this.formatFunction = builder.formatFunction;
        this.updateTime = builder.updateTime;
        this.variateName = builder.variateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigurationVariate create() {
        return builder().build();
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return configurationVariateId
     */
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return formatFunction
     */
    public String getFormatFunction() {
        return this.formatFunction;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return variateName
     */
    public String getVariateName() {
        return this.variateName;
    }

    public static final class Builder {
        private String comment; 
        private String configurationVariateId; 
        private String createTime; 
        private String formatFunction; 
        private String updateTime; 
        private String variateName; 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * ConfigurationVariateId.
         */
        public Builder configurationVariateId(String configurationVariateId) {
            this.configurationVariateId = configurationVariateId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * FormatFunction.
         */
        public Builder formatFunction(String formatFunction) {
            this.formatFunction = formatFunction;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * VariateName.
         */
        public Builder variateName(String variateName) {
            this.variateName = variateName;
            return this;
        }

        public ConfigurationVariate build() {
            return new ConfigurationVariate(this);
        } 

    } 

}
