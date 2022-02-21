// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssistHistoriesResponseBody</p>
 */
public class ListAssistHistoriesResponseBody extends TeaModel {
    @NameInMap("Histories")
    private java.util.List < Histories> histories;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PerPage")
    private Integer perPage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAssistHistoriesResponseBody(Builder builder) {
        this.histories = builder.histories;
        this.pageIndex = builder.pageIndex;
        this.perPage = builder.perPage;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssistHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return histories
     */
    public java.util.List < Histories> getHistories() {
        return this.histories;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return perPage
     */
    public Integer getPerPage() {
        return this.perPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Histories> histories; 
        private Integer pageIndex; 
        private Integer perPage; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Histories.
         */
        public Builder histories(java.util.List < Histories> histories) {
            this.histories = histories;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PerPage.
         */
        public Builder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAssistHistoriesResponseBody build() {
            return new ListAssistHistoriesResponseBody(this);
        } 

    } 

    public static class Histories extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("HardwareId")
        private String hardwareId;

        @NameInMap("ID")
        private String ID;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("UID")
        private String UID;

        @NameInMap("UNAME")
        private String UNAME;

        @NameInMap("UUID")
        private String UUID;

        @NameInMap("VIN")
        private String VIN;

        private Histories(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.endTime = builder.endTime;
            this.hardwareId = builder.hardwareId;
            this.ID = builder.ID;
            this.serialNumber = builder.serialNumber;
            this.startTime = builder.startTime;
            this.UID = builder.UID;
            this.UNAME = builder.UNAME;
            this.UUID = builder.UUID;
            this.VIN = builder.VIN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histories create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return hardwareId
         */
        public String getHardwareId() {
            return this.hardwareId;
        }

        /**
         * @return ID
         */
        public String getID() {
            return this.ID;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return UID
         */
        public String getUID() {
            return this.UID;
        }

        /**
         * @return UNAME
         */
        public String getUNAME() {
            return this.UNAME;
        }

        /**
         * @return UUID
         */
        public String getUUID() {
            return this.UUID;
        }

        /**
         * @return VIN
         */
        public String getVIN() {
            return this.VIN;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceName; 
            private Long endTime; 
            private String hardwareId; 
            private String ID; 
            private String serialNumber; 
            private Long startTime; 
            private String UID; 
            private String UNAME; 
            private String UUID; 
            private String VIN; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HardwareId.
             */
            public Builder hardwareId(String hardwareId) {
                this.hardwareId = hardwareId;
                return this;
            }

            /**
             * ID.
             */
            public Builder ID(String ID) {
                this.ID = ID;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UID.
             */
            public Builder UID(String UID) {
                this.UID = UID;
                return this;
            }

            /**
             * UNAME.
             */
            public Builder UNAME(String UNAME) {
                this.UNAME = UNAME;
                return this;
            }

            /**
             * UUID.
             */
            public Builder UUID(String UUID) {
                this.UUID = UUID;
                return this;
            }

            /**
             * VIN.
             */
            public Builder VIN(String VIN) {
                this.VIN = VIN;
                return this;
            }

            public Histories build() {
                return new Histories(this);
            } 

        } 

    }
}
