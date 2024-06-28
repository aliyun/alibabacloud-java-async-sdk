// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookMetricsResponseBody</p>
 */
public class DescribePlaybookMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private Metrics metrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlaybookMetricsResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metrics
     */
    public Metrics getMetrics() {
        return this.metrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Metrics metrics; 
        private String requestId; 

        /**
         * The details of the playbook.
         */
        public Builder metrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookMetricsResponseBody build() {
            return new DescribePlaybookMetricsResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Integer active;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FailNum")
        private Integer failNum;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("HistoryMd5")
        private Integer historyMd5;

        @com.aliyun.core.annotation.NameInMap("LastRuntime")
        private Long lastRuntime;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private String ownType;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        @com.aliyun.core.annotation.NameInMap("SuccNum")
        private Integer succNum;

        private Metrics(Builder builder) {
            this.active = builder.active;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.failNum = builder.failNum;
            this.gmtCreate = builder.gmtCreate;
            this.historyMd5 = builder.historyMd5;
            this.lastRuntime = builder.lastRuntime;
            this.ownType = builder.ownType;
            this.playbookUuid = builder.playbookUuid;
            this.succNum = builder.succNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Integer getActive() {
            return this.active;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return failNum
         */
        public Integer getFailNum() {
            return this.failNum;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return historyMd5
         */
        public Integer getHistoryMd5() {
            return this.historyMd5;
        }

        /**
         * @return lastRuntime
         */
        public Long getLastRuntime() {
            return this.lastRuntime;
        }

        /**
         * @return ownType
         */
        public String getOwnType() {
            return this.ownType;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        /**
         * @return succNum
         */
        public Integer getSuccNum() {
            return this.succNum;
        }

        public static final class Builder {
            private Integer active; 
            private String description; 
            private String displayName; 
            private Integer failNum; 
            private Long gmtCreate; 
            private Integer historyMd5; 
            private Long lastRuntime; 
            private String ownType; 
            private String playbookUuid; 
            private Integer succNum; 

            /**
             * The status of the playbook. Valid values:
             * <p>
             * 
             * *   **1**: enabled
             * *   **0**: disabled
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * The description of the playbook.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the playbook.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The number of the tasks that are created for the playbook and failed to run.
             */
            public Builder failNum(Integer failNum) {
                this.failNum = failNum;
                return this;
            }

            /**
             * The time when the playbook was created. The value is a 13-digit timestamp.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The number of historical versions of the playbook.
             */
            public Builder historyMd5(Integer historyMd5) {
                this.historyMd5 = historyMd5;
                return this;
            }

            /**
             * The time when the playbook was last run. The value is a 13-digit timestamp.
             */
            public Builder lastRuntime(Long lastRuntime) {
                this.lastRuntime = lastRuntime;
                return this;
            }

            /**
             * The type of the playbook. Valid values:
             * <p>
             * 
             * *   **preset**: predefined playbook
             * *   **user**: custom playbook
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * The UUID of the playbook.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * The number of the tasks that are created for the playbook and were successfully run.
             */
            public Builder succNum(Integer succNum) {
                this.succNum = succNum;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
