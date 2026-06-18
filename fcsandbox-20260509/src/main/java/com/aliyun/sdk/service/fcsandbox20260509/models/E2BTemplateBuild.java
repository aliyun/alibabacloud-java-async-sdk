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
 * {@link E2BTemplateBuild} extends {@link TeaModel}
 *
 * <p>E2BTemplateBuild</p>
 */
public class E2BTemplateBuild extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buildID")
    private String buildID;

    @com.aliyun.core.annotation.NameInMap("cpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("diskSizeMB")
    private Integer diskSizeMB;

    @com.aliyun.core.annotation.NameInMap("envdVersion")
    private String envdVersion;

    @com.aliyun.core.annotation.NameInMap("finishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    private Integer memoryMB;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private E2BTemplateBuild(Builder builder) {
        this.buildID = builder.buildID;
        this.cpuCount = builder.cpuCount;
        this.createdAt = builder.createdAt;
        this.diskSizeMB = builder.diskSizeMB;
        this.envdVersion = builder.envdVersion;
        this.finishedAt = builder.finishedAt;
        this.memoryMB = builder.memoryMB;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BTemplateBuild create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildID
     */
    public String getBuildID() {
        return this.buildID;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return diskSizeMB
     */
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    /**
     * @return envdVersion
     */
    public String getEnvdVersion() {
        return this.envdVersion;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return memoryMB
     */
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String buildID; 
        private Integer cpuCount; 
        private String createdAt; 
        private Integer diskSizeMB; 
        private String envdVersion; 
        private String finishedAt; 
        private Integer memoryMB; 
        private String status; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(E2BTemplateBuild model) {
            this.buildID = model.buildID;
            this.cpuCount = model.cpuCount;
            this.createdAt = model.createdAt;
            this.diskSizeMB = model.diskSizeMB;
            this.envdVersion = model.envdVersion;
            this.finishedAt = model.finishedAt;
            this.memoryMB = model.memoryMB;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * buildID.
         */
        public Builder buildID(String buildID) {
            this.buildID = buildID;
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
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * envdVersion.
         */
        public Builder envdVersion(String envdVersion) {
            this.envdVersion = envdVersion;
            return this;
        }

        /**
         * finishedAt.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
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
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public E2BTemplateBuild build() {
            return new E2BTemplateBuild(this);
        } 

    } 

}
