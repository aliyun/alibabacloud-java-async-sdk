// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeCloudMonitorAgentStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudMonitorAgentStatusesResponseBody</p>
 */
public class DescribeCloudMonitorAgentStatusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStatusList")
    private java.util.List<InstanceStatusList> instanceStatusList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceStatusList
     */
    public java.util.List<InstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceStatusList> instanceStatusList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCloudMonitorAgentStatusesResponseBody model) {
            this.instanceStatusList = model.instanceStatusList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the Cloud Monitor agent was automatically installed on the simple application server.</p>
         */
        public Builder instanceStatusList(java.util.List<InstanceStatusList> instanceStatusList) {
            this.instanceStatusList = instanceStatusList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E1FEE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudMonitorAgentStatusesResponseBody build() {
            return new DescribeCloudMonitorAgentStatusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudMonitorAgentStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudMonitorAgentStatusesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InstanceStatusList model) {
                this.autoInstall = model.autoInstall;
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * <p>Indicates whether the Cloud Monitor agent was automatically installed on the simple application server. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * <p>The ID of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>c854dc6f07e74953830bb5808d0****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The running status of the Cloud Monitoring plug-in. Possible values are:</p>
             * <ul>
             * <li>running: Cloud Monitoring plug-in running.</li>
             * <li>stopped: Cloud Monitoring plug-in stopped.</li>
             * <li>installing: Cloud Monitoring plug-in installing.</li>
             * <li>install_faild: Cloud Monitoring plug-in installation failed.</li>
             * <li>abnormal: Cloud Monitoring plug-in installation abnormal.</li>
             * <li>not_installed: Cloud Monitoring plug-in not installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
