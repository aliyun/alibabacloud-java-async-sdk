// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ContainerdConfig} extends {@link TeaModel}
 *
 * <p>ContainerdConfig</p>
 */
public class ContainerdConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ignoreImageDefinedVolume")
    private Boolean ignoreImageDefinedVolume;

    @com.aliyun.core.annotation.NameInMap("insecureRegistries")
    private java.util.List<String> insecureRegistries;

    @com.aliyun.core.annotation.NameInMap("limitCore")
    private Long limitCore;

    @com.aliyun.core.annotation.NameInMap("limitMemLock")
    private Long limitMemLock;

    @com.aliyun.core.annotation.NameInMap("limitNoFile")
    private Long limitNoFile;

    @com.aliyun.core.annotation.NameInMap("maxConcurrentDownloads")
    private Long maxConcurrentDownloads;

    @com.aliyun.core.annotation.NameInMap("registryMirrors")
    private java.util.List<String> registryMirrors;

    private ContainerdConfig(Builder builder) {
        this.ignoreImageDefinedVolume = builder.ignoreImageDefinedVolume;
        this.insecureRegistries = builder.insecureRegistries;
        this.limitCore = builder.limitCore;
        this.limitMemLock = builder.limitMemLock;
        this.limitNoFile = builder.limitNoFile;
        this.maxConcurrentDownloads = builder.maxConcurrentDownloads;
        this.registryMirrors = builder.registryMirrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerdConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ignoreImageDefinedVolume
     */
    public Boolean getIgnoreImageDefinedVolume() {
        return this.ignoreImageDefinedVolume;
    }

    /**
     * @return insecureRegistries
     */
    public java.util.List<String> getInsecureRegistries() {
        return this.insecureRegistries;
    }

    /**
     * @return limitCore
     */
    public Long getLimitCore() {
        return this.limitCore;
    }

    /**
     * @return limitMemLock
     */
    public Long getLimitMemLock() {
        return this.limitMemLock;
    }

    /**
     * @return limitNoFile
     */
    public Long getLimitNoFile() {
        return this.limitNoFile;
    }

    /**
     * @return maxConcurrentDownloads
     */
    public Long getMaxConcurrentDownloads() {
        return this.maxConcurrentDownloads;
    }

    /**
     * @return registryMirrors
     */
    public java.util.List<String> getRegistryMirrors() {
        return this.registryMirrors;
    }

    public static final class Builder {
        private Boolean ignoreImageDefinedVolume; 
        private java.util.List<String> insecureRegistries; 
        private Long limitCore; 
        private Long limitMemLock; 
        private Long limitNoFile; 
        private Long maxConcurrentDownloads; 
        private java.util.List<String> registryMirrors; 

        private Builder() {
        } 

        private Builder(ContainerdConfig model) {
            this.ignoreImageDefinedVolume = model.ignoreImageDefinedVolume;
            this.insecureRegistries = model.insecureRegistries;
            this.limitCore = model.limitCore;
            this.limitMemLock = model.limitMemLock;
            this.limitNoFile = model.limitNoFile;
            this.maxConcurrentDownloads = model.maxConcurrentDownloads;
            this.registryMirrors = model.registryMirrors;
        } 

        /**
         * ignoreImageDefinedVolume.
         */
        public Builder ignoreImageDefinedVolume(Boolean ignoreImageDefinedVolume) {
            this.ignoreImageDefinedVolume = ignoreImageDefinedVolume;
            return this;
        }

        /**
         * insecureRegistries.
         */
        public Builder insecureRegistries(java.util.List<String> insecureRegistries) {
            this.insecureRegistries = insecureRegistries;
            return this;
        }

        /**
         * limitCore.
         */
        public Builder limitCore(Long limitCore) {
            this.limitCore = limitCore;
            return this;
        }

        /**
         * limitMemLock.
         */
        public Builder limitMemLock(Long limitMemLock) {
            this.limitMemLock = limitMemLock;
            return this;
        }

        /**
         * limitNoFile.
         */
        public Builder limitNoFile(Long limitNoFile) {
            this.limitNoFile = limitNoFile;
            return this;
        }

        /**
         * maxConcurrentDownloads.
         */
        public Builder maxConcurrentDownloads(Long maxConcurrentDownloads) {
            this.maxConcurrentDownloads = maxConcurrentDownloads;
            return this;
        }

        /**
         * registryMirrors.
         */
        public Builder registryMirrors(java.util.List<String> registryMirrors) {
            this.registryMirrors = registryMirrors;
            return this;
        }

        public ContainerdConfig build() {
            return new ContainerdConfig(this);
        } 

    } 

}
