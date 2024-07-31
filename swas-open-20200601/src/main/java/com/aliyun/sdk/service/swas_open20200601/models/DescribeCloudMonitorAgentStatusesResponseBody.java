// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMonitorAgentStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudMonitorAgentStatusesResponseBody</p>
 */
public class DescribeCloudMonitorAgentStatusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStatusList")
    private java.util.List < InstanceStatusList> instanceStatusList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudMonitorAgentStatusesResponseBody(Builder builder) {
        this.instanceStatusList = builder.instanceStatusList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMonitorAgentStatusesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatusList
     */
    public java.util.List < InstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceStatusList> instanceStatusList; 
        private String requestId; 

        /**
         * Indicates whether the Cloud Monitor agent was automatically installed on the simple application server.
         */
        public Builder instanceStatusList(java.util.List < InstanceStatusList> instanceStatusList) {
            this.instanceStatusList = instanceStatusList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudMonitorAgentStatusesResponseBody build() {
            return new DescribeCloudMonitorAgentStatusesResponseBody(this);
        } 

    } 

    public static class InstanceStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoInstall")
        private Boolean autoInstall;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceStatusList(Builder builder) {
            this.autoInstall = builder.autoInstall;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatusList create() {
            return builder().build();
        }

        /**
         * @return autoInstall
         */
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean autoInstall; 
            private String instanceId; 
            private String status; 

            /**
             * Indicates whether the Cloud Monitor agent was automatically installed on the simple application server. Valid values:
             * <p>
             * 
             * - true
             * - false
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * The ID of the simple application server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The running status of the Cloud Monitoring plug-in. Possible values are:
             * <p>
             * 
             * - running: Cloud Monitoring plug-in running.
             * - stopped: Cloud Monitoring plug-in stopped.
             * - installing: Cloud Monitoring plug-in installing.
             * - install_faild: Cloud Monitoring plug-in installation failed.
             * - abnormal: Cloud Monitoring plug-in installation abnormal.
             * - not_installed: Cloud Monitoring plug-in not installed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceStatusList build() {
                return new InstanceStatusList(this);
            } 

        } 

    }
}
