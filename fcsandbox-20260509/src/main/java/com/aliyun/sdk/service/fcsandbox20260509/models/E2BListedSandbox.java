// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BListedSandbox} extends {@link TeaModel}
 *
 * <p>E2BListedSandbox</p>
 */
public class E2BListedSandbox extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("clientID")
    private String clientID;

    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("diskSizeMB")
    private Integer diskSizeMB;

    @com.aliyun.core.annotation.NameInMap("endAt")
    private String endAt;

    @com.aliyun.core.annotation.NameInMap("envdVersion")
    private String envdVersion;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, String> metadata;

    @com.aliyun.core.annotation.NameInMap("sandboxID")
    private String sandboxID;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("volumeMounts")
    private java.util.List<E2BVolumeMount> volumeMounts;

    private E2BListedSandbox(Builder builder) {
        this.alias = builder.alias;
        this.clientID = builder.clientID;
        this.cpuCount = builder.cpuCount;
        this.diskSizeMB = builder.diskSizeMB;
        this.endAt = builder.endAt;
        this.envdVersion = builder.envdVersion;
        this.memoryMB = builder.memoryMB;
        this.metadata = builder.metadata;
        this.sandboxID = builder.sandboxID;
        this.startedAt = builder.startedAt;
        this.state = builder.state;
        this.templateID = builder.templateID;
        this.templateName = builder.templateName;
        this.volumeMounts = builder.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BListedSandbox create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return clientID
     */
    public String getClientID() {
        return this.clientID;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return diskSizeMB
     */
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    /**
     * @return endAt
     */
    public String getEndAt() {
        return this.endAt;
    }

    /**
     * @return envdVersion
     */
    public String getEnvdVersion() {
        return this.envdVersion;
    }

    /**
     * @return memoryMB
     */
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * @return sandboxID
     */
    public String getSandboxID() {
        return this.sandboxID;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return volumeMounts
     */
    public java.util.List<E2BVolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public static final class Builder {
        private String alias; 
        private String clientID; 
        private Integer cpuCount; 
        private Integer diskSizeMB; 
        private String endAt; 
        private String envdVersion; 
        private Integer memoryMB; 
        private java.util.Map<String, String> metadata; 
        private String sandboxID; 
        private String startedAt; 
        private String state; 
        private String templateID; 
        private String templateName; 
        private java.util.List<E2BVolumeMount> volumeMounts; 

        private Builder() {
        } 

        private Builder(E2BListedSandbox model) {
            this.alias = model.alias;
            this.clientID = model.clientID;
            this.cpuCount = model.cpuCount;
            this.diskSizeMB = model.diskSizeMB;
            this.endAt = model.endAt;
            this.envdVersion = model.envdVersion;
            this.memoryMB = model.memoryMB;
            this.metadata = model.metadata;
            this.sandboxID = model.sandboxID;
            this.startedAt = model.startedAt;
            this.state = model.state;
            this.templateID = model.templateID;
            this.templateName = model.templateName;
            this.volumeMounts = model.volumeMounts;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * clientID.
         */
        public Builder clientID(String clientID) {
            this.clientID = clientID;
            return this;
        }

        /**
         * cpuCount.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * diskSizeMB.
         */
        public Builder diskSizeMB(Integer diskSizeMB) {
            this.diskSizeMB = diskSizeMB;
            return this;
        }

        /**
         * endAt.
         */
        public Builder endAt(String endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * envdVersion.
         */
        public Builder envdVersion(String envdVersion) {
            this.envdVersion = envdVersion;
            return this;
        }

        /**
         * memoryMB.
         */
        public Builder memoryMB(Integer memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * sandboxID.
         */
        public Builder sandboxID(String sandboxID) {
            this.sandboxID = sandboxID;
            return this;
        }

        /**
         * startedAt.
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * templateID.
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * volumeMounts.
         */
        public Builder volumeMounts(java.util.List<E2BVolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public E2BListedSandbox build() {
            return new E2BListedSandbox(this);
        } 

    } 

}
