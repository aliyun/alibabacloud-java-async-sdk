// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link InnerCreateSandboxVolumeMounts} extends {@link TeaModel}
 *
 * <p>InnerCreateSandboxVolumeMounts</p>
 */
public class InnerCreateSandboxVolumeMounts extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agenticFs")
    private AgenticFs agenticFs;

    @com.aliyun.core.annotation.NameInMap("named")
    private Named named;

    @com.aliyun.core.annotation.NameInMap("oss")
    private Oss oss;

    private InnerCreateSandboxVolumeMounts(Builder builder) {
        this.agenticFs = builder.agenticFs;
        this.named = builder.named;
        this.oss = builder.oss;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InnerCreateSandboxVolumeMounts create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticFs
     */
    public AgenticFs getAgenticFs() {
        return this.agenticFs;
    }

    /**
     * @return named
     */
    public Named getNamed() {
        return this.named;
    }

    /**
     * @return oss
     */
    public Oss getOss() {
        return this.oss;
    }

    public static final class Builder {
        private AgenticFs agenticFs; 
        private Named named; 
        private Oss oss; 

        private Builder() {
        } 

        private Builder(InnerCreateSandboxVolumeMounts model) {
            this.agenticFs = model.agenticFs;
            this.named = model.named;
            this.oss = model.oss;
        } 

        /**
         * agenticFs.
         */
        public Builder agenticFs(AgenticFs agenticFs) {
            this.agenticFs = agenticFs;
            return this;
        }

        /**
         * named.
         */
        public Builder named(Named named) {
            this.named = named;
            return this;
        }

        /**
         * oss.
         */
        public Builder oss(Oss oss) {
            this.oss = oss;
            return this;
        }

        public InnerCreateSandboxVolumeMounts build() {
            return new InnerCreateSandboxVolumeMounts(this);
        } 

    } 

    /**
     * 
     * {@link InnerCreateSandboxVolumeMounts} extends {@link TeaModel}
     *
     * <p>InnerCreateSandboxVolumeMounts</p>
     */
    public static class MountPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mountDir")
        private String mountDir;

        @com.aliyun.core.annotation.NameInMap("serverAddr")
        private String serverAddr;

        private MountPoints(Builder builder) {
            this.mountDir = builder.mountDir;
            this.serverAddr = builder.serverAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountPoints create() {
            return builder().build();
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return serverAddr
         */
        public String getServerAddr() {
            return this.serverAddr;
        }

        public static final class Builder {
            private String mountDir; 
            private String serverAddr; 

            private Builder() {
            } 

            private Builder(MountPoints model) {
                this.mountDir = model.mountDir;
                this.serverAddr = model.serverAddr;
            } 

            /**
             * mountDir.
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * serverAddr.
             */
            public Builder serverAddr(String serverAddr) {
                this.serverAddr = serverAddr;
                return this;
            }

            public MountPoints build() {
                return new MountPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link InnerCreateSandboxVolumeMounts} extends {@link TeaModel}
     *
     * <p>InnerCreateSandboxVolumeMounts</p>
     */
    public static class AgenticFs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupID")
        private Integer groupID;

        @com.aliyun.core.annotation.NameInMap("mountPoints")
        private java.util.List<MountPoints> mountPoints;

        @com.aliyun.core.annotation.NameInMap("userID")
        private Integer userID;

        private AgenticFs(Builder builder) {
            this.groupID = builder.groupID;
            this.mountPoints = builder.mountPoints;
            this.userID = builder.userID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgenticFs create() {
            return builder().build();
        }

        /**
         * @return groupID
         */
        public Integer getGroupID() {
            return this.groupID;
        }

        /**
         * @return mountPoints
         */
        public java.util.List<MountPoints> getMountPoints() {
            return this.mountPoints;
        }

        /**
         * @return userID
         */
        public Integer getUserID() {
            return this.userID;
        }

        public static final class Builder {
            private Integer groupID; 
            private java.util.List<MountPoints> mountPoints; 
            private Integer userID; 

            private Builder() {
            } 

            private Builder(AgenticFs model) {
                this.groupID = model.groupID;
                this.mountPoints = model.mountPoints;
                this.userID = model.userID;
            } 

            /**
             * groupID.
             */
            public Builder groupID(Integer groupID) {
                this.groupID = groupID;
                return this;
            }

            /**
             * mountPoints.
             */
            public Builder mountPoints(java.util.List<MountPoints> mountPoints) {
                this.mountPoints = mountPoints;
                return this;
            }

            /**
             * userID.
             */
            public Builder userID(Integer userID) {
                this.userID = userID;
                return this;
            }

            public AgenticFs build() {
                return new AgenticFs(this);
            } 

        } 

    }
    /**
     * 
     * {@link InnerCreateSandboxVolumeMounts} extends {@link TeaModel}
     *
     * <p>InnerCreateSandboxVolumeMounts</p>
     */
    public static class NamedMountPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mountDir")
        private String mountDir;

        @com.aliyun.core.annotation.NameInMap("volumeName")
        private String volumeName;

        private NamedMountPoints(Builder builder) {
            this.mountDir = builder.mountDir;
            this.volumeName = builder.volumeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NamedMountPoints create() {
            return builder().build();
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return volumeName
         */
        public String getVolumeName() {
            return this.volumeName;
        }

        public static final class Builder {
            private String mountDir; 
            private String volumeName; 

            private Builder() {
            } 

            private Builder(NamedMountPoints model) {
                this.mountDir = model.mountDir;
                this.volumeName = model.volumeName;
            } 

            /**
             * mountDir.
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * volumeName.
             */
            public Builder volumeName(String volumeName) {
                this.volumeName = volumeName;
                return this;
            }

            public NamedMountPoints build() {
                return new NamedMountPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link InnerCreateSandboxVolumeMounts} extends {@link TeaModel}
     *
     * <p>InnerCreateSandboxVolumeMounts</p>
     */
    public static class Named extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mountPoints")
        private java.util.List<NamedMountPoints> mountPoints;

        private Named(Builder builder) {
            this.mountPoints = builder.mountPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Named create() {
            return builder().build();
        }

        /**
         * @return mountPoints
         */
        public java.util.List<NamedMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public static final class Builder {
            private java.util.List<NamedMountPoints> mountPoints; 

            private Builder() {
            } 

            private Builder(Named model) {
                this.mountPoints = model.mountPoints;
            } 

            /**
             * mountPoints.
             */
            public Builder mountPoints(java.util.List<NamedMountPoints> mountPoints) {
                this.mountPoints = mountPoints;
                return this;
            }

            public Named build() {
                return new Named(this);
            } 

        } 

    }
    /**
     * 
     * {@link InnerCreateSandboxVolumeMounts} extends {@link TeaModel}
     *
     * <p>InnerCreateSandboxVolumeMounts</p>
     */
    public static class OssMountPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("bucketPath")
        private String bucketPath;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("mountDir")
        private String mountDir;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        private OssMountPoints(Builder builder) {
            this.bucketName = builder.bucketName;
            this.bucketPath = builder.bucketPath;
            this.endpoint = builder.endpoint;
            this.mountDir = builder.mountDir;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssMountPoints create() {
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

            private Builder() {
            } 

            private Builder(OssMountPoints model) {
                this.bucketName = model.bucketName;
                this.bucketPath = model.bucketPath;
                this.endpoint = model.endpoint;
                this.mountDir = model.mountDir;
                this.readOnly = model.readOnly;
            } 

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

            public OssMountPoints build() {
                return new OssMountPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link InnerCreateSandboxVolumeMounts} extends {@link TeaModel}
     *
     * <p>InnerCreateSandboxVolumeMounts</p>
     */
    public static class Oss extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mountPoints")
        private java.util.List<OssMountPoints> mountPoints;

        private Oss(Builder builder) {
            this.mountPoints = builder.mountPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return mountPoints
         */
        public java.util.List<OssMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public static final class Builder {
            private java.util.List<OssMountPoints> mountPoints; 

            private Builder() {
            } 

            private Builder(Oss model) {
                this.mountPoints = model.mountPoints;
            } 

            /**
             * mountPoints.
             */
            public Builder mountPoints(java.util.List<OssMountPoints> mountPoints) {
                this.mountPoints = mountPoints;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
}
