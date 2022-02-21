// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindOsVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>FindOsVersionsResponseBody</p>
 */
public class FindOsVersionsResponseBody extends TeaModel {
    @NameInMap("OsVersionList")
    private OsVersionList osVersionList;

    @NameInMap("RequestId")
    private String requestId;

    private FindOsVersionsResponseBody(Builder builder) {
        this.osVersionList = builder.osVersionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindOsVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return osVersionList
     */
    public OsVersionList getOsVersionList() {
        return this.osVersionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OsVersionList osVersionList; 
        private String requestId; 

        /**
         * OsVersionList.
         */
        public Builder osVersionList(OsVersionList osVersionList) {
            this.osVersionList = osVersionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindOsVersionsResponseBody build() {
            return new FindOsVersionsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("DeviceModelId")
        private String deviceModelId;

        @NameInMap("DeviceModelName")
        private String deviceModelName;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("GmtModifyTimestamp")
        private Long gmtModifyTimestamp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsForceNightUpgrade")
        private String isForceNightUpgrade;

        @NameInMap("IsForceReboot")
        private String isForceReboot;

        @NameInMap("IsForceUpgrade")
        private String isForceUpgrade;

        @NameInMap("IsMilestone")
        private String isMilestone;

        @NameInMap("IsSilentUpgrade")
        private String isSilentUpgrade;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("SystemVersion")
        private String systemVersion;

        private Items(Builder builder) {
            this.deviceModelId = builder.deviceModelId;
            this.deviceModelName = builder.deviceModelName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.isForceNightUpgrade = builder.isForceNightUpgrade;
            this.isForceReboot = builder.isForceReboot;
            this.isForceUpgrade = builder.isForceUpgrade;
            this.isMilestone = builder.isMilestone;
            this.isSilentUpgrade = builder.isSilentUpgrade;
            this.remark = builder.remark;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.systemVersion = builder.systemVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return deviceModelId
         */
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        /**
         * @return deviceModelName
         */
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return gmtModifyTimestamp
         */
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isForceNightUpgrade
         */
        public String getIsForceNightUpgrade() {
            return this.isForceNightUpgrade;
        }

        /**
         * @return isForceReboot
         */
        public String getIsForceReboot() {
            return this.isForceReboot;
        }

        /**
         * @return isForceUpgrade
         */
        public String getIsForceUpgrade() {
            return this.isForceUpgrade;
        }

        /**
         * @return isMilestone
         */
        public String getIsMilestone() {
            return this.isMilestone;
        }

        /**
         * @return isSilentUpgrade
         */
        public String getIsSilentUpgrade() {
            return this.isSilentUpgrade;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public static final class Builder {
            private String deviceModelId; 
            private String deviceModelName; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private Long id; 
            private String isForceNightUpgrade; 
            private String isForceReboot; 
            private String isForceUpgrade; 
            private String isMilestone; 
            private String isSilentUpgrade; 
            private String remark; 
            private String status; 
            private String statusName; 
            private String systemVersion; 

            /**
             * DeviceModelId.
             */
            public Builder deviceModelId(String deviceModelId) {
                this.deviceModelId = deviceModelId;
                return this;
            }

            /**
             * DeviceModelName.
             */
            public Builder deviceModelName(String deviceModelName) {
                this.deviceModelName = deviceModelName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * GmtModifyTimestamp.
             */
            public Builder gmtModifyTimestamp(Long gmtModifyTimestamp) {
                this.gmtModifyTimestamp = gmtModifyTimestamp;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsForceNightUpgrade.
             */
            public Builder isForceNightUpgrade(String isForceNightUpgrade) {
                this.isForceNightUpgrade = isForceNightUpgrade;
                return this;
            }

            /**
             * IsForceReboot.
             */
            public Builder isForceReboot(String isForceReboot) {
                this.isForceReboot = isForceReboot;
                return this;
            }

            /**
             * IsForceUpgrade.
             */
            public Builder isForceUpgrade(String isForceUpgrade) {
                this.isForceUpgrade = isForceUpgrade;
                return this;
            }

            /**
             * IsMilestone.
             */
            public Builder isMilestone(String isMilestone) {
                this.isMilestone = isMilestone;
                return this;
            }

            /**
             * IsSilentUpgrade.
             */
            public Builder isSilentUpgrade(String isSilentUpgrade) {
                this.isSilentUpgrade = isSilentUpgrade;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class OsVersionList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private OsVersionList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsVersionList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer totalCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public OsVersionList build() {
                return new OsVersionList(this);
            } 

        } 

    }
}
