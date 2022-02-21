// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonVisitCountResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersonVisitCountResponseBody</p>
 */
public class ListPersonVisitCountResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNo")
    private String pageNo;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListPersonVisitCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonVisitCountResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String pageNo; 
        private String pageSize; 
        private String requestId; 
        private String success; 
        private String totalCount; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPersonVisitCountResponseBody build() {
            return new ListPersonVisitCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DayId")
        private String dayId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("HourId")
        private String hourId;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("TagCode")
        private String tagCode;

        @NameInMap("TagMetrics")
        private String tagMetrics;

        private Data(Builder builder) {
            this.corpId = builder.corpId;
            this.dayId = builder.dayId;
            this.deviceId = builder.deviceId;
            this.groupId = builder.groupId;
            this.hourId = builder.hourId;
            this.personId = builder.personId;
            this.tagCode = builder.tagCode;
            this.tagMetrics = builder.tagMetrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return dayId
         */
        public String getDayId() {
            return this.dayId;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return hourId
         */
        public String getHourId() {
            return this.hourId;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return tagCode
         */
        public String getTagCode() {
            return this.tagCode;
        }

        /**
         * @return tagMetrics
         */
        public String getTagMetrics() {
            return this.tagMetrics;
        }

        public static final class Builder {
            private String corpId; 
            private String dayId; 
            private String deviceId; 
            private String groupId; 
            private String hourId; 
            private String personId; 
            private String tagCode; 
            private String tagMetrics; 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DayId.
             */
            public Builder dayId(String dayId) {
                this.dayId = dayId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * HourId.
             */
            public Builder hourId(String hourId) {
                this.hourId = hourId;
                return this;
            }

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
                return this;
            }

            /**
             * TagCode.
             */
            public Builder tagCode(String tagCode) {
                this.tagCode = tagCode;
                return this;
            }

            /**
             * TagMetrics.
             */
            public Builder tagMetrics(String tagMetrics) {
                this.tagMetrics = tagMetrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
