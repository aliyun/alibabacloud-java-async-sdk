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
 * {@link GetInstanceAlarmStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceAlarmStatisticsResponseBody</p>
 */
public class GetInstanceAlarmStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceAlarmStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceAlarmStatisticsResponseBody create() {
        return builder().build();
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

        /**
         * <p>Data structure.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>阿里云为该请求生成的唯一标识符。</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceAlarmStatisticsResponseBody build() {
            return new GetInstanceAlarmStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceAlarmStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceAlarmStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemindCount")
        private Integer remindCount;

        @com.aliyun.core.annotation.NameInMap("SeriousCount")
        private Integer seriousCount;

        @com.aliyun.core.annotation.NameInMap("SuspiciousCount")
        private Integer suspiciousCount;

        private Data(Builder builder) {
            this.remindCount = builder.remindCount;
            this.seriousCount = builder.seriousCount;
            this.suspiciousCount = builder.suspiciousCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return remindCount
         */
        public Integer getRemindCount() {
            return this.remindCount;
        }

        /**
         * @return seriousCount
         */
        public Integer getSeriousCount() {
            return this.seriousCount;
        }

        /**
         * @return suspiciousCount
         */
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        public static final class Builder {
            private Integer remindCount; 
            private Integer seriousCount; 
            private Integer suspiciousCount; 

            /**
             * <p>Reminder alarm count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder remindCount(Integer remindCount) {
                this.remindCount = remindCount;
                return this;
            }

            /**
             * <p>Critical alarm count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder seriousCount(Integer seriousCount) {
                this.seriousCount = seriousCount;
                return this;
            }

            /**
             * <p>Suspicious alarm count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder suspiciousCount(Integer suspiciousCount) {
                this.suspiciousCount = suspiciousCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
