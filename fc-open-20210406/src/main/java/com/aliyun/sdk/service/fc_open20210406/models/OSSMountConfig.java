// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OSSMountConfig} extends {@link TeaModel}
 *
 * <p>OSSMountConfig</p>
 */
public class OSSMountConfig extends TeaModel {
    @NameInMap("mountPoints")
    private java.util.List < MountPoints> mountPoints;

    private OSSMountConfig(Builder builder) {
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSMountConfig create() {
        return builder().build();
    }

    /**
     * @return mountPoints
     */
    public java.util.List < MountPoints> getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private java.util.List < MountPoints> mountPoints; 

        /**
         * OSS挂载点配置
         */
        public Builder mountPoints(java.util.List < MountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public OSSMountConfig build() {
            return new OSSMountConfig(this);
        } 

    } 

    public static class MountPoints extends TeaModel {
        @NameInMap("bucketName")
        private String bucketName;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("mountDir")
        private String mountDir;

        @NameInMap("readOnly")
        private Boolean readOnly;

        private MountPoints(Builder builder) {
            this.bucketName = builder.bucketName;
            this.endpoint = builder.endpoint;
            this.mountDir = builder.mountDir;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountPoints create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
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

        public static final class Builder {
            private String bucketName; 
            private String endpoint; 
            private String mountDir; 
            private Boolean readOnly; 

            /**
             * 挂载的OSS bucket
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * OSS访问地址
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * 挂载目录
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * 是否只读
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public MountPoints build() {
                return new MountPoints(this);
            } 

        } 

    }
}
