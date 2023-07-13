// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertLogHistogramResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertLogHistogramResponseBody</p>
 */
public class DescribeAlertLogHistogramResponseBody extends TeaModel {
    @NameInMap("AlertLogHistogramList")
    private java.util.List < AlertLogHistogramList> alertLogHistogramList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAlertLogHistogramResponseBody(Builder builder) {
        this.alertLogHistogramList = builder.alertLogHistogramList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertLogHistogramResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertLogHistogramList
     */
    public java.util.List < AlertLogHistogramList> getAlertLogHistogramList() {
        return this.alertLogHistogramList;
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
        private java.util.List < AlertLogHistogramList> alertLogHistogramList; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The end timestamp of queried alert logs in an interval. Unit: seconds.
         */
        public Builder alertLogHistogramList(java.util.List < AlertLogHistogramList> alertLogHistogramList) {
            this.alertLogHistogramList = alertLogHistogramList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The details about the number of alert logs that were generated during each interval of a time period.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start timestamp of queried alert logs in an interval. Unit: seconds.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAlertLogHistogramResponseBody build() {
            return new DescribeAlertLogHistogramResponseBody(this);
        } 

    } 

    public static class AlertLogHistogramList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("From")
        private Long from;

        @NameInMap("To")
        private Long to;

        private AlertLogHistogramList(Builder builder) {
            this.count = builder.count;
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertLogHistogramList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return from
         */
        public Long getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Long getTo() {
            return this.to;
        }

        public static final class Builder {
            private Integer count; 
            private Long from; 
            private Long to; 

            /**
             * For more information about common request parameters, see [Common parameters](~~199331~~).
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The number of alert logs.
             */
            public Builder from(Long from) {
                this.from = from;
                return this;
            }

            /**
             * This topic provides an example on how to query the number of alert logs of Elastic Compute Service (ECS) from the cloud service dimension.
             */
            public Builder to(Long to) {
                this.to = to;
                return this;
            }

            public AlertLogHistogramList build() {
                return new AlertLogHistogramList(this);
            } 

        } 

    }
}
