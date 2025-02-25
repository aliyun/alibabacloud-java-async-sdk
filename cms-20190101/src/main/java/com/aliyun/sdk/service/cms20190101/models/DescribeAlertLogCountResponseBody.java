// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAlertLogCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertLogCountResponseBody</p>
 */
public class DescribeAlertLogCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertLogCount")
    private java.util.List < AlertLogCount> alertLogCount;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAlertLogCountResponseBody(Builder builder) {
        this.alertLogCount = builder.alertLogCount;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertLogCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertLogCount
     */
    public java.util.List < AlertLogCount> getAlertLogCount() {
        return this.alertLogCount;
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
        private java.util.List < AlertLogCount> alertLogCount; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The statistics of alert logs.</p>
         */
        public Builder alertLogCount(java.util.List < AlertLogCount> alertLogCount) {
            this.alertLogCount = alertLogCount;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
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

        public DescribeAlertLogCountResponseBody build() {
            return new DescribeAlertLogCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertLogCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogCountResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Logs(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * <p>The name of the dimension field based on which alert logs are aggregated.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the dimension field based on which alert logs are aggregated.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertLogCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertLogCountResponseBody</p>
     */
    public static class AlertLogCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List < Logs> logs;

        private AlertLogCount(Builder builder) {
            this.count = builder.count;
            this.logs = builder.logs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertLogCount create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return logs
         */
        public java.util.List < Logs> getLogs() {
            return this.logs;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List < Logs> logs; 

            /**
             * <p>The number of alert logs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The details about alert logs.</p>
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            public AlertLogCount build() {
                return new AlertLogCount(this);
            } 

        } 

    }
}
