// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NASConfig} extends {@link TeaModel}
 *
 * <p>NASConfig</p>
 */
public class NASConfig extends TeaModel {
    @NameInMap("groupId")
    private Integer groupId;

    @NameInMap("mountPoints")
    private java.util.List < MountPoints> mountPoints;

    @NameInMap("userId")
    private Integer userId;

    private NASConfig(Builder builder) {
        this.groupId = builder.groupId;
        this.mountPoints = builder.mountPoints;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NASConfig create() {
        return builder().build();
    }

    /**
     * @return groupId
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * @return mountPoints
     */
    public java.util.List < MountPoints> getMountPoints() {
        return this.mountPoints;
    }

    /**
     * @return userId
     */
    public Integer getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Integer groupId; 
        private java.util.List < MountPoints> mountPoints; 
        private Integer userId; 

        /**
         * groupId.
         */
        public Builder groupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * mountPoints.
         */
        public Builder mountPoints(java.util.List < MountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public NASConfig build() {
            return new NASConfig(this);
        } 

    } 

    public static class MountPoints extends TeaModel {
        @NameInMap("enableTLS")
        private Boolean enableTLS;

        @NameInMap("mountDir")
        private String mountDir;

        @NameInMap("serverAddr")
        private String serverAddr;

        private MountPoints(Builder builder) {
            this.enableTLS = builder.enableTLS;
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
         * @return enableTLS
         */
        public Boolean getEnableTLS() {
            return this.enableTLS;
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
            private Boolean enableTLS; 
            private String mountDir; 
            private String serverAddr; 

            /**
             * enableTLS.
             */
            public Builder enableTLS(Boolean enableTLS) {
                this.enableTLS = enableTLS;
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
}
