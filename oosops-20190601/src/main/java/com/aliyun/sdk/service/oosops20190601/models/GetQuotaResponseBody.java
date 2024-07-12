// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaResponseBody</p>
 */
public class GetQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private GetQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private Quota quota; 
        private String requestId; 
        private String uid; 

        /**
         * Quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
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
         * Uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetQuotaResponseBody build() {
            return new GetQuotaResponseBody(this);
        } 

    } 

    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrentExecution")
        private Integer concurrentExecution;

        @com.aliyun.core.annotation.NameInMap("DailyTasks")
        private Integer dailyTasks;

        @com.aliyun.core.annotation.NameInMap("TotalTemplate")
        private Integer totalTemplate;

        private Quota(Builder builder) {
            this.concurrentExecution = builder.concurrentExecution;
            this.dailyTasks = builder.dailyTasks;
            this.totalTemplate = builder.totalTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return concurrentExecution
         */
        public Integer getConcurrentExecution() {
            return this.concurrentExecution;
        }

        /**
         * @return dailyTasks
         */
        public Integer getDailyTasks() {
            return this.dailyTasks;
        }

        /**
         * @return totalTemplate
         */
        public Integer getTotalTemplate() {
            return this.totalTemplate;
        }

        public static final class Builder {
            private Integer concurrentExecution; 
            private Integer dailyTasks; 
            private Integer totalTemplate; 

            /**
             * ConcurrentExecution.
             */
            public Builder concurrentExecution(Integer concurrentExecution) {
                this.concurrentExecution = concurrentExecution;
                return this;
            }

            /**
             * DailyTasks.
             */
            public Builder dailyTasks(Integer dailyTasks) {
                this.dailyTasks = dailyTasks;
                return this;
            }

            /**
             * TotalTemplate.
             */
            public Builder totalTemplate(Integer totalTemplate) {
                this.totalTemplate = totalTemplate;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
