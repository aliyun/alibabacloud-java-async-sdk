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
 * {@link PolarFsMountConfig} extends {@link TeaModel}
 *
 * <p>PolarFsMountConfig</p>
 */
public class PolarFsMountConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("extraOptions")
    private String extraOptions;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("mountDir")
    private String mountDir;

    @com.aliyun.core.annotation.NameInMap("readOnly")
    private Boolean readOnly;

    @com.aliyun.core.annotation.NameInMap("remoteDir")
    private String remoteDir;

    private PolarFsMountConfig(Builder builder) {
        this.extraOptions = builder.extraOptions;
        this.instanceId = builder.instanceId;
        this.mountDir = builder.mountDir;
        this.readOnly = builder.readOnly;
        this.remoteDir = builder.remoteDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolarFsMountConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraOptions
     */
    public String getExtraOptions() {
        return this.extraOptions;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mountDir
     */
    public String getMountDir() {
        return this.mountDir;
    }

    /**
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * @return remoteDir
     */
    public String getRemoteDir() {
        return this.remoteDir;
    }

    public static final class Builder {
        private String extraOptions; 
        private String instanceId; 
        private String mountDir; 
        private Boolean readOnly; 
        private String remoteDir; 

        private Builder() {
        } 

        private Builder(PolarFsMountConfig model) {
            this.extraOptions = model.extraOptions;
            this.instanceId = model.instanceId;
            this.mountDir = model.mountDir;
            this.readOnly = model.readOnly;
            this.remoteDir = model.remoteDir;
        } 

        /**
         * extraOptions.
         */
        public Builder extraOptions(String extraOptions) {
            this.extraOptions = extraOptions;
            return this;
        }

        /**
         * <p>The ID of the PolarFS file system instance to mount.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The local mount directory in the function\&quot;s runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/polarfs</p>
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * <p>Specifies whether the file system is mounted as read-only. If <code>true</code>, write operations are prohibited.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * <p>The directory within the PolarFS file system to mount.</p>
         * 
         * <strong>example:</strong>
         * <p>/share</p>
         */
        public Builder remoteDir(String remoteDir) {
            this.remoteDir = remoteDir;
            return this;
        }

        public PolarFsMountConfig build() {
            return new PolarFsMountConfig(this);
        } 

    } 

}
