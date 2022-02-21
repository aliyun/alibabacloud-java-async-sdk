// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCorpGroupMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCorpGroupMetricsResponseBody</p>
 */
public class ListCorpGroupMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListCorpGroupMetricsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCorpGroupMetricsResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String success; 
        private Integer totalCount; 

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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCorpGroupMetricsResponseBody build() {
            return new ListCorpGroupMetricsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CorpGroupId")
        private String corpGroupId;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DateId")
        private String dateId;

        @NameInMap("DeviceGroupId")
        private String deviceGroupId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("PersonID")
        private String personID;

        @NameInMap("TagCode")
        private String tagCode;

        @NameInMap("TagMetrics")
        private String tagMetrics;

        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("UserGroupId")
        private String userGroupId;

        private Data(Builder builder) {
            this.corpGroupId = builder.corpGroupId;
            this.corpId = builder.corpId;
            this.dateId = builder.dateId;
            this.deviceGroupId = builder.deviceGroupId;
            this.deviceId = builder.deviceId;
            this.personID = builder.personID;
            this.tagCode = builder.tagCode;
            this.tagMetrics = builder.tagMetrics;
            this.tagValue = builder.tagValue;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return corpGroupId
         */
        public String getCorpGroupId() {
            return this.corpGroupId;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return dateId
         */
        public String getDateId() {
            return this.dateId;
        }

        /**
         * @return deviceGroupId
         */
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return personID
         */
        public String getPersonID() {
            return this.personID;
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

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private String corpGroupId; 
            private String corpId; 
            private String dateId; 
            private String deviceGroupId; 
            private String deviceId; 
            private String personID; 
            private String tagCode; 
            private String tagMetrics; 
            private String tagValue; 
            private String userGroupId; 

            /**
             * CorpGroupId.
             */
            public Builder corpGroupId(String corpGroupId) {
                this.corpGroupId = corpGroupId;
                return this;
            }

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DateId.
             */
            public Builder dateId(String dateId) {
                this.dateId = dateId;
                return this;
            }

            /**
             * DeviceGroupId.
             */
            public Builder deviceGroupId(String deviceGroupId) {
                this.deviceGroupId = deviceGroupId;
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
             * PersonID.
             */
            public Builder personID(String personID) {
                this.personID = personID;
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

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * UserGroupId.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
