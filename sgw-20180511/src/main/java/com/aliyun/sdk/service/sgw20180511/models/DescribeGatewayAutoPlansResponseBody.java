// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayAutoPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayAutoPlansResponseBody</p>
 */
public class DescribeGatewayAutoPlansResponseBody extends TeaModel {
    @NameInMap("AutoPlans")
    private java.util.List < AutoPlans> autoPlans;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGatewayAutoPlansResponseBody(Builder builder) {
        this.autoPlans = builder.autoPlans;
        this.code = builder.code;
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

    public static DescribeGatewayAutoPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoPlans
     */
    public java.util.List < AutoPlans> getAutoPlans() {
        return this.autoPlans;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AutoPlans> autoPlans; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * AutoPlans.
         */
        public Builder autoPlans(java.util.List < AutoPlans> autoPlans) {
            this.autoPlans = autoPlans;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
        public Builder success(Boolean success) {
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

        public DescribeGatewayAutoPlansResponseBody build() {
            return new DescribeGatewayAutoPlansResponseBody(this);
        } 

    } 

    public static class AutoPlans extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Event")
        private String event;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private AutoPlans(Builder builder) {
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.event = builder.event;
            this.planId = builder.planId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoPlans create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String detail; 
            private Long endTime; 
            private String event; 
            private String planId; 
            private Long startTime; 
            private String status; 

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
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
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AutoPlans build() {
                return new AutoPlans(this);
            } 

        } 

    }
}
