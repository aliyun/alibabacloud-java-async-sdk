// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonTraceResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersonTraceResponseBody</p>
 */
public class ListPersonTraceResponseBody extends TeaModel {
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

    private ListPersonTraceResponseBody(Builder builder) {
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

    public static ListPersonTraceResponseBody create() {
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

        public ListPersonTraceResponseBody build() {
            return new ListPersonTraceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("Date")
        private String date;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("EndSourceImage")
        private String endSourceImage;

        @NameInMap("EndTargetImage")
        private String endTargetImage;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("LastTime")
        private String lastTime;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("StartSourceImage")
        private String startSourceImage;

        @NameInMap("StartTargetImage")
        private String startTargetImage;

        @NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.corpId = builder.corpId;
            this.date = builder.date;
            this.deviceId = builder.deviceId;
            this.endSourceImage = builder.endSourceImage;
            this.endTargetImage = builder.endTargetImage;
            this.groupId = builder.groupId;
            this.lastTime = builder.lastTime;
            this.personId = builder.personId;
            this.startSourceImage = builder.startSourceImage;
            this.startTargetImage = builder.startTargetImage;
            this.startTime = builder.startTime;
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
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return endSourceImage
         */
        public String getEndSourceImage() {
            return this.endSourceImage;
        }

        /**
         * @return endTargetImage
         */
        public String getEndTargetImage() {
            return this.endTargetImage;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return lastTime
         */
        public String getLastTime() {
            return this.lastTime;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return startSourceImage
         */
        public String getStartSourceImage() {
            return this.startSourceImage;
        }

        /**
         * @return startTargetImage
         */
        public String getStartTargetImage() {
            return this.startTargetImage;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String corpId; 
            private String date; 
            private String deviceId; 
            private String endSourceImage; 
            private String endTargetImage; 
            private String groupId; 
            private String lastTime; 
            private String personId; 
            private String startSourceImage; 
            private String startTargetImage; 
            private String startTime; 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
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
             * EndSourceImage.
             */
            public Builder endSourceImage(String endSourceImage) {
                this.endSourceImage = endSourceImage;
                return this;
            }

            /**
             * EndTargetImage.
             */
            public Builder endTargetImage(String endTargetImage) {
                this.endTargetImage = endTargetImage;
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
             * LastTime.
             */
            public Builder lastTime(String lastTime) {
                this.lastTime = lastTime;
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
             * StartSourceImage.
             */
            public Builder startSourceImage(String startSourceImage) {
                this.startSourceImage = startSourceImage;
                return this;
            }

            /**
             * StartTargetImage.
             */
            public Builder startTargetImage(String startTargetImage) {
                this.startTargetImage = startTargetImage;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
