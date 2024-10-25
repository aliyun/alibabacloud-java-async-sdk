// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAlertLogHistogramResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertLogHistogramResponseBody</p>
 */
public class DescribeAlertLogHistogramResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertLogHistogramList")
    private java.util.List < AlertLogHistogramList> alertLogHistogramList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The number of alert logs that were generated during each interval of a time period.</p>
         */
        public Builder alertLogHistogramList(java.util.List < AlertLogHistogramList> alertLogHistogramList) {
            this.alertLogHistogramList = alertLogHistogramList;
            return this;
        }

        /**
         * <p>The response code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1C4A3709-BF52-42EE-87B5-7435F0929585</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAlertLogHistogramResponseBody build() {
            return new DescribeAlertLogHistogramResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertLogHistogramResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogHistogramResponseBody</p>
     */
    public static class AlertLogHistogramList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("From")
        private Long from;

        @com.aliyun.core.annotation.NameInMap("To")
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
             * <p>The number of alert logs.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The start timestamp of the queried alert logs.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1610074791</p>
             */
            public Builder from(Long from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The end timestamp of the queried alert logs.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1610074800</p>
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
