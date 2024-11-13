// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDefaultQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>ListDefaultQuotaResponseBody</p>
 */
public class ListDefaultQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List < Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDefaultQuotaResponseBody(Builder builder) {
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDefaultQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return quotas
     */
    public java.util.List < Quotas> getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Quotas> quotas; 
        private String requestId; 

        /**
         * Quotas.
         */
        public Builder quotas(java.util.List < Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDefaultQuotaResponseBody build() {
            return new ListDefaultQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDefaultQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>ListDefaultQuotaResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrentExecution")
        private Integer concurrentExecution;

        @com.aliyun.core.annotation.NameInMap("DailyTasks")
        private Integer dailyTasks;

        @com.aliyun.core.annotation.NameInMap("TotalTemplate")
        private Integer totalTemplate;

        private Quotas(Builder builder) {
            this.concurrentExecution = builder.concurrentExecution;
            this.dailyTasks = builder.dailyTasks;
            this.totalTemplate = builder.totalTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
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

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
