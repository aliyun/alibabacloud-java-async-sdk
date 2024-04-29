// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopInfoResponseBody</p>
 */
public class DescribeDesktopInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Desktops")
    private java.util.List < Desktops> desktops;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopInfoResponseBody(Builder builder) {
        this.desktops = builder.desktops;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktops
     */
    public java.util.List < Desktops> getDesktops() {
        return this.desktops;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Desktops> desktops; 
        private String requestId; 

        /**
         * Details of the cloud computers.
         */
        public Builder desktops(java.util.List < Desktops> desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopInfoResponseBody build() {
            return new DescribeDesktopInfoResponseBody(this);
        } 

    } 

    public static class Desktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("ManagementFlag")
        private java.util.List < String > managementFlag;

        @com.aliyun.core.annotation.NameInMap("NewAppSize")
        private Long newAppSize;

        @com.aliyun.core.annotation.NameInMap("NewAppVersion")
        private String newAppVersion;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Desktops(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.currentAppVersion = builder.currentAppVersion;
            this.desktopId = builder.desktopId;
            this.desktopStatus = builder.desktopStatus;
            this.managementFlag = builder.managementFlag;
            this.newAppSize = builder.newAppSize;
            this.newAppVersion = builder.newAppVersion;
            this.releaseNote = builder.releaseNote;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Desktops create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return currentAppVersion
         */
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return managementFlag
         */
        public java.util.List < String > getManagementFlag() {
            return this.managementFlag;
        }

        /**
         * @return newAppSize
         */
        public Long getNewAppSize() {
            return this.newAppSize;
        }

        /**
         * @return newAppVersion
         */
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String currentAppVersion; 
            private String desktopId; 
            private String desktopStatus; 
            private java.util.List < String > managementFlag; 
            private Long newAppSize; 
            private String newAppVersion; 
            private String releaseNote; 
            private String startTime; 

            /**
             * The connection status of the user. Valid values:
             * <p>
             * 
             * *   Connected
             * *   Disconnected
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * The version of the image that is used by the cloud computer.
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * The cloud computer ID.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The status of the cloud computer. Valid values:
             * <p>
             * 
             * *   Pending: The cloud computer is being created.
             * *   Starting: The cloud computer is being started.
             * *   Running: The cloud computer is running.
             * *   Stopping: The cloud computer is being stopped.
             * *   Stopped: The cloud computer is stopped.
             * *   Expired: The cloud computer is expired.
             * *   Deleted: The cloud computer is deleted.
             * *   Failed: Failed to create the cloud computer.
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * The information about flags that are used to manage cloud computers.
             */
            public Builder managementFlag(java.util.List < String > managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * The size of the update package. Unit: KB.
             */
            public Builder newAppSize(Long newAppSize) {
                this.newAppSize = newAppSize;
                return this;
            }

            /**
             * The destination version to which the image of the cloud computer can be updated.
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * The description of the destination version to which the image of the cloud computer can be updated.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * The first time when the cloud computer was started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Desktops build() {
                return new Desktops(this);
            } 

        } 

    }
}
