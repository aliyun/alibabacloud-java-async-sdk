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
         * mountPoints.
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

        @NameInMap("bucketPath")
        private String bucketPath;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("mountDir")
        private String mountDir;

        @NameInMap("readOnly")
        private Boolean readOnly;

        private MountPoints(Builder builder) {
            this.bucketName = builder.bucketName;
            this.bucketPath = builder.bucketPath;
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
         * @return bucketPath
         */
        public String getBucketPath() {
            return this.bucketPath;
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
            private String bucketPath; 
            private String endpoint; 
            private String mountDir; 
            private Boolean readOnly; 

            /**
             * bucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * bucketPath.
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
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

            public MountPoints build() {
                return new MountPoints(this);
            } 

        } 

    }
}
