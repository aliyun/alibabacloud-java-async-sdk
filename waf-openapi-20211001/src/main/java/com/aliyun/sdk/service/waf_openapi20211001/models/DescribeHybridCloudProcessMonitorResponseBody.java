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
 * {@link DescribeHybridCloudProcessMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudProcessMonitorResponseBody</p>
 */
public class DescribeHybridCloudProcessMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProcessMonitors")
    private java.util.List<ProcessMonitors> processMonitors;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHybridCloudProcessMonitorResponseBody(Builder builder) {
        this.processMonitors = builder.processMonitors;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudProcessMonitorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processMonitors
     */
    public java.util.List<ProcessMonitors> getProcessMonitors() {
        return this.processMonitors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ProcessMonitors> processMonitors; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudProcessMonitorResponseBody model) {
            this.processMonitors = model.processMonitors;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The status of the applications.</p>
         */
        public Builder processMonitors(java.util.List<ProcessMonitors> processMonitors) {
            this.processMonitors = processMonitors;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DBF79169-B6A0-5C8E-86B2-CFE3****496E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHybridCloudProcessMonitorResponseBody build() {
            return new DescribeHybridCloudProcessMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudProcessMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudProcessMonitorResponseBody</p>
     */
    public static class ProcessMonitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Levle")
        private String levle;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private Long processStatus;

        private ProcessMonitors(Builder builder) {
            this.levle = builder.levle;
            this.processName = builder.processName;
            this.processStatus = builder.processStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessMonitors create() {
            return builder().build();
        }

        /**
         * @return levle
         */
        public String getLevle() {
            return this.levle;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return processStatus
         */
        public Long getProcessStatus() {
            return this.processStatus;
        }

        public static final class Builder {
            private String levle; 
            private String processName; 
            private Long processStatus; 

            private Builder() {
            } 

            private Builder(ProcessMonitors model) {
                this.levle = model.levle;
                this.processName = model.processName;
                this.processStatus = model.processStatus;
            } 

            /**
             * Levle.
             */
            public Builder levle(String levle) {
                this.levle = levle;
                return this;
            }

            /**
             * <p>The service that the application provides. Valid values:</p>
             * <ul>
             * <li><strong>tianqingproxy</strong>: centralized management service.</li>
             * <li><strong>redis</strong>: storage service.</li>
             * <li><strong>scc</strong>: traffic calculation service.</li>
             * <li><strong>keeper</strong>: threat intelligence service.</li>
             * <li><strong>node_exporter</strong>: application log upload service.</li>
             * <li><strong>xagent</strong>: traffic detection service.</li>
             * <li><strong>noproxy</strong>: traffic forwarding service.</li>
             * <li><strong>xloge</strong>: attack log upload service.</li>
             * <li><strong>ilogtail</strong>: log collection service.</li>
             * <li><strong>xlogd</strong>: log analysis service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tianqingproxy</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The status of the application. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: abnormal.</li>
             * <li><strong>1</strong>: normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder processStatus(Long processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            public ProcessMonitors build() {
                return new ProcessMonitors(this);
            } 

        } 

    }
}
