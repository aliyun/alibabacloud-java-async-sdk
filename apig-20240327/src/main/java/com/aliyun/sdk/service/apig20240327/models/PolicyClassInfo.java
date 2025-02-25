// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link PolicyClassInfo} extends {@link TeaModel}
 *
 * <p>PolicyClassInfo</p>
 */
public class PolicyClassInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("attachableResourceTypes")
    private java.util.List<String> attachableResourceTypes;

    @com.aliyun.core.annotation.NameInMap("classId")
    private String classId;

    @com.aliyun.core.annotation.NameInMap("configExample")
    private String configExample;

    @com.aliyun.core.annotation.NameInMap("deprecated")
    private Boolean deprecated;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("enableLog")
    private Boolean enableLog;

    @com.aliyun.core.annotation.NameInMap("executePriority")
    private String executePriority;

    @com.aliyun.core.annotation.NameInMap("executeStage")
    private String executeStage;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private PolicyClassInfo(Builder builder) {
        this.alias = builder.alias;
        this.attachableResourceTypes = builder.attachableResourceTypes;
        this.classId = builder.classId;
        this.configExample = builder.configExample;
        this.deprecated = builder.deprecated;
        this.description = builder.description;
        this.direction = builder.direction;
        this.enableLog = builder.enableLog;
        this.executePriority = builder.executePriority;
        this.executeStage = builder.executeStage;
        this.name = builder.name;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyClassInfo create() {
        return builder().build();
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return attachableResourceTypes
     */
    public java.util.List<String> getAttachableResourceTypes() {
        return this.attachableResourceTypes;
    }

    /**
     * @return classId
     */
    public String getClassId() {
        return this.classId;
    }

    /**
     * @return configExample
     */
    public String getConfigExample() {
        return this.configExample;
    }

    /**
     * @return deprecated
     */
    public Boolean getDeprecated() {
        return this.deprecated;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return enableLog
     */
    public Boolean getEnableLog() {
        return this.enableLog;
    }

    /**
     * @return executePriority
     */
    public String getExecutePriority() {
        return this.executePriority;
    }

    /**
     * @return executeStage
     */
    public String getExecuteStage() {
        return this.executeStage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String alias; 
        private java.util.List<String> attachableResourceTypes; 
        private String classId; 
        private String configExample; 
        private Boolean deprecated; 
        private String description; 
        private String direction; 
        private Boolean enableLog; 
        private String executePriority; 
        private String executeStage; 
        private String name; 
        private String type; 
        private String version; 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * attachableResourceTypes.
         */
        public Builder attachableResourceTypes(java.util.List<String> attachableResourceTypes) {
            this.attachableResourceTypes = attachableResourceTypes;
            return this;
        }

        /**
         * classId.
         */
        public Builder classId(String classId) {
            this.classId = classId;
            return this;
        }

        /**
         * configExample.
         */
        public Builder configExample(String configExample) {
            this.configExample = configExample;
            return this;
        }

        /**
         * deprecated.
         */
        public Builder deprecated(Boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * enableLog.
         */
        public Builder enableLog(Boolean enableLog) {
            this.enableLog = enableLog;
            return this;
        }

        /**
         * executePriority.
         */
        public Builder executePriority(String executePriority) {
            this.executePriority = executePriority;
            return this;
        }

        /**
         * executeStage.
         */
        public Builder executeStage(String executeStage) {
            this.executeStage = executeStage;
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
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public PolicyClassInfo build() {
            return new PolicyClassInfo(this);
        } 

    } 

}
