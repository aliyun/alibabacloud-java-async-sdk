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
 * {@link E2BSandbox} extends {@link TeaModel}
 *
 * <p>E2BSandbox</p>
 */
public class E2BSandbox extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("allowInternetAccess")
    private Boolean allowInternetAccess;

    @com.aliyun.core.annotation.NameInMap("clientID")
    private String clientID;

    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("diskSizeMB")
    private Integer diskSizeMB;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("endAt")
    private String endAt;

    @com.aliyun.core.annotation.NameInMap("envdAccessToken")
    private String envdAccessToken;

    @com.aliyun.core.annotation.NameInMap("envdVersion")
    private String envdVersion;

    @com.aliyun.core.annotation.NameInMap("fcFunctionName")
    private String fcFunctionName;

    @com.aliyun.core.annotation.NameInMap("fcInstanceID")
    private String fcInstanceID;

    @com.aliyun.core.annotation.NameInMap("fcSessionID")
    private String fcSessionID;

    @com.aliyun.core.annotation.NameInMap("lifecycle")
    private E2BLifecycle lifecycle;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, String> metadata;

    @com.aliyun.core.annotation.NameInMap("network")
    private E2BNetwork network;

    @com.aliyun.core.annotation.NameInMap("sandboxID")
    private String sandboxID;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("volumeMounts")
    private java.util.List<E2BVolumeMount> volumeMounts;

    private E2BSandbox(Builder builder) {
        this.alias = builder.alias;
        this.allowInternetAccess = builder.allowInternetAccess;
        this.clientID = builder.clientID;
        this.cpuCount = builder.cpuCount;
        this.diskSizeMB = builder.diskSizeMB;
        this.domain = builder.domain;
        this.endAt = builder.endAt;
        this.envdAccessToken = builder.envdAccessToken;
        this.envdVersion = builder.envdVersion;
        this.fcFunctionName = builder.fcFunctionName;
        this.fcInstanceID = builder.fcInstanceID;
        this.fcSessionID = builder.fcSessionID;
        this.lifecycle = builder.lifecycle;
        this.memoryMB = builder.memoryMB;
        this.metadata = builder.metadata;
        this.network = builder.network;
        this.sandboxID = builder.sandboxID;
        this.startedAt = builder.startedAt;
        this.state = builder.state;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.volumeMounts = builder.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BSandbox create() {
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
     * @return allowInternetAccess
     */
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endAt
     */
    public String getEndAt() {
        return this.endAt;
    }

    /**
     * @return envdAccessToken
     */
    public String getEnvdAccessToken() {
        return this.envdAccessToken;
    }

    /**
     * @return envdVersion
     */
    public String getEnvdVersion() {
        return this.envdVersion;
    }

    /**
     * @return fcFunctionName
     */
    public String getFcFunctionName() {
        return this.fcFunctionName;
    }

    /**
     * @return fcInstanceID
     */
    public String getFcInstanceID() {
        return this.fcInstanceID;
    }

    /**
     * @return fcSessionID
     */
    public String getFcSessionID() {
        return this.fcSessionID;
    }

    /**
     * @return lifecycle
     */
    public E2BLifecycle getLifecycle() {
        return this.lifecycle;
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
     * @return network
     */
    public E2BNetwork getNetwork() {
        return this.network;
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
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
        private Boolean allowInternetAccess; 
        private String clientID; 
        private Integer cpuCount; 
        private Integer diskSizeMB; 
        private String domain; 
        private String endAt; 
        private String envdAccessToken; 
        private String envdVersion; 
        private String fcFunctionName; 
        private String fcInstanceID; 
        private String fcSessionID; 
        private E2BLifecycle lifecycle; 
        private Integer memoryMB; 
        private java.util.Map<String, String> metadata; 
        private E2BNetwork network; 
        private String sandboxID; 
        private String startedAt; 
        private String state; 
        private String templateId; 
        private String templateName; 
        private java.util.List<E2BVolumeMount> volumeMounts; 

        private Builder() {
        } 

        private Builder(E2BSandbox model) {
            this.alias = model.alias;
            this.allowInternetAccess = model.allowInternetAccess;
            this.clientID = model.clientID;
            this.cpuCount = model.cpuCount;
            this.diskSizeMB = model.diskSizeMB;
            this.domain = model.domain;
            this.endAt = model.endAt;
            this.envdAccessToken = model.envdAccessToken;
            this.envdVersion = model.envdVersion;
            this.fcFunctionName = model.fcFunctionName;
            this.fcInstanceID = model.fcInstanceID;
            this.fcSessionID = model.fcSessionID;
            this.lifecycle = model.lifecycle;
            this.memoryMB = model.memoryMB;
            this.metadata = model.metadata;
            this.network = model.network;
            this.sandboxID = model.sandboxID;
            this.startedAt = model.startedAt;
            this.state = model.state;
            this.templateId = model.templateId;
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
         * allowInternetAccess.
         */
        public Builder allowInternetAccess(Boolean allowInternetAccess) {
            this.allowInternetAccess = allowInternetAccess;
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
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
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
         * envdAccessToken.
         */
        public Builder envdAccessToken(String envdAccessToken) {
            this.envdAccessToken = envdAccessToken;
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
         * fcFunctionName.
         */
        public Builder fcFunctionName(String fcFunctionName) {
            this.fcFunctionName = fcFunctionName;
            return this;
        }

        /**
         * fcInstanceID.
         */
        public Builder fcInstanceID(String fcInstanceID) {
            this.fcInstanceID = fcInstanceID;
            return this;
        }

        /**
         * fcSessionID.
         */
        public Builder fcSessionID(String fcSessionID) {
            this.fcSessionID = fcSessionID;
            return this;
        }

        /**
         * lifecycle.
         */
        public Builder lifecycle(E2BLifecycle lifecycle) {
            this.lifecycle = lifecycle;
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
         * network.
         */
        public Builder network(E2BNetwork network) {
            this.network = network;
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
         * templateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
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

        public E2BSandbox build() {
            return new E2BSandbox(this);
        } 

    } 

}
