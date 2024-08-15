// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSpecialPersonSchedulingResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceGroupSpecialPersonSchedulingResponseBody</p>
 */
public class GetServiceGroupSpecialPersonSchedulingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetServiceGroupSpecialPersonSchedulingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupSpecialPersonSchedulingResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceGroupSpecialPersonSchedulingResponseBody build() {
            return new GetServiceGroupSpecialPersonSchedulingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("schedulingDate")
        private String schedulingDate;

        @com.aliyun.core.annotation.NameInMap("schedulingEndTime")
        private String schedulingEndTime;

        @com.aliyun.core.annotation.NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @com.aliyun.core.annotation.NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @com.aliyun.core.annotation.NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @com.aliyun.core.annotation.NameInMap("serviceGroupName")
        private String serviceGroupName;

        private Data(Builder builder) {
            this.schedulingDate = builder.schedulingDate;
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.serviceGroupId = builder.serviceGroupId;
            this.serviceGroupName = builder.serviceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return schedulingDate
         */
        public String getSchedulingDate() {
            return this.schedulingDate;
        }

        /**
         * @return schedulingEndTime
         */
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        /**
         * @return schedulingStartTime
         */
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        /**
         * @return schedulingUserId
         */
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        /**
         * @return serviceGroupName
         */
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public static final class Builder {
            private String schedulingDate; 
            private String schedulingEndTime; 
            private String schedulingStartTime; 
            private Long schedulingUserId; 
            private Long serviceGroupId; 
            private String serviceGroupName; 

            /**
             * schedulingDate.
             */
            public Builder schedulingDate(String schedulingDate) {
                this.schedulingDate = schedulingDate;
                return this;
            }

            /**
             * schedulingEndTime.
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
                return this;
            }

            /**
             * schedulingStartTime.
             */
            public Builder schedulingStartTime(String schedulingStartTime) {
                this.schedulingStartTime = schedulingStartTime;
                return this;
            }

            /**
             * schedulingUserId.
             */
            public Builder schedulingUserId(Long schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            /**
             * serviceGroupId.
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * serviceGroupName.
             */
            public Builder serviceGroupName(String serviceGroupName) {
                this.serviceGroupName = serviceGroupName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
