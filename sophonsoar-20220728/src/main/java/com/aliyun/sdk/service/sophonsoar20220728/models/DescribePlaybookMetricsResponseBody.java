// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePlaybookMetricsResponseBody model) {
            this.metrics = model.metrics;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the playbook.</p>
         */
        public Builder metrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>567D3D0B-2153-5860-BF9A-F9DEED55FB73</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookMetricsResponseBody build() {
            return new DescribePlaybookMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlaybookMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybookMetricsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.active = model.active;
                this.description = model.description;
                this.displayName = model.displayName;
                this.failNum = model.failNum;
                this.gmtCreate = model.gmtCreate;
                this.historyMd5 = model.historyMd5;
                this.lastRuntime = model.lastRuntime;
                this.ownType = model.ownType;
                this.playbookUuid = model.playbookUuid;
                this.succNum = model.succNum;
            } 

            /**
             * <p>The status of the playbook. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>0</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The description of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a playbook for waf processing</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>demo name</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The number of the tasks that are created for the playbook and failed to run.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder failNum(Integer failNum) {
                this.failNum = failNum;
                return this;
            }

            /**
             * <p>The time when the playbook was created. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1655277397000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The number of historical versions of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder historyMd5(Integer historyMd5) {
                this.historyMd5 = historyMd5;
                return this;
            }

            /**
             * <p>The time when the playbook was last run. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1683526277415</p>
             */
            public Builder lastRuntime(Long lastRuntime) {
                this.lastRuntime = lastRuntime;
                return this;
            }

            /**
             * <p>The type of the playbook. Valid values:</p>
             * <ul>
             * <li><strong>preset</strong>: predefined playbook</li>
             * <li><strong>user</strong>: custom playbook</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * <p>The UUID of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>0fbc9bdb-9ae3-4ef4-a709-xxxxx</p>
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * <p>The number of the tasks that are created for the playbook and were successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
