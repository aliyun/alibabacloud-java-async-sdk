// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribePluginSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePluginSummaryResponseBody</p>
 */
public class DescribePluginSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePluginSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePluginSummaryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the plug-in data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePluginSummaryResponseBody build() {
            return new DescribePluginSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePluginSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginSummaryResponseBody</p>
     */
    public static class FailedReasons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private FailedReasons(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedReasons create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String code; 
            private Integer count; 
            private String reason; 

            private Builder() {
            } 

            private Builder(FailedReasons model) {
                this.code = model.code;
                this.count = model.count;
                this.reason = model.reason;
            } 

            /**
             * <p>The error code for the installation failure.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The number of hosts on which the installation failed for this reason.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The cause of the installation failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Other</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public FailedReasons build() {
                return new FailedReasons(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePluginSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedCnt")
        private Integer failedCnt;

        @com.aliyun.core.annotation.NameInMap("FailedReasons")
        private java.util.List<FailedReasons> failedReasons;

        @com.aliyun.core.annotation.NameInMap("OfflineCnt")
        private Integer offlineCnt;

        @com.aliyun.core.annotation.NameInMap("OnlineCnt")
        private Integer onlineCnt;

        @com.aliyun.core.annotation.NameInMap("SwitchOffCnt")
        private Integer switchOffCnt;

        @com.aliyun.core.annotation.NameInMap("TotalCnt")
        private Integer totalCnt;

        private Data(Builder builder) {
            this.failedCnt = builder.failedCnt;
            this.failedReasons = builder.failedReasons;
            this.offlineCnt = builder.offlineCnt;
            this.onlineCnt = builder.onlineCnt;
            this.switchOffCnt = builder.switchOffCnt;
            this.totalCnt = builder.totalCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedCnt
         */
        public Integer getFailedCnt() {
            return this.failedCnt;
        }

        /**
         * @return failedReasons
         */
        public java.util.List<FailedReasons> getFailedReasons() {
            return this.failedReasons;
        }

        /**
         * @return offlineCnt
         */
        public Integer getOfflineCnt() {
            return this.offlineCnt;
        }

        /**
         * @return onlineCnt
         */
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        /**
         * @return switchOffCnt
         */
        public Integer getSwitchOffCnt() {
            return this.switchOffCnt;
        }

        /**
         * @return totalCnt
         */
        public Integer getTotalCnt() {
            return this.totalCnt;
        }

        public static final class Builder {
            private Integer failedCnt; 
            private java.util.List<FailedReasons> failedReasons; 
            private Integer offlineCnt; 
            private Integer onlineCnt; 
            private Integer switchOffCnt; 
            private Integer totalCnt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedCnt = model.failedCnt;
                this.failedReasons = model.failedReasons;
                this.offlineCnt = model.offlineCnt;
                this.onlineCnt = model.onlineCnt;
                this.switchOffCnt = model.switchOffCnt;
                this.totalCnt = model.totalCnt;
            } 

            /**
             * <p>The number of hosts on which the plug-in failed to be installed.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder failedCnt(Integer failedCnt) {
                this.failedCnt = failedCnt;
                return this;
            }

            /**
             * <p>The causes of installation failures.</p>
             */
            public Builder failedReasons(java.util.List<FailedReasons> failedReasons) {
                this.failedReasons = failedReasons;
                return this;
            }

            /**
             * <p>The number of hosts on which the plug-in is offline.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder offlineCnt(Integer offlineCnt) {
                this.offlineCnt = offlineCnt;
                return this;
            }

            /**
             * <p>The number of hosts on which the plug-in is online.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder onlineCnt(Integer onlineCnt) {
                this.onlineCnt = onlineCnt;
                return this;
            }

            /**
             * <p>The number of hosts for which the plug-in is not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder switchOffCnt(Integer switchOffCnt) {
                this.switchOffCnt = switchOffCnt;
                return this;
            }

            /**
             * <p>The total number of hosts.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalCnt(Integer totalCnt) {
                this.totalCnt = totalCnt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
