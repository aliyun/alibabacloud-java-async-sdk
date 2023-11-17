// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookMetricsResponseBody</p>
 */
public class DescribePlaybookMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    private Metrics metrics;

    @NameInMap("RequestId")
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
         * Metrics.
         */
        public Builder metrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Active")
        private Integer active;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("FailNum")
        private Integer failNum;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("HistoryMd5")
        private Integer historyMd5;

        @NameInMap("LastRuntime")
        private Long lastRuntime;

        @NameInMap("OwnType")
        private String ownType;

        @NameInMap("PlaybookUuid")
        private String playbookUuid;

        @NameInMap("SuccNum")
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
             * Active.
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * FailNum.
             */
            public Builder failNum(Integer failNum) {
                this.failNum = failNum;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * HistoryMd5.
             */
            public Builder historyMd5(Integer historyMd5) {
                this.historyMd5 = historyMd5;
                return this;
            }

            /**
             * LastRuntime.
             */
            public Builder lastRuntime(Long lastRuntime) {
                this.lastRuntime = lastRuntime;
                return this;
            }

            /**
             * OwnType.
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * PlaybookUuid.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * SuccNum.
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
