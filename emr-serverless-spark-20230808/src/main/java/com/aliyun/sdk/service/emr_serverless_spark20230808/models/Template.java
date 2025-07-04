// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link Template} extends {@link TeaModel}
 *
 * <p>Template</p>
 */
public class Template extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("creator")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long creator;

    @com.aliyun.core.annotation.NameInMap("displaySparkVersion")
    private String displaySparkVersion;

    @com.aliyun.core.annotation.NameInMap("fusion")
    private Boolean fusion;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("isDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("modifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modifier;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("sparkConf")
    private java.util.List<SparkConf> sparkConf;

    @com.aliyun.core.annotation.NameInMap("sparkDriverCores")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sparkDriverCores;

    @com.aliyun.core.annotation.NameInMap("sparkDriverMemory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sparkDriverMemory;

    @com.aliyun.core.annotation.NameInMap("sparkExecutorCores")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sparkExecutorCores;

    @com.aliyun.core.annotation.NameInMap("sparkExecutorMemory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sparkExecutorMemory;

    @com.aliyun.core.annotation.NameInMap("sparkLogLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkLogLevel;

    @com.aliyun.core.annotation.NameInMap("sparkLogPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkLogPath;

    @com.aliyun.core.annotation.NameInMap("sparkVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkVersion;

    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private Template(Builder builder) {
        this.bizId = builder.bizId;
        this.creator = builder.creator;
        this.displaySparkVersion = builder.displaySparkVersion;
        this.fusion = builder.fusion;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.isDefault = builder.isDefault;
        this.modifier = builder.modifier;
        this.name = builder.name;
        this.sparkConf = builder.sparkConf;
        this.sparkDriverCores = builder.sparkDriverCores;
        this.sparkDriverMemory = builder.sparkDriverMemory;
        this.sparkExecutorCores = builder.sparkExecutorCores;
        this.sparkExecutorMemory = builder.sparkExecutorMemory;
        this.sparkLogLevel = builder.sparkLogLevel;
        this.sparkLogPath = builder.sparkLogPath;
        this.sparkVersion = builder.sparkVersion;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Template create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * @return displaySparkVersion
     */
    public String getDisplaySparkVersion() {
        return this.displaySparkVersion;
    }

    /**
     * @return fusion
     */
    public Boolean getFusion() {
        return this.fusion;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return modifier
     */
    public Long getModifier() {
        return this.modifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sparkConf
     */
    public java.util.List<SparkConf> getSparkConf() {
        return this.sparkConf;
    }

    /**
     * @return sparkDriverCores
     */
    public Integer getSparkDriverCores() {
        return this.sparkDriverCores;
    }

    /**
     * @return sparkDriverMemory
     */
    public Long getSparkDriverMemory() {
        return this.sparkDriverMemory;
    }

    /**
     * @return sparkExecutorCores
     */
    public Integer getSparkExecutorCores() {
        return this.sparkExecutorCores;
    }

    /**
     * @return sparkExecutorMemory
     */
    public Long getSparkExecutorMemory() {
        return this.sparkExecutorMemory;
    }

    /**
     * @return sparkLogLevel
     */
    public String getSparkLogLevel() {
        return this.sparkLogLevel;
    }

    /**
     * @return sparkLogPath
     */
    public String getSparkLogPath() {
        return this.sparkLogPath;
    }

    /**
     * @return sparkVersion
     */
    public String getSparkVersion() {
        return this.sparkVersion;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private String bizId; 
        private Long creator; 
        private String displaySparkVersion; 
        private Boolean fusion; 
        private String gmtCreated; 
        private String gmtModified; 
        private Boolean isDefault; 
        private Long modifier; 
        private String name; 
        private java.util.List<SparkConf> sparkConf; 
        private Integer sparkDriverCores; 
        private Long sparkDriverMemory; 
        private Integer sparkExecutorCores; 
        private Long sparkExecutorMemory; 
        private String sparkLogLevel; 
        private String sparkLogPath; 
        private String sparkVersion; 
        private String templateType; 

        private Builder() {
        } 

        private Builder(Template model) {
            this.bizId = model.bizId;
            this.creator = model.creator;
            this.displaySparkVersion = model.displaySparkVersion;
            this.fusion = model.fusion;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.isDefault = model.isDefault;
            this.modifier = model.modifier;
            this.name = model.name;
            this.sparkConf = model.sparkConf;
            this.sparkDriverCores = model.sparkDriverCores;
            this.sparkDriverMemory = model.sparkDriverMemory;
            this.sparkExecutorCores = model.sparkExecutorCores;
            this.sparkExecutorMemory = model.sparkExecutorMemory;
            this.sparkLogLevel = model.sparkLogLevel;
            this.sparkLogPath = model.sparkLogPath;
            this.sparkVersion = model.sparkVersion;
            this.templateType = model.templateType;
        } 

        /**
         * bizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder creator(Long creator) {
            this.creator = creator;
            return this;
        }

        /**
         * displaySparkVersion.
         */
        public Builder displaySparkVersion(String displaySparkVersion) {
            this.displaySparkVersion = displaySparkVersion;
            return this;
        }

        /**
         * fusion.
         */
        public Builder fusion(Boolean fusion) {
            this.fusion = fusion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * isDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modifier(Long modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * sparkConf.
         */
        public Builder sparkConf(java.util.List<SparkConf> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkDriverCores(Integer sparkDriverCores) {
            this.sparkDriverCores = sparkDriverCores;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkDriverMemory(Long sparkDriverMemory) {
            this.sparkDriverMemory = sparkDriverMemory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkExecutorCores(Integer sparkExecutorCores) {
            this.sparkExecutorCores = sparkExecutorCores;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkExecutorMemory(Long sparkExecutorMemory) {
            this.sparkExecutorMemory = sparkExecutorMemory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkLogLevel(String sparkLogLevel) {
            this.sparkLogLevel = sparkLogLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkLogPath(String sparkLogPath) {
            this.sparkLogPath = sparkLogPath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }

        /**
         * templateType.
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public Template build() {
            return new Template(this);
        } 

    } 

}
