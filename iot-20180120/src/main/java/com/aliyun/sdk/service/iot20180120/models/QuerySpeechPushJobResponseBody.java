// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QuerySpeechPushJobResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpeechPushJobResponseBody</p>
 */
public class QuerySpeechPushJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QuerySpeechPushJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link QuerySpeechPushJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Long expiredTime;

        @com.aliyun.core.annotation.NameInMap("FailDeviceNum")
        private Integer failDeviceNum;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("PushMode")
        private String pushMode;

        @com.aliyun.core.annotation.NameInMap("RunningDeviceNum")
        private Integer runningDeviceNum;

        @com.aliyun.core.annotation.NameInMap("SpeechNum")
        private Integer speechNum;

        @com.aliyun.core.annotation.NameInMap("SpeechStatus")
        private Boolean speechStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SuccessDeviceNum")
        private Integer successDeviceNum;

        @com.aliyun.core.annotation.NameInMap("TotalDeviceNum")
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.code = model.code;
                this.createdTime = model.createdTime;
                this.deviceName = model.deviceName;
                this.expiredTime = model.expiredTime;
                this.failDeviceNum = model.failDeviceNum;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.iotId = model.iotId;
                this.productKey = model.productKey;
                this.pushMode = model.pushMode;
                this.runningDeviceNum = model.runningDeviceNum;
                this.speechNum = model.speechNum;
                this.speechStatus = model.speechStatus;
                this.status = model.status;
                this.successDeviceNum = model.successDeviceNum;
                this.totalDeviceNum = model.totalDeviceNum;
            } 

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
    /**
     * 
     * {@link QuerySpeechPushJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

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
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(List model) {
                this.items = model.items;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySpeechPushJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private Integer pageId;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageId = model.pageId;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

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
