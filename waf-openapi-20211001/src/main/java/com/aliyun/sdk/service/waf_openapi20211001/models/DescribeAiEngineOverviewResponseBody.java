// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAiEngineOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiEngineOverviewResponseBody</p>
 */
public class DescribeAiEngineOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnalyzedRequestCount")
    private Long analyzedRequestCount;

    @com.aliyun.core.annotation.NameInMap("EventCount")
    private Long eventCount;

    @com.aliyun.core.annotation.NameInMap("HandleStatusCounts")
    private HandleStatusCounts handleStatusCounts;

    @com.aliyun.core.annotation.NameInMap("ProtectedGroupCount")
    private Integer protectedGroupCount;

    @com.aliyun.core.annotation.NameInMap("ProtectedResourceCount")
    private Integer protectedResourceCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskCounts")
    private RiskCounts riskCounts;

    private DescribeAiEngineOverviewResponseBody(Builder builder) {
        this.analyzedRequestCount = builder.analyzedRequestCount;
        this.eventCount = builder.eventCount;
        this.handleStatusCounts = builder.handleStatusCounts;
        this.protectedGroupCount = builder.protectedGroupCount;
        this.protectedResourceCount = builder.protectedResourceCount;
        this.requestId = builder.requestId;
        this.riskCounts = builder.riskCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analyzedRequestCount
     */
    public Long getAnalyzedRequestCount() {
        return this.analyzedRequestCount;
    }

    /**
     * @return eventCount
     */
    public Long getEventCount() {
        return this.eventCount;
    }

    /**
     * @return handleStatusCounts
     */
    public HandleStatusCounts getHandleStatusCounts() {
        return this.handleStatusCounts;
    }

    /**
     * @return protectedGroupCount
     */
    public Integer getProtectedGroupCount() {
        return this.protectedGroupCount;
    }

    /**
     * @return protectedResourceCount
     */
    public Integer getProtectedResourceCount() {
        return this.protectedResourceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskCounts
     */
    public RiskCounts getRiskCounts() {
        return this.riskCounts;
    }

    public static final class Builder {
        private Long analyzedRequestCount; 
        private Long eventCount; 
        private HandleStatusCounts handleStatusCounts; 
        private Integer protectedGroupCount; 
        private Integer protectedResourceCount; 
        private String requestId; 
        private RiskCounts riskCounts; 

        private Builder() {
        } 

        private Builder(DescribeAiEngineOverviewResponseBody model) {
            this.analyzedRequestCount = model.analyzedRequestCount;
            this.eventCount = model.eventCount;
            this.handleStatusCounts = model.handleStatusCounts;
            this.protectedGroupCount = model.protectedGroupCount;
            this.protectedResourceCount = model.protectedResourceCount;
            this.requestId = model.requestId;
            this.riskCounts = model.riskCounts;
        } 

        /**
         * <p>The number of analyzed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        public Builder analyzedRequestCount(Long analyzedRequestCount) {
            this.analyzedRequestCount = analyzedRequestCount;
            return this;
        }

        /**
         * <p>The number of events within the specified time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder eventCount(Long eventCount) {
            this.eventCount = eventCount;
            return this;
        }

        /**
         * <p>The number of events within the specified time range, categorized by handling status.</p>
         */
        public Builder handleStatusCounts(HandleStatusCounts handleStatusCounts) {
            this.handleStatusCounts = handleStatusCounts;
            return this;
        }

        /**
         * <p>The number of protection groups for which AI Engine is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder protectedGroupCount(Integer protectedGroupCount) {
            this.protectedGroupCount = protectedGroupCount;
            return this;
        }

        /**
         * <p>The number of protected objects for which AI Engine is enabled. This count does not include protected objects that belong to a protection group.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder protectedResourceCount(Integer protectedResourceCount) {
            this.protectedResourceCount = protectedResourceCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1CEE****-019A-8B44-255****F9C2C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of events within the specified time range, categorized by risk level.</p>
         */
        public Builder riskCounts(RiskCounts riskCounts) {
            this.riskCounts = riskCounts;
            return this;
        }

        public DescribeAiEngineOverviewResponseBody build() {
            return new DescribeAiEngineOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineOverviewResponseBody</p>
     */
    public static class HandleStatusCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Handled")
        private Long handled;

        @com.aliyun.core.annotation.NameInMap("Handling")
        private Long handling;

        @com.aliyun.core.annotation.NameInMap("Unhandled")
        private Long unhandled;

        private HandleStatusCounts(Builder builder) {
            this.handled = builder.handled;
            this.handling = builder.handling;
            this.unhandled = builder.unhandled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandleStatusCounts create() {
            return builder().build();
        }

        /**
         * @return handled
         */
        public Long getHandled() {
            return this.handled;
        }

        /**
         * @return handling
         */
        public Long getHandling() {
            return this.handling;
        }

        /**
         * @return unhandled
         */
        public Long getUnhandled() {
            return this.unhandled;
        }

        public static final class Builder {
            private Long handled; 
            private Long handling; 
            private Long unhandled; 

            private Builder() {
            } 

            private Builder(HandleStatusCounts model) {
                this.handled = model.handled;
                this.handling = model.handling;
                this.unhandled = model.unhandled;
            } 

            /**
             * <p>The number of handled events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder handled(Long handled) {
                this.handled = handled;
                return this;
            }

            /**
             * <p>The number of events being handled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder handling(Long handling) {
                this.handling = handling;
                return this;
            }

            /**
             * <p>The number of unhandled events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unhandled(Long unhandled) {
                this.unhandled = unhandled;
                return this;
            }

            public HandleStatusCounts build() {
                return new HandleStatusCounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAiEngineOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineOverviewResponseBody</p>
     */
    public static class RiskCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Long critical;

        @com.aliyun.core.annotation.NameInMap("High")
        private Long high;

        @com.aliyun.core.annotation.NameInMap("Low")
        private Long low;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private Long medium;

        private RiskCounts(Builder builder) {
            this.critical = builder.critical;
            this.high = builder.high;
            this.low = builder.low;
            this.medium = builder.medium;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskCounts create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Long getCritical() {
            return this.critical;
        }

        /**
         * @return high
         */
        public Long getHigh() {
            return this.high;
        }

        /**
         * @return low
         */
        public Long getLow() {
            return this.low;
        }

        /**
         * @return medium
         */
        public Long getMedium() {
            return this.medium;
        }

        public static final class Builder {
            private Long critical; 
            private Long high; 
            private Long low; 
            private Long medium; 

            private Builder() {
            } 

            private Builder(RiskCounts model) {
                this.critical = model.critical;
                this.high = model.high;
                this.low = model.low;
                this.medium = model.medium;
            } 

            /**
             * <p>The number of critical events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder critical(Long critical) {
                this.critical = critical;
                return this;
            }

            /**
             * <p>The number of high-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder high(Long high) {
                this.high = high;
                return this;
            }

            /**
             * <p>The number of low-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder low(Long low) {
                this.low = low;
                return this;
            }

            /**
             * <p>The number of medium-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder medium(Long medium) {
                this.medium = medium;
                return this;
            }

            public RiskCounts build() {
                return new RiskCounts(this);
            } 

        } 

    }
}
