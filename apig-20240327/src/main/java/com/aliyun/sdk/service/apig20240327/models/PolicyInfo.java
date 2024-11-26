// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PolicyInfo} extends {@link TeaModel}
 *
 * <p>PolicyInfo</p>
 */
public class PolicyInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attachments")
    private java.util.List < Attachment > attachments;

    @com.aliyun.core.annotation.NameInMap("classAlias")
    private String classAlias;

    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("executePriority")
    private String executePriority;

    @com.aliyun.core.annotation.NameInMap("executeStage")
    private String executeStage;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("policyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PolicyInfo(Builder builder) {
        this.attachments = builder.attachments;
        this.classAlias = builder.classAlias;
        this.className = builder.className;
        this.config = builder.config;
        this.direction = builder.direction;
        this.executePriority = builder.executePriority;
        this.executeStage = builder.executeStage;
        this.name = builder.name;
        this.policyId = builder.policyId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyInfo create() {
        return builder().build();
    }

    /**
     * @return attachments
     */
    public java.util.List < Attachment > getAttachments() {
        return this.attachments;
    }

    /**
     * @return classAlias
     */
    public String getClassAlias() {
        return this.classAlias;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < Attachment > attachments; 
        private String classAlias; 
        private String className; 
        private String config; 
        private String direction; 
        private String executePriority; 
        private String executeStage; 
        private String name; 
        private String policyId; 
        private String type; 

        /**
         * attachments.
         */
        public Builder attachments(java.util.List < Attachment > attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * classAlias.
         */
        public Builder classAlias(String classAlias) {
            this.classAlias = classAlias;
            return this;
        }

        /**
         * className.
         */
        public Builder className(String className) {
            this.className = className;
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
         * direction.
         */
        public Builder direction(String direction) {
            this.direction = direction;
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
         * policyId.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PolicyInfo build() {
            return new PolicyInfo(this);
        } 

    } 

}
