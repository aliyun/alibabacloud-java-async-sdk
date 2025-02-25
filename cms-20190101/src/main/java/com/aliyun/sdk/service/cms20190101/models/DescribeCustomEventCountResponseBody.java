// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomEventCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomEventCountResponseBody</p>
 */
public class DescribeCustomEventCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CustomEventCounts")
    private CustomEventCounts customEventCounts;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomEventCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.customEventCounts = builder.customEventCounts;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return customEventCounts
     */
    public CustomEventCounts getCustomEventCounts() {
        return this.customEventCounts;
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
        private String code; 
        private CustomEventCounts customEventCounts; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
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
         * <p>The details of the custom event.</p>
         */
        public Builder customEventCounts(CustomEventCounts customEventCounts) {
            this.customEventCounts = customEventCounts;
            return this;
        }

        /**
         * <p>The returned message. If the call was successful, the value success is returned. If the call failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>60912C8D-B340-4253-ADE7-61ACDFD25CFC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomEventCountResponseBody build() {
            return new DescribeCustomEventCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomEventCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEventCountResponseBody</p>
     */
    public static class CustomEventCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Integer num;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private CustomEventCount(Builder builder) {
            this.name = builder.name;
            this.num = builder.num;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEventCount create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return num
         */
        public Integer getNum() {
            return this.num;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String name; 
            private Integer num; 
            private Long time; 

            /**
             * <p>The name of the custom event.</p>
             * 
             * <strong>example:</strong>
             * <p>BABEL_BUY</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of times that the custom event occurred in the specified time period.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder num(Integer num) {
                this.num = num;
                return this;
            }

            /**
             * <p>The time when the custom event occurred.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1552267615000</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public CustomEventCount build() {
                return new CustomEventCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomEventCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEventCountResponseBody</p>
     */
    public static class CustomEventCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomEventCount")
        private java.util.List < CustomEventCount> customEventCount;

        private CustomEventCounts(Builder builder) {
            this.customEventCount = builder.customEventCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEventCounts create() {
            return builder().build();
        }

        /**
         * @return customEventCount
         */
        public java.util.List < CustomEventCount> getCustomEventCount() {
            return this.customEventCount;
        }

        public static final class Builder {
            private java.util.List < CustomEventCount> customEventCount; 

            /**
             * CustomEventCount.
             */
            public Builder customEventCount(java.util.List < CustomEventCount> customEventCount) {
                this.customEventCount = customEventCount;
                return this;
            }

            public CustomEventCounts build() {
                return new CustomEventCounts(this);
            } 

        } 

    }
}
