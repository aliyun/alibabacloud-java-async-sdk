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
 * {@link DescribeHybridCloudBasicMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudBasicMonitorResponseBody</p>
 */
public class DescribeHybridCloudBasicMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasicMonitors")
    private java.util.List<BasicMonitors> basicMonitors;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHybridCloudBasicMonitorResponseBody(Builder builder) {
        this.basicMonitors = builder.basicMonitors;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudBasicMonitorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basicMonitors
     */
    public java.util.List<BasicMonitors> getBasicMonitors() {
        return this.basicMonitors;
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
        private java.util.List<BasicMonitors> basicMonitors; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudBasicMonitorResponseBody model) {
            this.basicMonitors = model.basicMonitors;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The basic metrics.</p>
         */
        public Builder basicMonitors(java.util.List<BasicMonitors> basicMonitors) {
            this.basicMonitors = basicMonitors;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B8AF42B-16A9-5762-AEF3-D148****FE5D</p>
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

        public DescribeHybridCloudBasicMonitorResponseBody build() {
            return new DescribeHybridCloudBasicMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudBasicMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudBasicMonitorResponseBody</p>
     */
    public static class BasicMonitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Levle")
        private String levle;

        @com.aliyun.core.annotation.NameInMap("MonitorName")
        private String monitorName;

        @com.aliyun.core.annotation.NameInMap("UseRatio")
        private Long useRatio;

        private BasicMonitors(Builder builder) {
            this.levle = builder.levle;
            this.monitorName = builder.monitorName;
            this.useRatio = builder.useRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicMonitors create() {
            return builder().build();
        }

        /**
         * @return levle
         */
        public String getLevle() {
            return this.levle;
        }

        /**
         * @return monitorName
         */
        public String getMonitorName() {
            return this.monitorName;
        }

        /**
         * @return useRatio
         */
        public Long getUseRatio() {
            return this.useRatio;
        }

        public static final class Builder {
            private String levle; 
            private String monitorName; 
            private Long useRatio; 

            private Builder() {
            } 

            private Builder(BasicMonitors model) {
                this.levle = model.levle;
                this.monitorName = model.monitorName;
                this.useRatio = model.useRatio;
            } 

            /**
             * Levle.
             */
            public Builder levle(String levle) {
                this.levle = levle;
                return this;
            }

            /**
             * <p>The metric. Valid values:</p>
             * <ul>
             * <li><strong>basic_monitor_cpu_usage</strong>: the CPU.</li>
             * <li><strong>basic_monitor_memory_usage</strong>: the memory.</li>
             * <li><strong>basic_monitor_disk_usage</strong>: the disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>basic_monitor_cpu_usage</p>
             */
            public Builder monitorName(String monitorName) {
                this.monitorName = monitorName;
                return this;
            }

            /**
             * <p>The resource usage.</p>
             * 
             * <strong>example:</strong>
             * <p>5.905694</p>
             */
            public Builder useRatio(Long useRatio) {
                this.useRatio = useRatio;
                return this;
            }

            public BasicMonitors build() {
                return new BasicMonitors(this);
            } 

        } 

    }
}
