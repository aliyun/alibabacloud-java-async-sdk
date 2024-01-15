// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopInfoResponseBody</p>
 */
public class DescribeDesktopInfoResponseBody extends TeaModel {
    @NameInMap("Desktops")
    private java.util.List < Desktops> desktops;

    @NameInMap("RequestId")
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
         * The details about the cloud desktops.
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
        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopStatus")
        private String desktopStatus;

        @NameInMap("ManagementFlag")
        private java.util.List < String > managementFlag;

        @NameInMap("NewAppSize")
        private Long newAppSize;

        @NameInMap("NewAppVersion")
        private String newAppVersion;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("StartTime")
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
             * The connection status of the end user. Valid values:
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
             * The current version of the cloud desktop.
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * The cloud desktop ID.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The status of the cloud desktop. Valid values:
             * <p>
             * 
             * *   Pending
             * *   Starting
             * *   Running
             * *   Stopping
             * *   Stopped
             * *   Expired
             * *   Deleted
             * *   Failed
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * The flag that is used to manage the cloud desktop.
             */
            public Builder managementFlag(java.util.List < String > managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * NewAppSize.
             */
            public Builder newAppSize(Long newAppSize) {
                this.newAppSize = newAppSize;
                return this;
            }

            /**
             * NewAppVersion.
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * The first time when the cloud desktop was started.
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
