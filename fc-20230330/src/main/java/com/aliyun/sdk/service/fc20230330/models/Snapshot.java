// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Snapshot} extends {@link TeaModel}
 *
 * <p>Snapshot</p>
 */
public class Snapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactDiskTotalSizeInB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long artifactDiskTotalSizeInB;

    @com.aliyun.core.annotation.NameInMap("artifactDiskUsedSizeInB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long artifactDiskUsedSizeInB;

    @com.aliyun.core.annotation.NameInMap("artifactMemCacheSizeInB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long artifactMemCacheSizeInB;

    @com.aliyun.core.annotation.NameInMap("artifactMemTotalSizeInB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long artifactMemTotalSizeInB;

    @com.aliyun.core.annotation.NameInMap("artifactMemUsedSizeInB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long artifactMemUsedSizeInB;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cpu;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.NameInMap("diskSizeMB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long diskSizeMB;

    @com.aliyun.core.annotation.NameInMap("envs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, String> envs;

    @com.aliyun.core.annotation.NameInMap("expiredTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("imageDigest")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageDigest;

    @com.aliyun.core.annotation.NameInMap("imageRepository")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageRepository;

    @com.aliyun.core.annotation.NameInMap("memoryMB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long memoryMB;

    @com.aliyun.core.annotation.NameInMap("osType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String osType;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("readyCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private String readyCommand;

    @com.aliyun.core.annotation.NameInMap("resolvedVersion")
    private String resolvedVersion;

    @com.aliyun.core.annotation.NameInMap("snapshotId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 36, minLength = 36)
    private String snapshotId;

    @com.aliyun.core.annotation.NameInMap("sourceSessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceSessionId;

    @com.aliyun.core.annotation.NameInMap("startCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startCommand;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private Snapshot(Builder builder) {
        this.artifactDiskTotalSizeInB = builder.artifactDiskTotalSizeInB;
        this.artifactDiskUsedSizeInB = builder.artifactDiskUsedSizeInB;
        this.artifactMemCacheSizeInB = builder.artifactMemCacheSizeInB;
        this.artifactMemTotalSizeInB = builder.artifactMemTotalSizeInB;
        this.artifactMemUsedSizeInB = builder.artifactMemUsedSizeInB;
        this.cpu = builder.cpu;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.diskSizeMB = builder.diskSizeMB;
        this.envs = builder.envs;
        this.expiredTime = builder.expiredTime;
        this.functionName = builder.functionName;
        this.imageDigest = builder.imageDigest;
        this.imageRepository = builder.imageRepository;
        this.memoryMB = builder.memoryMB;
        this.osType = builder.osType;
        this.qualifier = builder.qualifier;
        this.readyCommand = builder.readyCommand;
        this.resolvedVersion = builder.resolvedVersion;
        this.snapshotId = builder.snapshotId;
        this.sourceSessionId = builder.sourceSessionId;
        this.startCommand = builder.startCommand;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Snapshot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactDiskTotalSizeInB
     */
    public Long getArtifactDiskTotalSizeInB() {
        return this.artifactDiskTotalSizeInB;
    }

    /**
     * @return artifactDiskUsedSizeInB
     */
    public Long getArtifactDiskUsedSizeInB() {
        return this.artifactDiskUsedSizeInB;
    }

    /**
     * @return artifactMemCacheSizeInB
     */
    public Long getArtifactMemCacheSizeInB() {
        return this.artifactMemCacheSizeInB;
    }

    /**
     * @return artifactMemTotalSizeInB
     */
    public Long getArtifactMemTotalSizeInB() {
        return this.artifactMemTotalSizeInB;
    }

    /**
     * @return artifactMemUsedSizeInB
     */
    public Long getArtifactMemUsedSizeInB() {
        return this.artifactMemUsedSizeInB;
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskSizeMB
     */
    public Long getDiskSizeMB() {
        return this.diskSizeMB;
    }

    /**
     * @return envs
     */
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return imageDigest
     */
    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * @return imageRepository
     */
    public String getImageRepository() {
        return this.imageRepository;
    }

    /**
     * @return memoryMB
     */
    public Long getMemoryMB() {
        return this.memoryMB;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return readyCommand
     */
    public String getReadyCommand() {
        return this.readyCommand;
    }

    /**
     * @return resolvedVersion
     */
    public String getResolvedVersion() {
        return this.resolvedVersion;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return sourceSessionId
     */
    public String getSourceSessionId() {
        return this.sourceSessionId;
    }

    /**
     * @return startCommand
     */
    public String getStartCommand() {
        return this.startCommand;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long artifactDiskTotalSizeInB; 
        private Long artifactDiskUsedSizeInB; 
        private Long artifactMemCacheSizeInB; 
        private Long artifactMemTotalSizeInB; 
        private Long artifactMemUsedSizeInB; 
        private Long cpu; 
        private String createdTime; 
        private String description; 
        private Long diskSizeMB; 
        private java.util.Map<String, String> envs; 
        private String expiredTime; 
        private String functionName; 
        private String imageDigest; 
        private String imageRepository; 
        private Long memoryMB; 
        private String osType; 
        private String qualifier; 
        private String readyCommand; 
        private String resolvedVersion; 
        private String snapshotId; 
        private String sourceSessionId; 
        private String startCommand; 
        private String status; 

        private Builder() {
        } 

        private Builder(Snapshot model) {
            this.artifactDiskTotalSizeInB = model.artifactDiskTotalSizeInB;
            this.artifactDiskUsedSizeInB = model.artifactDiskUsedSizeInB;
            this.artifactMemCacheSizeInB = model.artifactMemCacheSizeInB;
            this.artifactMemTotalSizeInB = model.artifactMemTotalSizeInB;
            this.artifactMemUsedSizeInB = model.artifactMemUsedSizeInB;
            this.cpu = model.cpu;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.diskSizeMB = model.diskSizeMB;
            this.envs = model.envs;
            this.expiredTime = model.expiredTime;
            this.functionName = model.functionName;
            this.imageDigest = model.imageDigest;
            this.imageRepository = model.imageRepository;
            this.memoryMB = model.memoryMB;
            this.osType = model.osType;
            this.qualifier = model.qualifier;
            this.readyCommand = model.readyCommand;
            this.resolvedVersion = model.resolvedVersion;
            this.snapshotId = model.snapshotId;
            this.sourceSessionId = model.sourceSessionId;
            this.startCommand = model.startCommand;
            this.status = model.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10737418240</p>
         */
        public Builder artifactDiskTotalSizeInB(Long artifactDiskTotalSizeInB) {
            this.artifactDiskTotalSizeInB = artifactDiskTotalSizeInB;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2147483648</p>
         */
        public Builder artifactDiskUsedSizeInB(Long artifactDiskUsedSizeInB) {
            this.artifactDiskUsedSizeInB = artifactDiskUsedSizeInB;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>268435456</p>
         */
        public Builder artifactMemCacheSizeInB(Long artifactMemCacheSizeInB) {
            this.artifactMemCacheSizeInB = artifactMemCacheSizeInB;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3221225472</p>
         */
        public Builder artifactMemTotalSizeInB(Long artifactMemTotalSizeInB) {
            this.artifactMemTotalSizeInB = artifactMemTotalSizeInB;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        public Builder artifactMemUsedSizeInB(Long artifactMemUsedSizeInB) {
            this.artifactMemUsedSizeInB = artifactMemUsedSizeInB;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-30T10:00:00Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Snapshot for production environment</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder diskSizeMB(Long diskSizeMB) {
            this.diskSizeMB = diskSizeMB;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-29T10:00:00Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-function</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:0123456789abcdef</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/example/function</p>
         */
        public Builder imageRepository(String imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3072</p>
         */
        public Builder memoryMB(Long memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder osType(String osType) {
            this.osType = osType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/code/ready.sh</p>
         */
        public Builder readyCommand(String readyCommand) {
            this.readyCommand = readyCommand;
            return this;
        }

        /**
         * resolvedVersion.
         */
        public Builder resolvedVersion(String resolvedVersion) {
            this.resolvedVersion = resolvedVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-test-session-id</p>
         */
        public Builder sourceSessionId(String sourceSessionId) {
            this.sourceSessionId = sourceSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/code/start.sh</p>
         */
        public Builder startCommand(String startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Snapshot build() {
            return new Snapshot(this);
        } 

    } 

}
