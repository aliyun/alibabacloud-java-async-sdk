// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechPushJobResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpeechPushJobResponseBody</p>
 */
public class QuerySpeechPushJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QuerySpeechPushJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechPushJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySpeechPushJobResponseBody build() {
            return new QuerySpeechPushJobResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("FailDeviceNum")
        private Integer failDeviceNum;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("PushMode")
        private String pushMode;

        @NameInMap("RunningDeviceNum")
        private Integer runningDeviceNum;

        @NameInMap("SpeechNum")
        private Integer speechNum;

        @NameInMap("SpeechStatus")
        private Boolean speechStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("SuccessDeviceNum")
        private Integer successDeviceNum;

        @NameInMap("TotalDeviceNum")
        private Integer totalDeviceNum;

        private Items(Builder builder) {
            this.code = builder.code;
            this.createdTime = builder.createdTime;
            this.deviceName = builder.deviceName;
            this.expiredTime = builder.expiredTime;
            this.failDeviceNum = builder.failDeviceNum;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
            this.pushMode = builder.pushMode;
            this.runningDeviceNum = builder.runningDeviceNum;
            this.speechNum = builder.speechNum;
            this.speechStatus = builder.speechStatus;
            this.status = builder.status;
            this.successDeviceNum = builder.successDeviceNum;
            this.totalDeviceNum = builder.totalDeviceNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return failDeviceNum
         */
        public Integer getFailDeviceNum() {
            return this.failDeviceNum;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return pushMode
         */
        public String getPushMode() {
            return this.pushMode;
        }

        /**
         * @return runningDeviceNum
         */
        public Integer getRunningDeviceNum() {
            return this.runningDeviceNum;
        }

        /**
         * @return speechNum
         */
        public Integer getSpeechNum() {
            return this.speechNum;
        }

        /**
         * @return speechStatus
         */
        public Boolean getSpeechStatus() {
            return this.speechStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return successDeviceNum
         */
        public Integer getSuccessDeviceNum() {
            return this.successDeviceNum;
        }

        /**
         * @return totalDeviceNum
         */
        public Integer getTotalDeviceNum() {
            return this.totalDeviceNum;
        }

        public static final class Builder {
            private String code; 
            private Long createdTime; 
            private String deviceName; 
            private Long expiredTime; 
            private Integer failDeviceNum; 
            private String groupId; 
            private String groupName; 
            private String iotId; 
            private String productKey; 
            private String pushMode; 
            private Integer runningDeviceNum; 
            private Integer speechNum; 
            private Boolean speechStatus; 
            private String status; 
            private Integer successDeviceNum; 
            private Integer totalDeviceNum; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
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
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * FailDeviceNum.
             */
            public Builder failDeviceNum(Integer failDeviceNum) {
                this.failDeviceNum = failDeviceNum;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * PushMode.
             */
            public Builder pushMode(String pushMode) {
                this.pushMode = pushMode;
                return this;
            }

            /**
             * RunningDeviceNum.
             */
            public Builder runningDeviceNum(Integer runningDeviceNum) {
                this.runningDeviceNum = runningDeviceNum;
                return this;
            }

            /**
             * SpeechNum.
             */
            public Builder speechNum(Integer speechNum) {
                this.speechNum = speechNum;
                return this;
            }

            /**
             * SpeechStatus.
             */
            public Builder speechStatus(Boolean speechStatus) {
                this.speechStatus = speechStatus;
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
             * SuccessDeviceNum.
             */
            public Builder successDeviceNum(Integer successDeviceNum) {
                this.successDeviceNum = successDeviceNum;
                return this;
            }

            /**
             * TotalDeviceNum.
             */
            public Builder totalDeviceNum(Integer totalDeviceNum) {
                this.totalDeviceNum = totalDeviceNum;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        private List(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < Items> items; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("PageId")
        private Integer pageId;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageId = builder.pageId;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private List list; 
            private Integer pageId; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
