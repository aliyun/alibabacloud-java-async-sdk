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
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("mountDir")
    private String mountDir;

    @com.aliyun.core.annotation.NameInMap("readOnly")
    private Boolean readOnly;

    @com.aliyun.core.annotation.NameInMap("remoteDir")
    private String remoteDir;

    private PolarFsMountConfig(Builder builder) {
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
        private String instanceId; 
        private String mountDir; 
        private Boolean readOnly; 
        private String remoteDir; 

        private Builder() {
        } 

        private Builder(PolarFsMountConfig model) {
            this.instanceId = model.instanceId;
            this.mountDir = model.mountDir;
            this.readOnly = model.readOnly;
            this.remoteDir = model.remoteDir;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * mountDir.
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * readOnly.
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * remoteDir.
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
