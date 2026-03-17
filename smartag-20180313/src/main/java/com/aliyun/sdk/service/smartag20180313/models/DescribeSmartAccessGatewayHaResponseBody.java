// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSmartAccessGatewayHaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartAccessGatewayHaResponseBody</p>
 */
public class DescribeSmartAccessGatewayHaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupDeviceId")
    private String backupDeviceId;

    @com.aliyun.core.annotation.NameInMap("DeviceLevelBackupState")
    private String deviceLevelBackupState;

    @com.aliyun.core.annotation.NameInMap("DeviceLevelBackupType")
    private String deviceLevelBackupType;

    @com.aliyun.core.annotation.NameInMap("LinkBackupInfoList")
    private LinkBackupInfoList linkBackupInfoList;

    @com.aliyun.core.annotation.NameInMap("MainDeviceId")
    private String mainDeviceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    private DescribeSmartAccessGatewayHaResponseBody(Builder builder) {
        this.backupDeviceId = builder.backupDeviceId;
        this.deviceLevelBackupState = builder.deviceLevelBackupState;
        this.deviceLevelBackupType = builder.deviceLevelBackupType;
        this.linkBackupInfoList = builder.linkBackupInfoList;
        this.mainDeviceId = builder.mainDeviceId;
        this.requestId = builder.requestId;
        this.smartAGId = builder.smartAGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartAccessGatewayHaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupDeviceId
     */
    public String getBackupDeviceId() {
        return this.backupDeviceId;
    }

    /**
     * @return deviceLevelBackupState
     */
    public String getDeviceLevelBackupState() {
        return this.deviceLevelBackupState;
    }

    /**
     * @return deviceLevelBackupType
     */
    public String getDeviceLevelBackupType() {
        return this.deviceLevelBackupType;
    }

    /**
     * @return linkBackupInfoList
     */
    public LinkBackupInfoList getLinkBackupInfoList() {
        return this.linkBackupInfoList;
    }

    /**
     * @return mainDeviceId
     */
    public String getMainDeviceId() {
        return this.mainDeviceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public static final class Builder {
        private String backupDeviceId; 
        private String deviceLevelBackupState; 
        private String deviceLevelBackupType; 
        private LinkBackupInfoList linkBackupInfoList; 
        private String mainDeviceId; 
        private String requestId; 
        private String smartAGId; 

        private Builder() {
        } 

        private Builder(DescribeSmartAccessGatewayHaResponseBody model) {
            this.backupDeviceId = model.backupDeviceId;
            this.deviceLevelBackupState = model.deviceLevelBackupState;
            this.deviceLevelBackupType = model.deviceLevelBackupType;
            this.linkBackupInfoList = model.linkBackupInfoList;
            this.mainDeviceId = model.mainDeviceId;
            this.requestId = model.requestId;
            this.smartAGId = model.smartAGId;
        } 

        /**
         * <p>The serial number of the standby SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag11axxxx</p>
         */
        public Builder backupDeviceId(String backupDeviceId) {
            this.backupDeviceId = backupDeviceId;
            return this;
        }

        /**
         * <p>Indicates whether device-based HA is enabled. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong>: enabled</li>
         * <li><strong>OFF</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder deviceLevelBackupState(String deviceLevelBackupState) {
            this.deviceLevelBackupState = deviceLevelBackupState;
            return this;
        }

        /**
         * <p>The deployment mode of the SAG devices that have HA enabled. Valid values:</p>
         * <ul>
         * <li><strong>warm_backup</strong>: active-active mode.</li>
         * <li><strong>cold_backup</strong>: active-standby mode.</li>
         * <li><strong>no_backup</strong>: HA is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cold_backup</p>
         */
        public Builder deviceLevelBackupType(String deviceLevelBackupType) {
            this.deviceLevelBackupType = deviceLevelBackupType;
            return this;
        }

        /**
         * <p>The information about standby connections.</p>
         */
        public Builder linkBackupInfoList(LinkBackupInfoList linkBackupInfoList) {
            this.linkBackupInfoList = linkBackupInfoList;
            return this;
        }

        /**
         * <p>The serial number of the active SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag11axxxx</p>
         */
        public Builder mainDeviceId(String mainDeviceId) {
            this.mainDeviceId = mainDeviceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>582FE511-FEFE-42BC-BBF4-4F8ECF92Exxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-i8mogwi9kisigc3xxxx</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }

        public DescribeSmartAccessGatewayHaResponseBody build() {
            return new DescribeSmartAccessGatewayHaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSmartAccessGatewayHaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayHaResponseBody</p>
     */
    public static class LinkBackupInfoListLinkBackupInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupLinkId")
        private String backupLinkId;

        @com.aliyun.core.annotation.NameInMap("BackupLinkState")
        private String backupLinkState;

        @com.aliyun.core.annotation.NameInMap("LinkLevelBackupState")
        private String linkLevelBackupState;

        @com.aliyun.core.annotation.NameInMap("LinkLevelBackupType")
        private String linkLevelBackupType;

        @com.aliyun.core.annotation.NameInMap("MainLinkId")
        private String mainLinkId;

        @com.aliyun.core.annotation.NameInMap("MainLinkState")
        private String mainLinkState;

        private LinkBackupInfoListLinkBackupInfoList(Builder builder) {
            this.backupLinkId = builder.backupLinkId;
            this.backupLinkState = builder.backupLinkState;
            this.linkLevelBackupState = builder.linkLevelBackupState;
            this.linkLevelBackupType = builder.linkLevelBackupType;
            this.mainLinkId = builder.mainLinkId;
            this.mainLinkState = builder.mainLinkState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkBackupInfoListLinkBackupInfoList create() {
            return builder().build();
        }

        /**
         * @return backupLinkId
         */
        public String getBackupLinkId() {
            return this.backupLinkId;
        }

        /**
         * @return backupLinkState
         */
        public String getBackupLinkState() {
            return this.backupLinkState;
        }

        /**
         * @return linkLevelBackupState
         */
        public String getLinkLevelBackupState() {
            return this.linkLevelBackupState;
        }

        /**
         * @return linkLevelBackupType
         */
        public String getLinkLevelBackupType() {
            return this.linkLevelBackupType;
        }

        /**
         * @return mainLinkId
         */
        public String getMainLinkId() {
            return this.mainLinkId;
        }

        /**
         * @return mainLinkState
         */
        public String getMainLinkState() {
            return this.mainLinkState;
        }

        public static final class Builder {
            private String backupLinkId; 
            private String backupLinkState; 
            private String linkLevelBackupState; 
            private String linkLevelBackupType; 
            private String mainLinkId; 
            private String mainLinkState; 

            private Builder() {
            } 

            private Builder(LinkBackupInfoListLinkBackupInfoList model) {
                this.backupLinkId = model.backupLinkId;
                this.backupLinkState = model.backupLinkState;
                this.linkLevelBackupState = model.linkLevelBackupState;
                this.linkLevelBackupType = model.linkLevelBackupType;
                this.mainLinkId = model.mainLinkId;
                this.mainLinkState = model.mainLinkState;
            } 

            /**
             * <p>The ID of the standby connection.</p>
             * 
             * <strong>example:</strong>
             * <p>wan1</p>
             */
            public Builder backupLinkId(String backupLinkId) {
                this.backupLinkId = backupLinkId;
                return this;
            }

            /**
             * <p>The status of the standby connection. Valid values:</p>
             * <ul>
             * <li><strong>up</strong>: available</li>
             * <li><strong>down</strong>: unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>down</p>
             */
            public Builder backupLinkState(String backupLinkState) {
                this.backupLinkState = backupLinkState;
                return this;
            }

            /**
             * <p>Indicates whether HA is enabled to provide standby connections. Valid values:</p>
             * <ul>
             * <li><strong>ON</strong>: enabled</li>
             * <li><strong>OFF</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder linkLevelBackupState(String linkLevelBackupState) {
                this.linkLevelBackupState = linkLevelBackupState;
                return this;
            }

            /**
             * <p>The HA mode. Valid values:</p>
             * <ul>
             * <li><strong>DedicatedLineBackupMode</strong>: Express Connect circuit and SAG.</li>
             * <li><strong>StandbyMode</strong>: active and standby WAN ports.</li>
             * <li><strong>Off</strong>: HA is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StandbyMode</p>
             */
            public Builder linkLevelBackupType(String linkLevelBackupType) {
                this.linkLevelBackupType = linkLevelBackupType;
                return this;
            }

            /**
             * <p>The ID of the active connection.</p>
             * 
             * <strong>example:</strong>
             * <p>lte</p>
             */
            public Builder mainLinkId(String mainLinkId) {
                this.mainLinkId = mainLinkId;
                return this;
            }

            /**
             * <p>The status of the active connection. Valid values:</p>
             * <ul>
             * <li><strong>up</strong>: available</li>
             * <li><strong>down</strong>: unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder mainLinkState(String mainLinkState) {
                this.mainLinkState = mainLinkState;
                return this;
            }

            public LinkBackupInfoListLinkBackupInfoList build() {
                return new LinkBackupInfoListLinkBackupInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayHaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayHaResponseBody</p>
     */
    public static class LinkBackupInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LinkBackupInfoList")
        private java.util.List<LinkBackupInfoListLinkBackupInfoList> linkBackupInfoList;

        private LinkBackupInfoList(Builder builder) {
            this.linkBackupInfoList = builder.linkBackupInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkBackupInfoList create() {
            return builder().build();
        }

        /**
         * @return linkBackupInfoList
         */
        public java.util.List<LinkBackupInfoListLinkBackupInfoList> getLinkBackupInfoList() {
            return this.linkBackupInfoList;
        }

        public static final class Builder {
            private java.util.List<LinkBackupInfoListLinkBackupInfoList> linkBackupInfoList; 

            private Builder() {
            } 

            private Builder(LinkBackupInfoList model) {
                this.linkBackupInfoList = model.linkBackupInfoList;
            } 

            /**
             * <p>The information about standby connections.</p>
             */
            public Builder linkBackupInfoList(java.util.List<LinkBackupInfoListLinkBackupInfoList> linkBackupInfoList) {
                this.linkBackupInfoList = linkBackupInfoList;
                return this;
            }

            public LinkBackupInfoList build() {
                return new LinkBackupInfoList(this);
            } 

        } 

    }
}
