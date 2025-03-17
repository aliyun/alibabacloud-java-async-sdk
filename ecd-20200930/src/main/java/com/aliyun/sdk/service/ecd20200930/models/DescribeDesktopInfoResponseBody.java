// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDesktopInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopInfoResponseBody</p>
 */
public class DescribeDesktopInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Desktops")
    private java.util.List<Desktops> desktops;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktops
     */
    public java.util.List<Desktops> getDesktops() {
        return this.desktops;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Desktops> desktops; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDesktopInfoResponseBody model) {
            this.desktops = model.desktops;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The basic information about cloud computers.</p>
         */
        public Builder desktops(java.util.List<Desktops> desktops) {
            this.desktops = desktops;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>062B1439-709A-580E-85DF-CE97A1560565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopInfoResponseBody build() {
            return new DescribeDesktopInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopInfoResponseBody</p>
     */
    public static class Desktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("ManagementFlag")
        private java.util.List<String> managementFlag;

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
            this.desktopGroupId = builder.desktopGroupId;
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
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
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
        public java.util.List<String> getManagementFlag() {
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
            private String desktopGroupId; 
            private String desktopId; 
            private String desktopStatus; 
            private java.util.List<String> managementFlag; 
            private Long newAppSize; 
            private String newAppVersion; 
            private String releaseNote; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Desktops model) {
                this.connectionStatus = model.connectionStatus;
                this.currentAppVersion = model.currentAppVersion;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopId = model.desktopId;
                this.desktopStatus = model.desktopStatus;
                this.managementFlag = model.managementFlag;
                this.newAppSize = model.newAppSize;
                this.newAppVersion = model.newAppVersion;
                this.releaseNote = model.releaseNote;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The connection status of the user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Connected</li>
             * <li>Disconnected</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disconnected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The version of the cloud computer image.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4.0-R-***</p>
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * <p>The ID of the cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-3uiojcc0j4kh7****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsmucyy****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The status of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Stopped</li>
             * <li>Failed</li>
             * <li>Starting</li>
             * <li>Running</li>
             * <li>Stopping</li>
             * <li>Expired</li>
             * <li>Deleted</li>
             * <li>Pending</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The information about flags that are used to manage cloud computers.</p>
             */
            public Builder managementFlag(java.util.List<String> managementFlag) {
                this.managementFlag = managementFlag;
                return this;
            }

            /**
             * <p>The size of the update package. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>568533470</p>
             */
            public Builder newAppSize(Long newAppSize) {
                this.newAppSize = newAppSize;
                return this;
            }

            /**
             * <p>The version number of the image that can be updated on the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>1.6.0-R-***</p>
             */
            public Builder newAppVersion(String newAppVersion) {
                this.newAppVersion = newAppVersion;
                return this;
            }

            /**
             * <p>The description of the image version that can be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>Test package 03-07</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The time when the cloud computer was first started.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-06T08:31Z</p>
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
